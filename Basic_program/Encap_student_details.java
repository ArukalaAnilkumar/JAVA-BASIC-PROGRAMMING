package Basic_program;
//encapsulation
public class Encap_student_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encap_student obj= new Encap_student();
		obj.setName("Anil");
		obj.setRollnum("18Q65A0403");
		obj.setDateofbirth("16/04/1997");
		obj.setPhonenum("703259255");
		
		System.out.println(obj);
		System.out.println(obj.getName());
		System.out.println(obj.getRollnum());
		System.out.println(obj.getDateofbirth());
		System.out.println(obj.getPhonenum());
		System.out.println(obj.getClass());
		
		Encap_student obj1= new Encap_student("rakesh", "2525","01/01/2001","709507564");
		System.out.println(obj1);
		System.out.println(obj1.getName());
		System.out.println(obj1.getRollnum());
		System.out.println(obj1.getDateofbirth());
		System.out.println(obj1.getPhonenum());
		System.out.println(obj1.getClass());
		
		
	}

}
