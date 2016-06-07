package com.goit.g2popov.module06.task01;

/**
 * Created by Андрей on 30.05.2016.
 */
public class Circle implements Shape {
        public double calculateArea(double[] sides) {
                double theArea = Math.PI*Math.pow(sides[0],sides[0]);
                return theArea;
        }
}
