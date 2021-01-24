/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.main;

import com.evs.javaspring54.config.ContextConfig;
import com.evs.javaspring54.model.FirstBean;
import com.evs.javaspring54.model.SecondBean;
import static com.evs.javaspring54.util.SystemPrintUtils.println;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 *
 * @author ok
 */
public class ConfigMain {
    
    public static void main(String[] args) {
        AbstractApplicationContext context = 
                new AnnotationConfigApplicationContext(ContextConfig.class) ;
        
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
