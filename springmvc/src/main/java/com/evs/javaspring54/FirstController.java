/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ok
 */
@Controller
public class FirstController {

    @RequestMapping("/index.htm")
    public ModelAndView index(
            @RequestParam(name = "pass", required = false) String pass,
            @RequestParam(name = "fail", required = false) String fail
    ) {
        Map<String, Object> map
                = new HashMap<>();
        // Pass 
        if (pass != null && pass.trim().length() > 0) {
            map.put("pass", pass);
        }
        // Fail
        if (fail != null && fail.trim().length() > 0) {
            map.put("fail", fail);
        }
        return new ModelAndView("index",
                "map", map);
//                "first", new java.util.Date(System.currentTimeMillis()).toString());
    }

    @RequestMapping("/login.htm")
    public ModelAndView login(
            @RequestParam(name = "username") String username,
            @RequestParam(name = "userpass") String userpass
    ) {
        if ("admin".equals(username)
                && "admin".equals(userpass)) {
            // Valid User
            return home();
        } else {
            return index(null, "Invalid combination");
        }
    }

    @RequestMapping("/home.htm")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @RequestMapping("/logout.htm")
    public ModelAndView logout() {
        return index("User Logged Out successfully !!! ", null);
    }

}
