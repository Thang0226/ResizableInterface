package com.codegym;

public class ShapeTest {

    public static void main(String[] args) {
        Shape[] array = new Shape[2];
        array[0] = new Circle(6);
        array[1] = new Rectangle(5, 12);
        System.out.println("Area of shapes before resizing:");
        System.out.println("\tCircle: " + ((Circle) array[0]).getArea());
        System.out.println("\tRectangle: " + ((Rectangle) array[1]).getArea());

        for (Shape sh : array) {
            int percent = 101 + (int) (Math.random() * 100);
            sh.resize(percent);
        }
        System.out.println("Area of shapes after resizing:");
        System.out.println("\tCircle: " + ((Circle) array[0]).getArea());
        System.out.println("\tRectangle: " + ((Rectangle) array[1]).getArea());
    }
}
