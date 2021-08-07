import java.util.Scanner;
public class JavaExceptionTryCatch{
  
  public static void main(String args[]){ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Reading Values of a and b");
	int a = sc.nextInt();
	int b= sc.nextInt();
	
	try{  
      //code that may raise exception  
	    int c=a/b; // exception object gets created 
		System.out.println("Result of Division is : "+c);
		
	}catch(ArithmeticException e){
		System.out.println("In catch block");
		System.out.println(e);
	}finally{
		System.out.println("rest of the code will continue");  
    }  
  }
}  
