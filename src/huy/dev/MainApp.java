package huy.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[5];
		
		input(shapes);
		print(shapes);
		
		System.out.print("Hinh co tron dien tich lon nhat la: ");
		findCircle(shapes);
		
		System.out.print("Hinh co chu nhat dien tich lon nhat la: ");
		findRectangle(shapes);
		
		System.out.print("Hinh co tam giac dien tich lon nhat la: ");
		findTriangle(shapes);
		
		//đoạn ni là do có 2 cách để tìm hình có diện tích lớn nhất
		//cách 1
		System.out.print("Hinh co dien tich lon nhat la: ");
		find(shapes);
				
		//cách 2
		sort(shapes);
		System.out.print("Hinh co dien tich lon nhat la: ");
		System.out.println(shapes[0]);
	}

	private static void findTriangle(Shape[] shapes) {
		Shape[] shape = new Shape[1];
		double max = 0;
		for (Shape s : shapes) {
			//kiem tra s co phai kieu Triangle ko
			if(s instanceof Triangle == true) {
				if(max < s.dientich()) {
					max = s.dientich();
					shape[0] = s;
				}
			}
		}
		System.out.println(shape[0]);
	}

	private static void findRectangle(Shape[] shapes) {
		Shape[] shape = new Shape[1];
		double max = 0;
		for (Shape s : shapes) {
			//kiem tra s co phai kieu Rectangle ko
			if(s instanceof Rectangle == true) {
				if(max < s.dientich()) {
					max = s.dientich();
					shape[0] = s;
				}
			}
		}
		System.out.println(shape[0]);
	}

	private static void findCircle(Shape[] shapes) {
		Shape[] shape = new Shape[1];
		double max = 0;
		for (Shape s : shapes) {
			//kiem tra s co phai kieu Circle ko
			if(s instanceof Circle == true) {
				if(max < s.dientich()) {
					max = s.dientich();
					shape[0] = s;
				}
			}
		}
		System.out.println(shape[0]);
	}

	private static void sort(Shape[] shapes) {
		Shape[] shape = new Shape[1];
		for (int i = 0; i < (shapes.length - 1); i++) {
			for (int j = i + 1; j < shapes.length; j++) {
				if(shapes[i].dientich() < shapes[j].dientich()) {
					shape[0] = shapes[j];
					shapes[j] = shapes[i];
					shapes[i] = shape[0];
				}
			}
		}
	}

	private static void find(Shape[] shapes) {
		// TODO Auto-generated method stub
		Shape[] shape = new Shape[1];
		double max = 0;
		for (Shape s : shapes) {
			if(max < s.dientich())
			{
				max = s.dientich();
				shape[0] = s;
			}
		}
		System.out.println(shape[0]);
	}

	private static void print(Shape[] shapes) {
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}	

	private static void input(Shape[] shapes) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("1: Circle, 2: Rect, 3: Triangle.");
			int c = sc.nextInt();
			switch (c) {
				case 1: 
					shapes[i] = inputCircle(sc);
					break;
				case 2: 
					shapes[i] = inputRect(sc);
					break;
				case 3: 
					shapes[i] = inputTriangle(sc);
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + c);
			}
		}
	}

	private static Shape inputTriangle(Scanner sc) {
		System.out.println("Nhap 3 canh: ");
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		return new Triangle(a, b, c);
	}

	private static Shape inputRect(Scanner sc) {
		double a, b;
		System.out.println("Nhap chieu dai: ");
		a = sc.nextDouble();
		
		System.out.println("Nhap chieu rong: ");
		b = sc.nextDouble();
		
		return new Rectangle(a, b);
	}

	private static Shape inputCircle(Scanner sc) {
		System.out.println("Nhap ban kinh hinh tron: ");
		double r;
		
		r = sc.nextDouble();
		return new Circle(r);
	}

}
