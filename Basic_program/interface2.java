package Basic_program;

public class interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xr obj=new xr();
		obj.add();
		obj.srt();
		obj.srtffff();

	}

}
class xr implements in1{
	
	public  void srtffff() {
		System.out.println("  child method........!");
	}
	public void srt() {
		System.out.println("  Abstract Method ....!");
	}
	
}
interface in1{
	
	public void srt() ;
	default void add()
	{
		System.out.println("ANIL KUMAR YADAV ARKALA....interface....!");
	}
}

