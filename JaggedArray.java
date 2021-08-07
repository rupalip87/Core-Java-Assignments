public class JaggedArray {

	public static void main(String[] args) {
				
		int M[][];
		M=new int[3][];

		M[0]=new int[2];
		M[1]=new int[4];
		M[2]=new int[3];
	
	   //Displaying Array M
		for(int i[]:M)
		{
		    for(int y:i)
		    {
		        System.out.print(y+" ");
		    }
		    System.out.println("");
		}

		      		    
		        
	}
		    
}