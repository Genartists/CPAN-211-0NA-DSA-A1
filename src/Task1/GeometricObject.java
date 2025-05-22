/**********************************************
 Assignment 1
 Course: Data Structures & Algorithms
 Last Name: Shah
 First Name: Kresha
 ID: N01715324
 Section: CPAN-211-0NA
 This assignment represents my own work in accordance with Humber Academic Policy.
 Kresha
 Date: May 21, 2025
 **********************************************/

package Task1;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    public GeometricObject() {
        // Default constructor
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
