/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author ok
 */
public class User implements Serializable, RowMapper<User> {

    private Integer id;
    private String username;
    private String userpass;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Integer active = 1;

    public User() {
    }

    public User(Integer id, String username, String userpass) {
        this.id = id;
        this.username = username;
        this.userpass = userpass;
    }

    public User(String username, String userpass) {
        this.username = username;
        this.userpass = userpass;
    }

    public User(Integer id, String username, String userpass, Timestamp createdAt, Timestamp updatedAt, Integer active) {
        this.id = id;
        this.username = username;
        this.userpass = userpass;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User u = new User();
        u.setId(rs.getInt("id"));
        u.setUsername(rs.getString("username"));
        u.setUserpass(rs.getString("userpass"));
        u.setCreatedAt(rs.getTimestamp("created_at"));
        u.setUpdatedAt(rs.getTimestamp("updated_at"));
        u.setActive(rs.getInt("active"));
        return u;
    }

}
