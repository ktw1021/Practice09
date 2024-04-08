package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		double area = width * height;
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = 2*width + 2*height;
		return perimeter;
	}
	@Override
	public void resize(double s) {
		width=s*width;
		height=s*height;
		
	}
    
    

}