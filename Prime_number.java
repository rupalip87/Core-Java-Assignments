import java.util.Scanner;

public class Prime_number{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int i=2;
		
		if(num==2)
			System.out.println("Prime number");
		else
		{
			while(i<num)
			{
				if(num%i==0)
					break;
				i++;
			}
			if(num==i)
			System.out.println("prime number");	
					
		
		}
	}
}