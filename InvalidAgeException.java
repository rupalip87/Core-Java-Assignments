class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  

public class TestCustomException {

	 static void validate(int age)throws InvalidAgeException
	 {  
	     if(age<18)  
	    	 throw new InvalidAgeException("Not valid age");  
	     else  
	      System.out.println("welcome to vote");  
	  }  
	public static void main(String[] args) {
		try{  
		      validate(14);  
		    }
		catch(Exception m){
			System.out.println("Exception occured: "+m);
			}  
		  
		      System.out.println("Rest of the code continued!!!");  
		  }  	
	}


