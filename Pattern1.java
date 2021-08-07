class Pattern1{
public static void main(String[] args){
	int i;
	for(i=1;i<=4;i++)
	{
		for(int space=3;space>=i;space--)
		{	
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("  "+"*"+"  ");
		}
		System.out.println();
	}
}
}
