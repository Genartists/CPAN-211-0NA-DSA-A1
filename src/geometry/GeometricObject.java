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

package geometry;

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
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
