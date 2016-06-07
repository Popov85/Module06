package com.goit.g2popov.module06.task01;

/**
 * Created by Андрей on 29.05.2016.
 */
public class Rectangle implements Shape {
        public double calculateArea(double[] sides) {
                double sideA = sides[0];
                double sideB = sides[1];
                return sideA*sideB;
        }
}
