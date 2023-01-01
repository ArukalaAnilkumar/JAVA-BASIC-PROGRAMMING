package Basic_program;

public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asdfchild obj= new asdfchild();
		obj.add();
		obj.srt();
		obj.srtffff();
		obj.asdabstract();
	}

}

abstract class asd implements ascfinterface {
	
	public  abstract void srt() ;
		public static void asdabstract() {
			System.out.println(" concreate method......!");
		}
	
}
class asdfchild extends asd{
	
	public  void srtffff() {
		System.out.println("  child method........!");
	}
	public void srt() {
		System.out.println("  Abstract Method ....!");
	}
	
}

 interface ascfinterface{
	
	default void add()
	{
		System.out.println("ANIL KUMAR YADAV ARKALA....interface....!");
	}
}

