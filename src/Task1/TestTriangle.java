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

package Task1;
import java.util.Scanner;

/**
 * This class tests the Triangle implementation from Task 1.
 */
public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Prompt the user to enter three sides of the triangle
            System.out.print("Enter the three sides of the triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();
            input.nextLine();
            // Validate input - all sides must be positive
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                System.out.println("Error: All sides must be positive numbers.");
                input.close();
                return;
            }

            // Prompt the user to enter the color
            System.out.print("Enter the color of the triangle: ");
            String color = input.nextLine();

            // Prompt the user to enter whether the triangle is filled
            System.out.print("Is the triangle filled (true/false)? ");
            boolean filled = input.nextBoolean();

            // Create a Triangle object with the user input
            GeometricObject triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            // Display the triangle information
            System.out.println("\nTriangle Information:");
            System.out.println("---------------------");
            System.out.println(triangle.toString());

            input.close();
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        }
    }
}