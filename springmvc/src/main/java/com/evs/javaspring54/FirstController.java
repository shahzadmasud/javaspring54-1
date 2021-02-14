/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54;

import com.evs.javaspring54.dao.UserDao;
import com.evs.javaspring54.model.User;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ok
 */
@Controller
public class FirstController {

    @Autowired
    private UserDao userTemplate;

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
            @RequestParam(name = "userpass") String userpass,
            HttpServletRequest request
    ) {
        User user = userTemplate.validate(username, userpass);
//        if ("admin".equals(username)
//                && "admin".equals(userpass)) {
        if (user != null) {
            // Valid User
            request.getSession().setAttribute("user", user);
            return home("User Logged in Successfully", null);
        } else {
            return index(null, "Invalid combination");
        }
    }

    @RequestMapping("/home.htm")
    public ModelAndView home(
            @RequestParam(name = "pass", required = false) String pass,
            @RequestParam(name = "fail", required = false) String fail
    ) {
        Map<String, Object> map
                = new HashMap<>();

        // All Users
        map.put("all", userTemplate.all());

        // Pass 
        if (pass != null && pass.trim().length() > 0) {
            map.put("pass", pass);
        }
        // Fail
        if (fail != null && fail.trim().length() > 0) {
            map.put("fail", fail);
        }
        return new ModelAndView("home",
                "map", map);
//        return new ModelAndView("home");
    }

    @RequestMapping(value = {"/useradd.htm"}, method = {RequestMethod.GET})
    public ModelAndView userAddGet() {
        Map<String, Object> map
                = new HashMap<>();
        return new ModelAndView("useradd", "map", map);
    }

    @RequestMapping(value = {"/useradd.htm"}, method = {RequestMethod.POST})
    public ModelAndView userAddPost(
            @RequestParam(name = "username", required = true) String username,
            @RequestParam(name = "userpass", required = true) String userpass
    ) {
        User user = new User(username, userpass);
        String pass = null, fail = null;
        boolean insert = userTemplate.create(user);
        if (insert) {
            pass = "User registered successfully !!! ";
        } else {
            fail = "Unable to insert user ... ";
        }
        return home(pass, fail);
    }

    @RequestMapping(value = {"/userupd.htm"}, method = {RequestMethod.GET})
    public ModelAndView userUpdGet(
            @RequestParam(name = "id") String id
    ) {
        User user = userTemplate.get(Integer.parseInt(id));
        Map<String, Object> map
                = new HashMap<>();
        if (user != null) {
            map.put("user", user);
            return new ModelAndView("userupd", "map", map);
        } else {
            return home(null, "Invalid id for user update ");
        }

    }

    @RequestMapping(value = {"/userupd.htm"}, method = {RequestMethod.POST})
    public ModelAndView userUpdPost(
            @RequestParam(name = "id", required = true) String id,
            @RequestParam(name = "username", required = true) String username,
            @RequestParam(name = "userpass", required = true) String userpass
    ) {
        User user = new User(Integer.parseInt(id), username, userpass);
        boolean update = userTemplate.update(user);
        return home(
                update ? "User updated successfully !!! " : null,
                update ? null : "Unable to update user ..."
        );
    }

    @RequestMapping(value = {"/userdel.htm"}, method = {RequestMethod.POST})
    public ModelAndView userDelPost(
            @RequestParam(name = "id", required = true) String id
    ) {
        boolean update = userTemplate.delete(Integer.parseInt(id));
        return home(
                update ? "User deleted successfully !!! " : null,
                update ? null : "Unable to deleted user ..."
        );
    }

    @RequestMapping("/logout.htm")
    public ModelAndView logout( HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return index("User Logged Out successfully !!! ", null);
    }

}
