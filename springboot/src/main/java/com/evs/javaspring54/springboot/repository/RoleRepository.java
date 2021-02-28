/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.springboot.repository;

import com.evs.javaspring54.springboot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ok
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
