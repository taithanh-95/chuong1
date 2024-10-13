package chuong1;

public class Rectangle {
	private float length;
	private float width;
	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}
	public Rectangle(float length, float width) {
		this.length=length;
		this.width=width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float newLength) {
		length = newLength;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float newWidth) {
		width = newWidth;
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return (length+width)*2;
	}
	public String toString() {
		return "Rectangle[length= " + length + ", width= " + width + "]";
	}
}
