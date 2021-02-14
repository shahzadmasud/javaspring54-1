/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.dao;

import com.evs.javaspring54.model.User;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author ok
 */
public interface UserDao {
    
    public String query = "SELECT "
            + "id, username, userpass, created_at, updated_at, active "
            + "FROM user ";
    
    // Database 
    public void setDataSource ( DataSource ds ) ;
    
    // Create
    public boolean create( User user) ;
    
    // Read
    public User get ( Integer id) ;
    
    // Read All
    public List<User> all() ;
    
    // Update
    public boolean update ( User user ) ;
    
    // Delete
    public boolean delete ( Integer id ) ;
    
    // Validate
    public User validate ( String username, String userpass) ;
    
}
