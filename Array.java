import java.util.Scanner;
public class Array{
	public static void main(String[] args){
		int[] x={1,2,3,4,5};
		int[] y= new int[5];
		int z=60;
		int j=0;
		for(int i=x.length-1;i>=0;i--)
		{
			y[j]=x[i];
			j++;
		}
			
		System.out.println("Displaying array elements :");

		for(j=0;j<y.length;j++)
		{
			System.out.print(y[j] + " ");
		}
		
	}
}