/**********************************************
 Assignment #1
 Course: Data Structures & Algorithms
 Last Name: Le
 First Name: Hao
 ID: N01605830
 Section: CPAN-211-0NA
 This assignment represents my own work in accordance with Humber Academic Policy.
 Hao
 Date: May 21, 2025
 **********************************************/
package Task2;

import Task1.GeometricObject;

public class TriangleWithException extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public TriangleWithException(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public TriangleWithException(double side1, double side2, double side3) throws TriangleException {
        if (side1 >= side2 + side3) {
            System.out.print("Invalid triangle: side 1 = ");
            throw new TriangleException(side1);
        }
        if (side2 >= side1 + side3) {
            System.out.print("Invalid triangle: side 2 = ");
            throw new TriangleException(side2);
        }
        if (side3 >= side1 + side2) {
            System.out.print("Invalid triangle: side 3 = ");
            throw new TriangleException(side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = getPerimeter()/2;
        double area = Math.sqrt(s*(s - side1)*(s - side2)*(s- side3));
        return Math.round(area * 100.0) / 100.0;
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