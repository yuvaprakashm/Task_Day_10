/*

DAY : 10
ASSIGNMENT NO :01

1.Create a Student class (roll number, name, and percentage). Define a default and
parameterized constructor. Override toString method. Keep a counter that will hold
the number of objects created. Create objects using parameterized constructor and
display the object count after each object created (use static member and method).
Also, display the contents of each Object

*/
package net.texala.main;

import java.util.Scanner;

public class Student {
	private int rollNumber;
	private String name;
	private double percentage;

	private static int objectCount = 0;

	public Student() {
		objectCount++;
	}

	public Student(int rollNumber, String name, double percentage) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.percentage = percentage;
		objectCount++;
		System.out.println("Object created. Object count: " + objectCount);
	}

	@Override
	public String toString() {
		return "Student [Roll Number: " + rollNumber + ", Name: " + name + ", Percentage: " + percentage + "]";
	}

	public static int getObjectCount() {
		return objectCount;
	}

	public static void main(String[] args) {
		char userInput;
		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println("Enter details for the first student:");
			System.out.print("Roll Number (numeric only): ");
			while (!scanner.hasNextInt()) {
				System.out.println("Invalid input. Please enter a number for Roll Number:");
				scanner.next();
			}
			int rollNumber1 = scanner.nextInt();

			scanner.nextLine();
			System.out.print("Name (alphabet only): ");
			while (!scanner.hasNext("[a-zA-Z]+")) {
				System.out.println("Invalid input. Please enter alphabets for Name:");
				scanner.next();
			}
			String name1 = scanner.next();

			System.out.print("Percentage (numeric only): ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalid input. Please enter a number for Percentage:");
				scanner.next();
			}
			double percentage1 = scanner.nextDouble();

			Student student1 = new Student(rollNumber1, name1, percentage1);
			System.out.println(student1.toString());

			System.out.println("\nEnter details for the second student:");
			System.out.print("Roll Number (numeric only): ");
			while (!scanner.hasNextInt()) {
				System.out.println("Invalid input. Please enter a number for Roll Number:");
				scanner.next();
			}
			int rollNumber2 = scanner.nextInt();

			scanner.nextLine();
			System.out.print("Name (alphabet only): ");
			while (!scanner.hasNext("[a-zA-Z]+")) {
				System.out.println("Invalid input. Please enter alphabets for Name:");
				scanner.next();
			}
			String name2 = scanner.next();

			System.out.print("Percentage (numeric only): ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalid input. Please enter a number for Percentage:");
				scanner.next();
			}
			double percentage2 = scanner.nextDouble();

			Student student2 = new Student(rollNumber2, name2, percentage2);
			System.out.println(student2.toString());

			System.out.println("\nTotal number of objects created: " + Student.getObjectCount());

			System.out.print("Do you want to execute again (y/n) ? : ");
			userInput = scanner.next().charAt(0);
		} while (userInput == 'Y' || userInput == 'y');

		scanner.close();
	}
}
