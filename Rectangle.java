import java.util.Scanner;

public class Rectangle extends Shape{
	
	public Rectangle() {
		super();
		System.out.println("I m in default construtor of Rectangle class");
	}
	
	public Rectangle(double x, double y) {
		super(x,y);
		System.out.println("I m in parameterized construtor of Rectangle class");
	}
	
	public void display_area()
	{
		double area = x *y;
		System.out.println("Area of Rectangle is : "+area);
	}

}
