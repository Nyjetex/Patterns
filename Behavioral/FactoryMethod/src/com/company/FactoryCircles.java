package com.company;

import com.company.entity.Factory;
import com.company.entity.Figure;

import java.util.HashMap;

/**
 * Factory cirles with hash
 */
public class FactoryCircles implements Factory {
    private static final HashMap<String, Figure> figures = new HashMap<>();

    @Override
    public Figure create(String color) {
        Figure figure = figures.get(color);
        if (figure != null) {
            return figure;
        }
        figure = new Circle(color);
        figures.put(color, figure);
        return figure;
    }
}
