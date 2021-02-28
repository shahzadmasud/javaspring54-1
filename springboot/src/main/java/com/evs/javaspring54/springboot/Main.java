/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ok
 */
@Controller
@EnableAsync
@SpringBootApplication
public class Main {

    @GetMapping("/")
    private String home() {
        return "redirect:/swagger-ui.html" ;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    
}
