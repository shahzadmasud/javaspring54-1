/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class4;

import static com.evs.javaspring54.class2.SystemPrintUtils.*;

/**
 *
 * @author ok
 */
public class Point {

    static long COUNT;
    
    static {
        int a ;
        // Static 
        COUNT = 0 ;
    }

    // attribute, argument, belonging, variables
    private double x;
    private double y;

    // No-Argument Constructor
    // Default Constructor 
    public Point() {
        // setX(0.0); //x = 0.0 ;
        // setY(0.0); // y = 0.0 ; 
        this(0.0, 0.0);
    }

    // Argument Constructor
    // Nucleus Constructor 
    public Point(double newX, double newY) {
        setX(newX); // x = newX ;
        setY(newY); // y = newY ;
        COUNT++;
    }

    // Copy Constructor
    // Clone Constructor
    public Point(Point p1) {
        // setX(p1.x); //p2.x = p1.x;
        // setY(p1.y); //p2.y = p1.y;
        this(p1.x, p1.y);
    }

    // behaviour, methods, function, procedure
    // <return_type> --> 
    // non-actionable = void
    // actionable --> int, float, 
    /**
     * This method set the value of x
     *
     * @param newX
     */
    public void setX(double newX) {
        x = newX;
    }

    /**
     * This method return value of x
     *
     * @return - x
     */
    public double getX() {
        return x;
    }

    public void setY(double newY) {
        y = newY;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return distance(p.x, p.y);
    }

    private double distance(double x, double y) {
        return Math.sqrt((y - this.y) * (y - this.y)
                + (x - this.x) * (x - this.x));
    }

    public void move(double p) {
        move(p, p);
    }

    /**
     * 2D move
     *
     * @param x
     * @param y
     */
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(10); // p1.x = 10 ;
        p1.y = 20;
//        Point p2 = new Point() ;
//        p2.x = p1.x ;
//        p2.y = p1.y ;   
        Point p2 = new Point(p1);
        Point p3 = new Point(11.0, 21.0);
        print(Point.COUNT) ;
        println(p1);
        println(p2);
        println(p3);

    }

}
