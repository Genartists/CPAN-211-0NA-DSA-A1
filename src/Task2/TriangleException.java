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

public class TriangleException extends Exception {
    private double invalidSide;

    public TriangleException(double invalidSide) {
        super(invalidSide + " exceeds the sum of the other sides");
        this.invalidSide = invalidSide;
    }

    public double getInvalidSide() {
        return invalidSide;
    }
}