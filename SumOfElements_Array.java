/* Finding Sum of Elements*/
public class SumOfElements_Array {

	public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
               
        int sum=0;
        /*
		for(int x:A)
		{
           sum=sum+x;
		}
		*/
        for(int i=0;i<A.length;i++)
        {
        	sum=sum+A[i];
        }
        System.out.println("Sum is "+sum);
	}
}