package net.texala.main;

public class Square extends Rectangle {

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}

	@Override
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}

	@Override
	public void setLength(double side) {
		super.setWidth(side);
		super.setLength(side);
	}

	@Override
	public String toString() {
		return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
	}
}
