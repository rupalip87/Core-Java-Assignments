import java.util.Scanner;
public class Array_Missing_ele{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("\nHow many elements you want :");
		int n=sc.nextInt();
		int []x=new int[n];
		
		System.out.println("Reading array elements:");
		for(int i=0;i<n;i++)
			x[i]=sc.nextInt();
		
		System.out.println("Missing array elements:");
		for(int i=0;i<n-1;i++)
		{
			int min=x[i];
			int max=x[i+1];
			
			for(int j=min+1;j<max;j++)
				System.out.print(j+"  ");
			System.out.println();
		
		
		
		}
	}
}