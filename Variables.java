class Variables
{

	int x;
	static int y;
	public static void main(String args[])
	{
		Variables obj = new Variables();
		
		System.out.println("Static variable is "+y);
		System.out.println("Instant Variable "+obj.x);
		
	}
	
	
}