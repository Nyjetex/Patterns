package com.company.entity;

/**
 * Factory of create figures
 *
 * @author Nyjetex
 */
public interface Factory {
    /**
     * Create a new figure
     *
     * @param color color
     * @return instance a new figure
     */
    Figure create(String color);
}
