/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.template;

import com.evs.javaspring54.dao.UserDao;
import com.evs.javaspring54.model.User;
import java.sql.Timestamp;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author ok
 */
public class UserJdbcTemplate implements UserDao {

    private DataSource datasource;

    private JdbcTemplate template;

    @Override
    public void setDataSource(DataSource ds) {
        this.datasource = ds;
        this.template = new JdbcTemplate(this.datasource);
    }

    @Override
    public boolean create(User user) {
        // Create 
        String sql = "INSERT INTO user (username, userpass) "
                + "VALUES (?,?)";
        int ret = template.update(sql,
                user.getUsername(), user.getUserpass());
        return ret > 0;
    }

    @Override
    public User get(Integer id) {
        String sql = query + " WHERE id=?";
        User user = null;
        try {
            user = template.queryForObject(
                    sql, // SQL
                    new User(), // Row Mapper
                    id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> all() {
        return template.query(query, new User());
    }

    @Override
    public boolean update(User user) {
        // Create 
        String sql = "UPDATE user "
                + "set username=?, userpass=?,"
                + "updated_at=?, active=? "
                + "WHERE id=?";
        int ret = template.update(sql,
                user.getUsername(), user.getUserpass(),
                new Timestamp(System.currentTimeMillis()),
                user.getActive(), user.getId());
        return ret > 0;
    }

    @Override
    public boolean delete(Integer id) {
        // Create 
        String sql = "DELETE FROM user WHERE id=?";
        int ret = template.update(sql, id);
        return ret > 0;
    }

    @Override
    public User validate(String username, String userpass) {
        String sql = query + " WHERE username=? and userpass=?";
        User user = null;
        try {
            user = template.queryForObject(
                    sql, // SQL
                    new User(), // Row Mapper
                    username, userpass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}
