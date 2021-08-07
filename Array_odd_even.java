import java.util.Scanner;

public class Array_odd_even{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x[] = new int[10];
		int y[] = new int[10];
		int temp[]= new int[20];
		int l;
		
		int n;
		System.out.println("How many array elements you want :");
		n=sc.nextInt();
		
		int i,j,k;
		System.out.println("Reading First Array Elements :");
		for(i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
			temp[i]=x[i];
		}
		k=i;
		
		System.out.println("Reading Second Array Elements :");
		for(j=0;j<n;j++)
		{
			y[j]=sc.nextInt();
			temp[k]=y[j];
			k++;
		}
		l=k;
		i=0;
		j=0;
		for(k=0;k<l;k++)
		{
			if(temp[k]%2==0)
			{
				x[i]=temp[k];
				i++;
				
			}
			else
			{
				y[j]=temp[k];
				j++;
			}
		}
		
		System.out.println("First Array Elements are : ");
		for(k=0;k<i;k++)
			System.out.print(x[k] + "  ");
		System.out.println();
		
		System.out.println("Second Array Elements are : ");
		for(k=0;k<j;k++)
			System.out.print(y[k] + "  ");
		System.out.println();
		
	}
}