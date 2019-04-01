package com.company.entity;

import java.util.Objects;

/**
 * absctract class of representation figure
 */
public abstract class Figure {
    private static int FIGURE_ID = 1;
    private final String color;
    private final int figureId;

    /**
     * @param color color
     */
    public Figure(String color) {
        this.color = color;
        figureId = FIGURE_ID++;
    }

    /**
     * Simple draw a figure (console in text)
     */
    public abstract void draw();

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return figure id
     */
    public int getFigureId() {
        return figureId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return figureId == figure.figureId &&
                Objects.equals(color, figure.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, figureId);
    }

    @Override
    public String toString() {
        return "Figure#" +
                figureId +
                "(" + getClass().getSimpleName() + "){" +
                "color='" + color + '\'' +
                '}';
    }
}
