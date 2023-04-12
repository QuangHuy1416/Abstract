package huy.dev;

public class Circle extends Shape {
	protected double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double chuvi() {
		return Math.PI * 2 * r;
	}

	@Override
	public double dientich() {
		return Math.PI * Math.pow(r, 2);
	}
	
	@Override
	public String toString() {
		return String.format("Chu vi hinh tron: %f, Dien tich hinh tron: %f", chuvi(), dientich());
	}
}
