package com.goit.g2popov.module06.task01;

/**
 * Interface {@code Shape} specifies a service for area calculations of geometric figures
 * This interface defines how to calculate an area of simple shapes such as triangle, rectangle, circle
 * @author  Andrii Popov
 */
public interface Shape {
        /**
         * @param args
         * @return a value of area of a given shape
         * @throws NotANumberException
         */
        double calculateArea(double[] args) throws NotANumberException;
}
