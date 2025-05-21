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

package test;

import shapes.TriangleWithException;
import geometry.GeometricObject;
import exception.TriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test with legal sides
        try {
            GeometricObject triangle = createTriangleFromInput(sc);

            System.out.print("Color: ");
            sc.nextLine();
            triangle.setColor(sc.nextLine());

            System.out.print("Is the triangle filled? (true/false): ");
            triangle.setFilled(getBooleanInput(sc));

            System.out.println("\nTriangle created successfully:\n" + triangle.toString());
        } catch (TriangleException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input Error: Please enter valid data types.");
        }

        System.out.println("\n---------------------------------------\n");

        // Test with illegal sides

        System.out.println("Creating Triangle with illegal sides:");
        try {
            GeometricObject triangle = createTriangleFromInput(sc);
            System.out.println("\nTriangle created:\n" + triangle.toString());
        } catch (TriangleException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input Error: Please enter valid data types.");
        }

        sc.close();
    }

    // Helper method accept user input, and Reads triangle sides from user input and constructs a TriangleWithException.
    private static GeometricObject createTriangleFromInput(Scanner sc)
            throws TriangleException, InputMismatchException {

        double side1 = getDoubleInput(sc, "Side 1: ");
        double side2 = getDoubleInput(sc, "Side 2: ");
        double side3 = getDoubleInput(sc, "Side 3: ");

        return new TriangleWithException(side1, side2, side3);
    }
    // Input validation for the right type double and boolean
    private static double getDoubleInput(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // discard invalid input
            }
        }
    }
    private static boolean getBooleanInput(Scanner sc) {
        while (true) {
            if (sc.hasNextBoolean()) {
                return sc.nextBoolean();
            } else {
                System.out.println("Invalid input. Please enter true or false.");
                sc.next();
            }
        }
    }

}