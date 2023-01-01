package Basic_program;

public class adstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Maheshphone obj=new child() ;  //UP CA
	   obj.call();
	   obj.de();
	   
	}

}
abstract class Maheshphone{  // 0-100
	
	public abstract void call(); // abstract method 
	
	public void de()  //CONCRETE METHOD 
	{
		System.out.println("CONCRETE METHOD ");
	}
	
}







class child extends Maheshphone
{
@Override
public void call() {
	System.out.println("HIDING PART ... WE RE IMPLEMENTING HERE");
}
}

