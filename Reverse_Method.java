package PackageA;
import java.util.Scanner;
public class Reverse_Method{
	
	public int Reverse(int no)
	{
		int i, rev=0;
		
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		return rev;
	}
	
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int n=sc.nextInt();
	Reverse_Method R = new Reverse_Method();
	int rev = R.Reverse(n);
	System.out.println("Reversed number : "+rev);
	}

}