import java.util.Scanner;

public class ArraysToMethod {
   public int Maximum_Element(int [] array) {
      int max = array[0];

      for(int i=1; i<array.length; i++ ) {
         if(max<array[i]) {
            max = array[i];
         }
		
      }
	  array[4] = 1000;	  
      return max;
   }
   
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array that is to be created::");
      int size = sc.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter the elements of the array ::");

      for(int i=0; i<size; i++) {
         arr[i] = sc.nextInt();
      }
      ArraysToMethod m = new ArraysToMethod();
	  //int max = m.Maximum_Element(arr);
      System.out.println("Maximum value in the array is::"+m.Maximum_Element(arr));
      
	  System.out.println("Array Elements in main ");
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i] + " ");
	  
   }
}