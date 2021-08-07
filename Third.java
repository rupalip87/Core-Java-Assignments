package PackageB;
import PackageA.*;
public class Third{
	public static void main(String[] args){
		First f = new First();
		//Third t = new Third();
		//System.out.println("i in Second : "+f.i);
		System.out.println("j in Second : "+f.j);
	}
}
