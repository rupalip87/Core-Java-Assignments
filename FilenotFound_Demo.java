import java.io.*;

public class FilenotFound_Demo {

   public static void main(String args[]) {	
	try{
		FileInputStream fis = new FileInputStream("D:\\Sample1.txt");
	}catch(IOException e)
	{
		System.out.println(e);
	}
	 System.out.println("Rest of the code Continues...");
   } 
}

