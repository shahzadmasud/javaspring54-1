/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class6;

import static com.evs.javaspring54.class2.SystemPrintUtils.*;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author ok
 */
public class TestFile {

    public static void main(String[] args) {

//        File file = new File("c:/abc.txt");
//        // List all File of Drives (Without Filter)
//        File[] drive = File.listRoots();
//        for (File d : drive) {
//            println("--Drive--:" + d);
//            if (d.listFiles() != null) {
//                for (File f : d.listFiles()) {
//                    println((f.isFile() ? "----File----" : "----Dir----") + f);
//                }
//            }
//        }
        // List all File of Drives (With Filter)
        File[] drive = File.listRoots();
        for (File d : drive) {
            println("--Drive--:" + d);
            if (d.listFiles() != null) {
                for (File f : d.listFiles(new TxtFileNameFilter())) {
                    println((f.isFile() ? "----File----" : "----Dir----") + f);
                }
            }
        }

        File file = new File("c:/javaspring54.txt");
        try {
//            // Create New File
//            file.createNewFile();
//
//            // Delete
//            if (file.canWrite() && file.exists()) {
//                file.delete();
//            }
//
//            // Rename/ Move
//            file.renameTo(new File("c:/rename-javaspring54.txt"));
//
//            // Mkdir
//            file.mkdir();

            // Find a file 
            File[] drives = File.listRoots();
            for (File d : drives) {
                println("---Find(rename.txt) -- " + d + " :" + find(d, "rename.txt"));
            }

        } catch (Exception ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static boolean find(File file, String name) {
        println(file) ;
        if (file.isFile()) {
            return file.getPath().toLowerCase().contains(name);
        } else {
            boolean found = false;
            if (file.listFiles() != null) {
                for (File f : file.listFiles()) {
                    found = find(f, name);
                    if (found) {
                        return found;
                    }
                }
            }
            return found;
        }
    }

    // FileFilter (TODO:) 
    private static class TxtFileFilter extends FileFilter {

        @Override
        public boolean accept(File f) {
            return f.getName().toLowerCase().endsWith("txt");
        }

        @Override
        public String getDescription() {
            return "TxtFileFilter";
        }

    }

    // FileNameFilter
    private static class TxtFileNameFilter implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {
            return name.toLowerCase().endsWith("txt");
        }

    }
}
