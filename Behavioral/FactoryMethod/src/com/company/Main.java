package com.company;

import com.company.entity.Factory;
import com.company.entity.Figure;

import java.util.ArrayList;
import java.util.List;

/**
 * Тестируем паттерн "фабричный метод" и убеждаемся, что фигуры берутся из кеша.
 */
public class Main {

    public static void main(String[] args) {
        String[] colors = {"RED", "BLUE", "YELLOW", "GREEN"
                , "RED", "BLUE", "YELLOW", "GREEN"
                , "RED", "BLUE", "YELLOW", "GREEN"
                , "RED", "BLUE", "YELLOW", "GREEN"
                , "RED", "BLUE", "YELLOW", "GREEN"};
        List<Figure> figures;
        System.out.println("Draw circles: ");
        figures = createFigures(colors, new FactoryCircles());
        drawFigures(figures);
        System.out.println("Draw squares: ");
        figures = createFigures(colors, new FactorySquares());
        drawFigures(figures);
    }

    /**
     * simple draw figures
     *
     * @param figures figures
     */
    private static void drawFigures(List<Figure> figures) {
        if (figures == null || figures.isEmpty()) {
            return;
        }
        figures.forEach(Figure::draw);
    }

    /**
     * Create list of figures with set colors
     *
     * @param colors colors
     * @return list of figures
     */
    private static List<Figure> createFigures(String[] colors, Factory factory) {
        List<Figure> figures = new ArrayList<>(colors.length);
        for (String color : colors) {
            figures.add(factory.create(color));
        }
        return figures;
    }
}
