package net.texala.main;

public class Cylinder extends Circle {
	private double height = 1.0;

	public Cylinder() {
		super();
	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	@Override
	public double getArea() {
		return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
	}

	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() + " height=" + height;
	}

	public double getVolume() {
		return super.getArea() * height;
	}

	  public double getHeight() {
	        return height;
	    }
				
	}

