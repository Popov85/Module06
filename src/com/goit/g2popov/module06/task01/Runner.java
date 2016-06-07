package com.goit.g2popov.module06.task01;

/**
 * Created by Андрей on 06.06.2016.
 */
public class Runner {
        public static void main (String[] args) throws NotANumberException {
                Triangle myTriangle = new Triangle();
                double[] sides={2.0d, 4.0d, 4.47d};
                double x = 0;
                try {
                        x = myTriangle.calculateArea(sides);
                        System.out.println("Area of a triangle = "+x);
                } catch (NotANumberException e) {
                        e.printStackTrace();
                }
                Rectangle myRectangle = new Rectangle();
                double[] sides2={2.0d, 4.0d};
                double x2 = myRectangle.calculateArea(sides2);
                System.out.println("Area of a rectangle = "+x2);
                Circle myCircle = new Circle();
                double[] sides3={2.0d};
                double x3 = myCircle.calculateArea(sides3);
                System.out.println("Area of a circle = "+x3);
        }
}
