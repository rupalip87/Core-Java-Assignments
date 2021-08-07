public class ExceptionArray{

	public static void main(String [] args){
	
	int [] x ={1,2,3,4,5};
	try{
	for(int i=0;i<=x.length;i++){
		System.out.println(x[i]);
	}
	}catch(ArrayIndexOutOfBoundsException aiobe)
	{
		System.out.println(aiobe);
	}
	catch(IndexOutOfBoundsException iobe){
		System.out.println(iobe);
	}
	catch(RuntimeException re){
		System.out.println(re);
	}
	catch(Exception e){
	
		System.out.println(e);
	}
	
	System.out.println("Continue");
	}
}