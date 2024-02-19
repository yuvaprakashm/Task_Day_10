/*

DAY : 10
ASSIGNMENT NO :04

Write the code for the class MyPoint. Also, write a test program (called
TestMyPoint) to test all the methods defined in the class.
Hint:
// Overloading method distance()
public double distance(int x, int y) { // this version takes
two ints as arguments
int xDiff = this.x – x;
int yDiff = ......
return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
}
public double distance(MyPoint another) { // this version
takes a MyPoint instance as argument
int xDiff = this.x – another.x;
.......
}
// Test program
MyPoint p1 = new MyPoint(3, 0);
MyPoint p2 = new MyPoint(0, 4);
......
// Testing the overloaded method distance()
System.out.println(p1.distance(p2));
System.out.println(p1.distance(5, 6)); 

*/

package net.texala.main;

import java.util.Scanner;

public class TestMyPoint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char userinput;
		do {
			System.out.println("Enter coordinates for p1:");
			System.out.print("X coordinate: ");
			int p1X = getValidIntInput(scanner);

			System.out.print("Y coordinate: ");
			int p1Y = getValidIntInput(scanner);

			MyPointDist p1 = new MyPointDist(p1X, p1Y);

			System.out.println("\nEnter coordinates for p2:");
			System.out.print("X coordinate: ");
			int p2X = getValidIntInput(scanner);

			System.out.print("Y coordinate: ");
			int p2Y = getValidIntInput(scanner);

			MyPointDist p2 = new MyPointDist(p2X, p2Y);

			System.out.println("\nDistance between p1 and p2: " + p1.distance(p2));
			System.out.println("Distance between p1 and (5, 6): " + p1.distance(5, 6));

			System.out.println("Do you want to execute again (y/n) ? :");
			userinput = getValidCharInput(scanner);

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

	private static char getValidCharInput(Scanner scanner) {
		char input;
		while (true) {
			if (scanner.hasNext()) {
				input = scanner.next().charAt(0);
				if (input == 'Y' || input == 'y' || input == 'N' || input == 'n') {
					break;
				} else {
					System.out.println("Invalid input. Please enter 'Y' or 'N'.");
				}
			} else {
				System.out.println("Invalid input. Please enter 'Y' or 'N'.");
				scanner.next();
			}
		}
		return input;
	}
}
