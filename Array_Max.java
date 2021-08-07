import java.util.Scanner;

public class Array_Max{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("How many array elements you want :");
		n=sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Reading Array Elements :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Maximum element in array is :"+max);
	}
}