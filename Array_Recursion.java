/*Recursive algorithm involving array */

public class Array_Recursion{
 public static int calculateSum(int arr[], int n) {
 
          if (n <= 0) {
            return 0;
          }
           
          return arr[n-1] + calculateSum(arr, n-1 );
       }
 
      public static void main(String[] args) {
 
         int arr[] = {1,2,3,4,5};
       
          System.out.println(calculateSum(arr, arr.length));
      }
  }
  
  