package com.company;

import com.company.entity.Figure;

public class Square extends Figure {

    public Square(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw a " + getColor() + " square#" + getFigureId());
    }
}
