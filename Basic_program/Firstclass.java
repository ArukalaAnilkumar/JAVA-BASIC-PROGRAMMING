package Basic_program;
// dirct access the varible and method class to class
public class Firstclass {

	int i=12;
	static int j=25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("form main() of Firstclass");
		System.out.println(Scondclass.l);
		Scondclass obj=new Scondclass();
		//System.out.println(obj.k); local varible
		System.out.println(obj.m);

	}
	public void learn() {
		int c=i+j;
		System.out.println(c);
	}
	public static void learnstatic() {
		int i=26;
		int c=i+j;
		System.out.println(c);
	}


}
