import java.util.Scanner;

public class DigitPrint{
	public static void main(String [] args)
	{
		int digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		digit=sc.nextInt();
		
		int part2=digit%10;
		int part1=digit/10;
		
		switch(part1)
		{
			default: System.err.println("Invalid Digit");
					break;
			case 0: System.out.print("ZERO");
					break;
			case 1: System.out.print("ONE");
					break;
			case 2: System.out.print("TWO");
					break;	
			case 3: System.out.print("THREE");
					break;
			case 4: System.out.print("FOUR");
					break;
			case 5: System.out.print("FIVE");
					break;
			case 6: System.out.print("SIX");
					break;
			case 7: System.out.print("SEVEN");
					break;
			case 8: System.out.print("EIGHT");
					break;
			case 9: System.out.print("NINE");
					break;
			
			
		}
		System.out.print(" ");
		switch(part2)
		{
			case 0: System.out.println("ZERO");
					break;
			case 1: System.out.println("ONE");
					break;
			case 2: System.out.println("TWO");
					break;	
			case 3: System.out.println("THREE");
					break;
			case 4: System.out.println("FOUR");
					break;
			case 5: System.out.println("FIVE");
					break;
			case 6: System.out.println("SIX");
					break;
			case 7: System.out.println("SEVEN");
					break;
			case 8: System.out.println("EIGHT");
					break;
			case 9: System.out.println("NINE");
					break;
			default: System.err.println("Invalid Digit");
					break;
			
		}
	}

}