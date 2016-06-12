package com.goit.g2popov.module06.task01;

/**
 * Class {@code Circle} specifies a circle
 * @author  Andrii Popov
 */
public class Circle implements Shape {
        public double calculateArea(double[] sides) {
                double theArea = Math.PI*Math.pow(sides[0],sides[0]);
                return theArea;
        }
}
