class Astrick_Alpha_Numeric{
public static void main(String[] args){
	int i;
	for(i=1;i<=4;i++)
	{
		for(int space=3;space>=i;space--)
		{	
			System.out.print("  ");
		}
		char ch='A';
		for(int j=1;j<=i;j++)
		{
			if(i==1 || i == 4)
				System.out.print("  "+"*"+"  ");
			else if(i==2)
				System.out.print("  "+j+"  ");
			else
			{
				System.out.print("  "+ch+"  ");
				ch++;
			}
		}
		System.out.println();
	}
}
}
