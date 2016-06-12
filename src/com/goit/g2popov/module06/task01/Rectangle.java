package com.goit.g2popov.module06.task01;

/**
 * Class {@code Rectangle} specifies a rectangle
 * This class is able to calculate area of rectangle
 * @author  Andrii Popov
 */
public class Rectangle implements Shape {
        /**
         * @param sides
         * @return the area of the defined rectangle based on its sides A and B
         */
        public double calculateArea(double[] sides) {
                double sideA = sides[0];
                double sideB = sides[1];
                return sideA*sideB;
        }
}
