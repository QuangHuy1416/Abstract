package huy.dev;

import java.util.Scanner;

public class Triangle extends Shape {

	protected double a, b, c;
	@Override
	public double chuvi() {
		return a + b + c;
	}

	@Override
	public double dientich() {
		double p = chuvi() / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Chu vi hinh tam giac: %f, Dien tich hinh tam giac: %f", chuvi(), dientich());
	}
	
}
