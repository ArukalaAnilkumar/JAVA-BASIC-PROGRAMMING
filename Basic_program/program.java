package Basic_program;

import java.util.ArrayList;

public class program {

	public static void main(String[] args) {
		
		arrayelement();

	}
	
   public static void arrayelement() {
	
	   ArrayList<Integer> al = new ArrayList<Integer>(); 
	   al.add(null);
	   al.add(23);
	   ArrayList all = new ArrayList(); 
	   
	   all.add(32);
	   all.add("Anil");
	   all.add('a');
	   all.add(null);
	   all.add(32.2);
	   
	   for(int i=1; i< all.size(); i++) {
		  System.out.println(all.get(i));
	   }
	   
}
   public static void evenement() {
	   
	   int num= 12;
	   
	   for(int i=0; i<=num; i++) {
		   if(num%2 == 0) {
			 System.out.print("even Number"+num);  
		   }
		   if(num%2 != 0) {
				 System.out.print("odd Number"+num);  
			   }
	   }
   }
   public static void SumNaturalNumber() {
	   int num=25;
	   int Sum=0;
	   for(int i=0; i< num; i++) {
		   Sum=Sum+i;
	   }
   }
   public static void assending() {
	   ArrayList<Integer> al = new ArrayList<Integer>(); 
	   int  all[]=new int[20];
	   all[0]=20;
	   String string[]= new String[20];
	   
	
			  
   }
}
