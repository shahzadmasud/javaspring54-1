/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class4;

/**
 *
 * @author ok
 */
public class Rectangle {

    Line width, height;

    public Rectangle() {
        this(new Line(), new Line());
    }

    Rectangle(double x1, double y1,
            double x2, double y2,
            double x3, double y3,
            double x4, double y4) {
        this(new Line(new Point(x1, y1), new Point(x2, y2)),
                new Line(new Point(x3, y3), new Point(x4, y4)));
    }

    Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this(new Line(p1, p2), new Line(p3, p4));
    }

    // N
    Rectangle(Line width, Line height) {
        this.width = new Line(width);
        this.height = new Line(height);
    }

    Rectangle(Rectangle rec) {
        this(rec.width, rec.height);
    }

    double area() {
        return width.length() * height.length();
    }

}
