package com.goit.g2popov.module06.task01;

/**
 * Class {@code Runner} entry point - emulates how to use Triangle class and calculate area of triangles
 */
public class Runner {
        public static void main (String[] args) throws NotANumberException {
                // We will create an instance of Triangle class and
                // sequentially calculate areas of unreal and real triangle
                // In the first example we shall face exception!
                Triangle myTriangle = new Triangle();
                double[] sides = {2.0d, 4.0d, 41.47d};
                double x = myTriangle.calculateArea(sides);
                System.out.println("Area of a triangle (with an exception) = " + x);

                // Let's change the third side to get a correct area
                sides[2] = 4.47d;
                x = myTriangle.calculateArea(sides);
                System.out.println("Area of a triangle = " + x);
        }
}
