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

public class TestTriangleWithException {
    public static void main(String[] args) {
        System.out.println("Testing Triangle with Exception Handling");
        System.out.println("---------------------------------------\n");

        // Test case 1: Triangle with valid sides
        System.out.println("Test Case 1: Creating a triangle with valid sides (3, 4, 5)");
        try {
            TriangleWithException validTriangle = new TriangleWithException(3, 4, 5);
            validTriangle.setColor("blue");
            validTriangle.setFilled(true);

            System.out.println("Triangle created successfully!");
            System.out.println(validTriangle);
        } catch (TriangleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n---------------------------------------\n");

        // Test case 2: Triangle with invalid sides (violates triangle inequality theorem)
        System.out.println("Test Case 2: Creating a triangle with invalid sides (1, 2, 10)");
        try {
            TriangleWithException invalidTriangle = new TriangleWithException(1, 2, 10);
            System.out.println("Triangle created successfully!");
            System.out.println(invalidTriangle);
        } catch (TriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}