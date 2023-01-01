package Basic_program;
//dirct access the varible and method class to class
public class Scondclass {

	static int l=108;
	int m=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Firstclass.j);
		//System.out.print(j); error
		Firstclass obj= new Firstclass();
	//	obj.i; error
		System.out.print(obj.i);
		System.out.println(obj.j);
		obj.learn();
		obj.learnstatic();
		Firstclass.learnstatic();
		
		System.out.println("from main() of Scondclass");// use for send the data firstclass 
		int k=100;
	}

}
