/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class6;

/**
 *
 * @author ok
 */
public interface Fly extends Motion {
    
    public long howHeight = 100L;  // (static)

    public boolean canFly() ;
    
}
