/*

DAY : 10
ASSIGNMENT NO :05

Write a program that allocates ten points in an array of MyPoint, and initializes to
(1, 1), (2, 2), ... (10, 10).
Hint: You need to allocate the array, as well as each of the ten MyPoint instances.
MyPoint[] points = new MyPoint[10]; // Declare and allocate an
array of MyPoint
for (......) {
points[i] = new MyPoint(...); // Allocate each of MyPoint
instances
}

*/

package net.texala.main;

import java.util.Scanner;

public class MyPointArray {
    public static void main(String[] args) {
        char userinput = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the size of the array: ");
            int arraySize = getValidIntInput(scanner);

            MyPointMain[] points = new MyPointMain[arraySize];

            for (int i = 0; i < arraySize; i++) {
                points[i] = new MyPointMain(i + 1, i + 1);
            }

            for (MyPointMain point : points) {
                System.out.println("(" + point.getX() + ", " + point.getY() + ")");
            }

            System.out.print("Do you want to execute again (y/n) ? : ");
            userinput = scanner.next().charAt(0); 

        } while (userinput == 'Y' || userinput == 'y');
        scanner.close();
    }

    private static int getValidIntInput(Scanner scanner) {
        int input;
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();  
            }
        }
        return input;
    }

    
}
