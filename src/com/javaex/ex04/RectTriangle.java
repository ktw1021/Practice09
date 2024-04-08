package com.javaex.ex04;

public class RectTriangle extends Shape {
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
	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		double area = (width*height)/2;  
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = width + height + Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2)); 
		return perimeter;
	}

    
}