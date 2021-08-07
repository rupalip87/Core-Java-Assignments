import java.util.Scanner;

public final class Triangle extends Shape{
	
	public Triangle() 
	{
		super(); //parent's default constructor will be called
		System.out.println("I m in default construtor of Triangle class");
		
	}
	public Triangle(double x, double y) 
	{
		super(x,y); //parents's parameterized constructor will be called
		System.out.println("I m in parameterized construtor of Triangle class");
		
	}
	
		
	public void display_area()
	{
		double area = 0.5 * x *y;
		System.out.println("Area of Triangle is : "+area);
	}
	
	
}


