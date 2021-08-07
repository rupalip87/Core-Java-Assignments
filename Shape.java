import java.util.Scanner;
public abstract class Shape {

	protected double x, y; //instance variables
	
	public Shape() {
		
		x=y=0.0;
		System.out.println("I m in default construtor of shape class");
	}
	
	public Shape(double x, double y) {
		this.x=x;
		this.y=y;
		System.out.println("I m in parameterized construtor of shape class");
	}
	
	public final void get_data(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x:");
		x=sc.nextDouble();
		
		System.out.println("Enter value of y:");
		y=sc.nextDouble();
	}
		
	public abstract void display_area();
		
	public static void main(String[] args) {
		
		Triangle t = new Triangle(5,6);
		t.get_data();
		t.display_area();
		
		
		Rectangle r = new Rectangle(3.0, 4.1);
		r.get_data();
		r.display_area();
		

	}

}
