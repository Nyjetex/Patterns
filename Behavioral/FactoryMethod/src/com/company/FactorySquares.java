package com.company;

import com.company.entity.Factory;
import com.company.entity.Figure;

import java.util.HashMap;

/**
 * Factory squares with hash
 */
public class FactorySquares implements Factory {
    private static final HashMap<String, Figure> figures = new HashMap<>();

    @Override
    public Figure create(String color) {
        Figure figure = figures.get(color);
        if (figure != null) {
            return figures.get(color);
        }
        figure = new Square(color);
        figures.put(color, figure);
        return figure;
    }
}
