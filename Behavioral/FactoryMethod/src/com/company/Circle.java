package com.company;

import com.company.entity.Figure;

public class Circle extends Figure {

    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw a " + getColor() + " circle #" + getFigureId());
    }
}
