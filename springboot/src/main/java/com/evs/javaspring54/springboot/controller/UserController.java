/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.springboot.controller;

import com.evs.javaspring54.springboot.model.Role;
import com.evs.javaspring54.springboot.repository.UserRepository;
import com.evs.javaspring54.springboot.model.User;
import com.evs.javaspring54.springboot.repository.RoleRepository;
import java.sql.Timestamp;
import java.util.Optional;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ok
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/user/all")
    public Iterable<User> allUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user/create")
    public Optional<User> create(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "userpass") String userpass,
            @RequestParam(value = "role_id") Long roleId
    ) {
        Optional<Role> r = roleRepository.findById(roleId);
        if (r.isPresent()) {
            Optional<User> a = userRepository.findUserByUsername(username);
            if (a.isPresent() == false) {
                User u = new User();
                u.setUsername(username);
                u.setUserpass(userpass);
                u.setRole(r.get());
                u.setCreatedAt(new Timestamp(System.currentTimeMillis()));
                return Optional.of(userRepository.save(u));
            } else {
                User u = new User() ;
                u.setUsername("User with this name already exists");
                return Optional.of(u);
            }
        }
        return Optional.empty();
    }

    @PostMapping("/user/update/{id}")
    public Optional<User> update(
            @PathVariable Long id,
            @RequestParam(value = "username") String username,
            @RequestParam(value = "userpass") String userpass,
            @RequestParam(value = "role_id") Long roleId
    ) {
        Optional<Role> role = roleRepository.findById(roleId);
        if (role.isPresent()) {
            Optional<User> r = userRepository.findById(id);
            if (r.isPresent()) {
                User u = r.get();
                u.setUsername(username);
                u.setUserpass(userpass);
                u.setRole(role.get());
                u.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
                return Optional.of(userRepository.save(u));
            }
            return r;
        }
        return Optional.empty();
    }

    @GetMapping("/user/{id}")
    public Optional<User> get(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @GetMapping("/user/remove/{id}")
    public Optional<User> remove(@PathVariable Long id) {
        Optional<User> u = userRepository.findById(id);
        if (u.isPresent()) {
            userRepository.delete(u.get());
        }
        return u;
    }
}
