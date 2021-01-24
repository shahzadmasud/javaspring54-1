/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.main;

import com.evs.javaspring54.model.FirstBean;
import com.evs.javaspring54.model.SecondBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static com.evs.javaspring54.util.SystemPrintUtils.* ;
/**
 *
 * @author ok
 */
public class XmlMain {

    public static void main(String[] args) {
        AbstractApplicationContext context
                = new ClassPathXmlApplicationContext("SpringConfig.xml");

        FirstBean first = (FirstBean) context.getBean("firstbean");
        println(first) ;
        
        FirstBean firstbeanWithIdName = (FirstBean) context.getBean("firstbeanWithIdName");
        println(firstbeanWithIdName) ;
        
        FirstBean firstbeanWithConstructor = (FirstBean) context.getBean("firstbeanWithConstructor");
        println(firstbeanWithConstructor) ;
        
        SecondBean secondBean = (SecondBean) context.getBean("secondBean");
        println(secondBean) ;
   
        FirstBean firstbeanWithChild = (FirstBean) context.getBean("firstbeanWithChild");
        println(firstbeanWithChild) ;
        
        FirstBean firstbeanWithChildFolder = (FirstBean) context.getBean("firstbeanWithChildFolder");
        println(firstbeanWithChildFolder) ;
        
        
        
        
        
        
    }

}
