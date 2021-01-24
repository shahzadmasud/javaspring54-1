/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.config;

import com.evs.javaspring54.model.FirstBean;
import com.evs.javaspring54.model.SecondBean;
import java.io.File;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ok
 */
@Configuration
@ComponentScan(basePackages = "com.evs.javaspring54.model")
public class ContextConfig {

//    <bean id="firstbean" class="com.evs.javaspring54.model.FirstBean" />
    @Bean(name = "firstbean")
    public FirstBean firstBean() {
        FirstBean firstBean = new FirstBean();
        return firstBean;
    }

//    <bean id="firstbeanWithIdName" class="com.evs.javaspring54.model.FirstBean">
//        <property name="id" value="11" />
//        <property name="name" value="first" />
//    </bean>    
    @Bean(name = "firstbeanWithIdName")
    public FirstBean firstbeanWithIdName() {
        FirstBean firstbeanWithIdName = new FirstBean();
        firstbeanWithIdName.setId(11);
        firstbeanWithIdName.setName("first");
        return firstbeanWithIdName;
    }
    
//    <!--
//        FirstBean firstbeanWithConstructor =
//            new FirstBean (111, "Constructor");
//    -->
//    <bean id="firstbeanWithConstructor" class="com.evs.javaspring54.model.FirstBean">
//        <constructor-arg
//            index="0"
//            type="java.lang.Integer"
//            value="111"
//            />
//        <constructor-arg
//            index="1"
//            type="java.lang.String"
//            value="Constructor"
//            />
//    </bean>
    @Bean (name="firstbeanWithConstructor")
    public FirstBean firstbeanWithConstructor(){
        return new FirstBean (111, "Constructor");
    }
//    <bean   
//        id="outputFolder"
//        class="java.io.File" >
//        <constructor-arg 
//            index="0"
//            type="java.lang.String"
//            value="e:/outputfolder"
//        />
//    </bean>
    @Bean(name="outputFolder")
    public File outputFolder() {
        return new File ( "f:/outputfolder") ;
    }
    
//    <bean id="child" class="com.evs.javaspring54.model.SecondBean" >
//        <property name="id" value="222" />
//        <property name="name" value="child" />
//    </bean>
    @Bean(name="child")
    public SecondBean child() {
        SecondBean child = new SecondBean();
        child.setId(2111);
        child.setName("child");
        return child;
    }

//    
//    <bean id="secondBean" class="com.evs.javaspring54.model.SecondBean" >
//        <property name="id" value="22" />
//        <property name="name" value="second" />
//    </bean>
    @Bean(name="secondBean")
    public SecondBean secondBean() {
        SecondBean secondBean = new SecondBean();
        secondBean.setId(22);
        secondBean.setName("second");
        return secondBean;
    }
//    <bean id="firstbeanWithChild" class="com.evs.javaspring54.model.FirstBean">
//        <property name="id" value="12" />
//        <property name="name" value="firstWithChild" />
//<!--        <property name="child" ref="secondBean" />-->
//    </bean>
    @Bean(name = "firstbeanWithChild")
    public FirstBean firstbeanWithChild() {
        FirstBean firstbeanWithChild = new FirstBean();
        firstbeanWithChild.setId(11);
        firstbeanWithChild.setName("first");
        firstbeanWithChild.setChild(secondBean());
        return firstbeanWithChild;
    }
//    
//    <bean id="firstbeanWithChildFolder" class="com.evs.javaspring54.model.FirstBean">
//        <property name="id" value="13" />
//        <property name="name" value="firstWithChildFolder" />
//<!--        <property name="child" ref="secondBean" />-->
//<!--        <property name="outputFolder" ref="outputFolder" />-->
//    </bean>
    @Bean(name = "firstbeanWithChildFolder")
    public FirstBean firstbeanWithChildFolder() {
        FirstBean firstbeanWithChildFolder = new FirstBean();
        firstbeanWithChildFolder.setId(11);
        firstbeanWithChildFolder.setName("first");
        firstbeanWithChildFolder.setChild(secondBean());
        firstbeanWithChildFolder.setOutputFolder(outputFolder());
        return firstbeanWithChildFolder;
    }

}
