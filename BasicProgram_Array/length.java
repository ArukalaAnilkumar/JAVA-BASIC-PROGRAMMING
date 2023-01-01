package BasicProgram_Array;

import java.util.ArrayList;
import java.util.Collections;

/* 
3.	Using for- each loop Display the above array 
a.	Print the above array in reverse order   */
public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  //accessing the element    
		  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element 
		 
		  al.set(1,"Dates");  
		  //Traversing list  
		  for(String fruit:al)    
		    System.out.println(fruit);   
		  
		  Collections.reverse(al);// reverse
		  System.out.println(al);   
		  
		 }  



}
