/*

DAY : 10
ASSIGNMENT NO : 12

Write a superclass called Shape (as shown in the class diagram above), which
contains the following.
·Two instance variables color (String) and filled (boolean).
·Two constructors: a no-arg (no-argument) constructor that initializes the
color to green and filled to true, and a constructor that initializes the
color and filled to the given values.
·Getter and setter for all the instance variables. By convention, the getter for a
boolean variable xxx is called isXXX() (instead of getXxx() for all the
other types).
·A toString() method that returns A Shape with color of xxx and
filled/Not filled.
·Write a test program to test all the methods defined in Shape.

*/
package net.texala.main;

public class TestShapes {
	public static void main(String[] args) {

		Shape shape1 = new Shape();
		System.out.println("shape1: " + shape1);

		Shape shape2 = new Shape("blue", false);
		System.out.println("shape2: " + shape2);

		Circle circle1 = new Circle();
		System.out.println("circle1: " + circle1);

		Circle circle2 = new Circle(5.0);
		System.out.println("circle2: " + circle2);

		Circle circle3 = new Circle("red", true, 3.0);
		System.out.println("circle3: " + circle3);

		Rectangle rectangle1 = new Rectangle();
		System.out.println("rectangle1: " + rectangle1);

		Rectangle rectangle2 = new Rectangle(4.0, 6.0);
		System.out.println("rectangle2: " + rectangle2);

		Rectangle rectangle3 = new Rectangle("purple", false, 2.0, 4.0);
		System.out.println("rectangle3: " + rectangle3);

		Square square1 = new Square();
		System.out.println("square1: " + square1);

		Square square2 = new Square(3.0);
		System.out.println("square2: " + square2);

		Square square3 = new Square("yellow", true, 4.0);
		System.out.println("square3: " + square3);
	}
}
