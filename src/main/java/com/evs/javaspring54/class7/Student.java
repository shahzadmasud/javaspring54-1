/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class7;

import com.evs.javaspring54.class2.SystemPrintUtils;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author ok
 */
public class Student implements Serializable {

    private Integer id;
    private String name;
    private Boolean active;
    private Timestamp createdAt;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", active=" + active + ", createdAt=" + createdAt + '}';
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.active = true;
        this.createdAt = SystemPrintUtils.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

}
