/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class7;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author ok
 */
public class FileOutputNIO {

    // Gen-6
    public static void main(String[] args) {
        Path path = Paths.get("e:/niospring.txt") ;
        // 1,000,000 threads
        try (BufferedWriter write = 
                Files.newBufferedWriter(path, 
                        Charset.forName("UTF-8")
//                        , StandardOpenOption.DSYNC, StandardOpenOption.READ
                )) {
                write.write("to be, or not to be");
        } catch ( Exception e ) {
            
        }
    }
    
}
