package BasicProgram_Array;

import java.util.ArrayList;

/* c.	Print only even indexed elements
d.	Print only odd indexed elements   */
public class evenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] =new int[]{2,3,4,5,6,7};
		
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer>oddList = new ArrayList<Integer>();
		
		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0) {
				even.add(num[i]);
			}else if(num[i]%2==1) {
				oddList.add(num[i]);
			}
		}
		
		 System.out.println(" Even value"); 
		  for(Integer evennum:even)    
			    System.out.println(evennum);  
		  
			 System.out.println(" odd value"); 
		  for(Integer oddnum:oddList)    
			    System.out.println(oddnum);   

	}

}
