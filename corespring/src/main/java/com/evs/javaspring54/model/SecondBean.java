/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.model;

import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author ok
 */
public class SecondBean implements InitializingBean {

    private Integer id;
    private String name;

    public SecondBean() {
    }

    public SecondBean(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "SecondBean{" + "id=" + id + ", name=" + name + '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("---> after properties <--- ");
    }

}
