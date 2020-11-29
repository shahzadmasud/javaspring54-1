/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class2;

import static com.evs.javaspring54.class2.WeekDay.*;
import static com.evs.javaspring54.class2.TestEnum.Color.*;

/**
 *
 * @author ok
 */
public enum DayColor {
// TODO: Revise on OOP Language
    
    BlueMonday(Monday, Blue), YellowMonday(Monday, Yellow);

    private WeekDay day;
    private TestEnum.Color color;

    private DayColor(WeekDay day, TestEnum.Color color) {
        this.day = day;
        this.color = color;
    }

    public WeekDay getDay() {
        return day;
    }

    public void setDay(WeekDay day) {
        this.day = day;
    }

    public TestEnum.Color getColor() {
        return color;
    }

    public void setColor(TestEnum.Color color) {
        this.color = color;
    }

}
