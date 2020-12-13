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
public class Line {

    Point start; // double x1, y1;
    Point end; // double x2, y2;

    // No-Argument
    // Default
    Line() {
        this(new Point(), new Point());
    }

    // Nucleus 
    Line(Point start, Point end) {
        // Hollow (non-shallow) copy
//        this.start = start;
//        this.end = end;
        // Shallow / Deep
        this.start = new Point(start);
        this.end = new Point(end);
    }

    Line(double x1, double x2, double y1, double y2) {
//        this.x1 = x1;
//        this.x2 = x2;
//        this.y1 = y1;
//        this.y2 = y2;

//        this.start = new Point(x1, y1);
//        this.end = new Point(x2, y2);
        this(new Point(x1, y1), new Point(x2, y2));
    }

    Line(Line line) {
        this(line.start, line.end);
    }

    double length() {
        return start.distance(end);
    }

    @Override
    public String toString() {
        return "Line{" + "start=" + start + ", end=" + end + '}';
    }

    public static void main(String[] args) {
        Line l0 = new Line(0, 0, 0, 20);
        println(l0);

    }

}
