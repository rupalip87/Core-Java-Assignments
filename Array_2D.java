import java.util.Scanner;
public class Array_2D{
	public static void main(String args[]){
		
		//int x[][][] = {{{1,2,3},{4,5,6},{7,8,9}}, {{10,11,12},{13,14,15},{16,17,18}}, {{19,20,21},{22,23,24},{25,26,27}}};
		int x[][][]={{{1},{2,3}}, {{5},{6}}, {{9,10},{11,12}}};
		
		//int x[][][] = new int [3][3][3];
				
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array rows and columns");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int x[][] = new int [row][col]; 
			
		System.out.println("Enter array elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				for(int k=0;k<3;k++)
				x[i][j][k] = sc.nextInt();
		}
			
		
		System.out.println("Displaying array elements :");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
				for(int k=0;k<x[i][j].length;k++)
				System.out.print(x[i][j][k]+" ");
			System.out.println();
			
			
		}
			
		*/
			
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
				for(int k = 0; k<x[i][j].length;k++)
					System.out.print(x[i][j][k] + " ");
			System.out.println();
			System.out.println();
		}
		
	}
}