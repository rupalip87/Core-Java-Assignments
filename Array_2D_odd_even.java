import java.util.Scanner;

public class Array_2D_odd_even{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.println("How many rows you want :");
		m=sc.nextInt();
		
		System.out.println("How many column you want :");
		n=sc.nextInt();
		
		int x[][] = new int[5][5];
		int y[][] = new int[5][5];
		int temp[]= new int[50];
		
		int k=0;
		System.out.println("Reading First Array Elements :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				x[i][j]=sc.nextInt();
				temp[k]=x[i][j];
				k++;
			}
		}
				
		System.out.println("Reading Second Array Elements :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				y[i][j]=sc.nextInt();
				temp[k]=y[i][j];
				k++;
			}
		}
		int cnt=k;
		int odd=0, even=0;
		int i=0,j=0;
		int p=0,q=0;
		
		for(k=0;k<cnt;k++)
		{
			if(temp[k]%2==0)
			{
				if(j<n)
				{
					x[i][j]=temp[k];
					j++;
				}
				else
				{
					j=0;
					i++;
					x[i][j]=temp[k];
					j++;
					
				}
				even++;
			}
			else
			{
				if(q<n)
				{
					y[p][q]=temp[k];
					q++;
				}
				else
				{
					q=0;
					p++;
					y[p][q]=temp[k];
					q++;
					
				}
				odd++;
			}
		}
		
		System.out.println("First Array Elements are : ");
		for(int z=0;z<=i;z++)
		{	
			for(int w=0;w<n && even!=0;w++, even--)
			System.out.print(x[z][w] + "  ");
			System.out.println();
		}
		
		System.out.println("Second Array Elements are : ");
		for(int z=0;z<=p;z++)
		{
			for(int w=0;w<n && odd!=0;w++, odd--)
			System.out.print(y[z][w] + "  ");
			System.out.println();
		}
		
	}
}