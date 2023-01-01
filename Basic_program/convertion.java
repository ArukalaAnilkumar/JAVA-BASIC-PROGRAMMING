package Basic_program;

public class convertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=(int)2.5;
		System.out.println(i);
		double di= (double) 2;
		System.out.println(di);
		
		
		float j=2.5f;
		System.out.println(j);
		float k=(float)2.5;
		System.out.println(k);
		double df= k;
		System.out.println(df+" df");
		
		double d=2.5;
		int l= (int) d;
		System.out.println(l);
		String str="30";
		double d1= Double.valueOf(str);
		System.out.println(d1);
		String value=String.valueOf(d1);
		System.out.println(d1);
		long lon=Double.doubleToLongBits(2.5);
		System.out.println(lon);

	}

}
