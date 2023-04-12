package huy.dev;

public class Rectangle extends Shape{

	protected double a, b;
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
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

	@Override
	public double chuvi() {
		return (a + b) * 2;
	}

	@Override
	public double dientich() {
		return a * b;
	}
	
	@Override
	public String toString() {
		return String.format("Chu vi hinh chu nhat: %f, Dien tich hinh chu nhat: %f", chuvi(), dientich());
	}
}
