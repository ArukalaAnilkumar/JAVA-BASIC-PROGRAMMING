package Basic_program;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="100";
		System.out.println("int value");
		int i=100;
		Integer obj=Integer.valueOf(i);
		
		String intstr=obj+str;
		System.out.println(intstr);
		/*
		System.out.println("unboxing value");
		
		Integer objun=Integer(100);
		int num=objun.intValue();
		int num2=num+100;
		//int num=objun;
		System.out.println(num2);
		System.out.println("*************");
		*/
		
		System.out.println("float value");
		
		float fi=100f;
		Float objf=Float.valueOf(fi);
		
		String intstrf=objf+str;
		System.out.println(intstrf);
		
		System.out.println("Double value");
		Double Di=100.0;
		Double objD=Double.valueOf(Di);
		
		String intstrd=objD+str;
		System.out.println(intstrd);
		
		System.out.println("Long value");
		long Li=10;
		Long objL=Long.valueOf(Li);
		
		String intstrL=objL+str;
		System.out.println(intstrL);
	
		System.out.println("Char value");
		char chi='a';
		Character objch=Character.valueOf(chi);
		
		String intstrch=objch+str;
		System.out.println(intstrch);
	
	
		
		
		
		

	}

	private static Integer Integer(Integer obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
