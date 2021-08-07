
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]=new int[10];
         int B[]={1,2,3,4,5};
        
        byte C[];
        C=new byte[10];
        
        B[2]=15;
        
      /*  for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
        
        
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]);
        }
        
        
        for(int x:B)
        {
            System.out.println(x++);
        }
        for(int x:B)
        {
            System.out.println(x);
        }*/
        
        
        for(int i=0;i<B.length;i++)
        {
            System.out.println(B[i]++ + " ");
            
        }
        System.out.println(" ");
        for(int x:B)
        {
            System.out.println(x);
        }
        
        
        System.out.println("the value of array C is" + C);
    }
    
}
