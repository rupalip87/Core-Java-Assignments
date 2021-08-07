import java.util.Scanner;
public class Array_Basic{
	public static void main(String args[]){
		//int[] x={1,2,3,4,5};  // 0 th index to 4th index
		
		//char[] y= {'a', 'b', 'c', 'd', 'e'};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		
		int  x[] = new int [size]; 
		
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			x[i] = sc.nextInt();
		}
		
		
		System.out.println("Displaying array elements :");
		
		for(int i:x)
		{
			System.out.print(i+ " ");
		}
			
	}
}