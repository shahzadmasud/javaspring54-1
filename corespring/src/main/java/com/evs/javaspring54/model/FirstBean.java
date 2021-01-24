/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.model;

import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ok
 */
public class FirstBean {

    private Integer id;
    private String name;

    @Autowired
    private SecondBean child;
    @Autowired
    private File outputFolder;

    public FirstBean() {
    }

    public FirstBean(Integer id, String name) {
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

    public SecondBean getChild() {
        return child;
    }

    public void setChild(SecondBean child) {
        this.child = child;
    }

    public File getOutputFolder() {
        return outputFolder;
    }

    public void setOutputFolder(File outputFolder) {
        this.outputFolder = outputFolder;
    }

    @Override
    public String toString() {
        return "FirstBean{" + "id=" + id + ", name=" + name + ", child=" + child + ", outputFolder=" + outputFolder + '}';
    }

}
