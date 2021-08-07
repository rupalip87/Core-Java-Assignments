class Floyed_Alpha_Numeric1{
	static char ch='A';
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
			if(i%2!=0)
				System.out.print("  "+j+"  ");
			else
			{
				System.out.print("  "+ch+"  ");
					
			}
		
		}
		if(i%2==0)
			ch++;
		
		System.out.println();
	}
}
}