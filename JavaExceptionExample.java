import java.util.Scanner;

public class JavaExceptionExample{
  
  public static void main(String args[]){ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Reading Values of a and b");
	int a = sc.nextInt();
	int b= sc.nextInt();
	
	    int c=a/b;
		System.out.println("Result of Division is : "+c);
		
   //rest code of the program   
   System.out.println("rest of the code will continue");  
  }  
}  