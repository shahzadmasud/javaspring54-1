/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.hibernate;

import com.evs.javaspring54.dao.UserDao;
import com.evs.javaspring54.model.User;
import com.evs.javaspring54.model.UserModel;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ok
 */
public class UserHibernateDao implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void setDataSource(DataSource ds) {
        // Nothing
    }

    @Override
    public boolean create(User user) {
        boolean ret = false;
        Session session = sessionFactory.openSession();
        UserModel um = user.clone();
        um.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        ret = session.save(um) != null;
        session.close();
        return ret;
    }

    @Override
    public User get(Integer id) {
        Session session = sessionFactory.openSession();
        UserModel um = (UserModel) session.get(UserModel.class, id);
        session.close();
        return um != null ? um.clone() : null;
    }

    @Override
    public List<User> all() {
        Session session = sessionFactory.openSession();
        List<UserModel> um = session.createQuery("from UserModel").list();
        session.close();
        List<User> all = new ArrayList<>();
        for (UserModel u : um) {
            all.add(u.clone());
        }
        return all;
    }

    @Override
    public boolean update(User user) {
        boolean ret = false;
        Session session = sessionFactory.openSession();
        UserModel um = (UserModel) session.get(UserModel.class, user.getId());
        if (um != null) {
            um.setUsername(user.getUsername());
            um.setUserpass(user.getUserpass());
            um.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            um.setActive(user.getActive());

            session.saveOrUpdate(um);
            session.flush(); // Not Recommended
            ret = true;
        }
        session.close();
        return ret;
    }

    @Override
    public boolean delete(Integer id) {
        boolean ret = false;
        Session session = sessionFactory.openSession();
        UserModel um = (UserModel) session.get(UserModel.class, id);
        if (um != null) {
            session.delete(um);
            session.flush(); // Not recommended
            ret = true;
        }
        session.close();
        return ret;
    }

    @Override
    public User validate(String username, String userpass) {
        
        // Option 1 = Criteria
//        Session session = sessionFactory.openSession() ;
//        Criteria criteria = session.createCriteria(UserModel.class) ;
//        criteria.add(Restrictions.eq("username", username)) ;
//        criteria.add(Restrictions.eq("userpass", userpass)) ;
//        List<UserModel> results = criteria.list() ;
//        session.close() ;
//        return results.size() > 0 ? results.get(0).clone(): null ;
        
        // Option 2 = Query
        Session session = sessionFactory.openSession();
        String sql = query + " WHERE username=:username AND "
                + "userpass=:userpass" ;
        SQLQuery query = session.createSQLQuery(sql) ;
        query.addEntity(UserModel.class) ;
        query.setParameter("username", username) ;
        query.setParameter("userpass", userpass) ;
        List<UserModel> results = query.list() ;
        session.close() ;
        return results.size() > 0 ? results.get(0).clone(): null ;
    }

}
