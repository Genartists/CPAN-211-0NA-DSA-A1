/**********************************************
 Assignment 1
 Course:<subject type> - Semester
 Last Name:<student last name>
 First Name:<student first name>
 ID:<student ID>
 Section:<section name>
 This assignment represents my own work in accordance with Humber Academic Policy.
 Signature
 Date:<submission date>
 **********************************************/

package shapes;

import geometry.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // no-arg constructor that creates a default triangle
    public Triangle() {
    }

    // the constructor with specified side lengths
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // for side1
    public double getSide1() {
        return side1;
    }

    // for side2
    public double getSide2() {
        return side2;
    }

    // for side3
    public double getSide3() {
        return side3;
    }

    // calculating perimeter of the triangle
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // calculating the area w/ given formula
    @Override
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return "\n--Triangle Info--" +
                "\nSide 1: " + side1 + "cm" +
                "\nSide 2: " + side2 + "cm" +
                "\nSide 3: " + side3 + "cm" +
                "\nColor: " + getColor() +
                "\nFilled: " + isFilled() +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}
