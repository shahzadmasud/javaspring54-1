/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.springboot.controller;

import com.evs.javaspring54.springboot.model.Role;
import com.evs.javaspring54.springboot.model.User;
import com.evs.javaspring54.springboot.repository.RoleRepository;
import java.sql.Timestamp;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/role/all")
    public Iterable<Role> all() {
        return roleRepository.findAll();
    }

    @PostMapping("/role/create")
    public Optional<Role> create(
            @RequestParam(value = "name") String name
    ) {
        Role u = new Role();
        u.setName(name);
        u.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return Optional.of(roleRepository.save(u));
    }

    @PostMapping("/role/update/{id}")
    public Optional<Role> update(
            @PathVariable Long id,
            @RequestParam(value = "name") String name
    ) {
        Optional<Role> r = roleRepository.findById(id);
        if (r.isPresent()) {
            Role u = r.get();
            u.setName(name);
            u.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            return Optional.of(roleRepository.save(u));
        }
        return r;
    }

    @GetMapping("/role/{id}")
    public Optional<Role> get(@PathVariable Long id) {
        return roleRepository.findById(id);
    }

    @GetMapping("/role/remove/{id}")
    public Optional<Role> remove(@PathVariable Long id) {
        Optional<Role> u = roleRepository.findById(id);
        if (u.isPresent()) {
            roleRepository.delete(u.get());
        }
        return u;
    }
}
