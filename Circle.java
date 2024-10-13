package chuong1;

public class Circle {
	private double radius;
	public Circle() {
		radius = 1.0;
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getCircumference() {
		return radius*2*Math.PI;
	}
	public String toString() {
		return "Circle[radius="+radius+"]";
	}
}
