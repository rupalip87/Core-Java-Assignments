class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  

public class TestCustomException {

	 static void validate(int age)throws InvalidAgeException
	 {  
	     if(age<18)  
		 {
			 InvalidAgeException iae = new InvalidAgeException("Not valid age");
	    	 throw iae;
		 }
	     else  
	      System.out.println("welcome to vote");  
	  }  
	public static void main(String[] args) {
		try{  
		      validate(10);  
		    }
		catch(Exception e){
			System.out.println("Exception occured: "+e);
			}  
		  
		      System.out.println("Rest of the code continued!!!");  
		  }  	
	}


