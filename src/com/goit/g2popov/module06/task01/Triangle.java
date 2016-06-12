package com.goit.g2popov.module06.task01;

/**
 * Class {@code Triangle} specifies a triangle (geometric shape)
 * This class calculates an area of a triangle based on Heron's formula
 * @see https://en.wikipedia.org/wiki/Heron%27s_formula
 * @author  Andrii Popov
 */
public class Triangle implements Shape {
        /**
         * @param sides
         * @return an area of a triangle
         * @throws NotANumberException
         */
        public double calculateArea(double[] sides) throws NotANumberException {
                double halfPerimeter = getHalfPerimeter(sides);
                double sideA = sides[0];
                double sideB = sides[1];
                double sideC = sides[2];
                double area = 0;
                try {
                        double tryArea = Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
                        // Check whether we get a correct number or NaN message.
                        if (Double.isNaN(tryArea)) {
                                throw new NotANumberException();
                        }
                        area = tryArea;
                } catch (NotANumberException e) {
                        System.out.println("Impossible triangle!");
                }
                return area;
        }

        /**
         * Calculates half-perimeter based on three sides of triangle
         * @param sides
         * @return half-perimeter of a triangle
         */
        private double getHalfPerimeter(double[] sides) {
                return (sides[0]+sides[1]+sides[2])/2;
        }
}
