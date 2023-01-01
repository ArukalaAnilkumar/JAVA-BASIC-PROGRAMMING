package BasicProgram_Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*  1.	Insert  & Display the below elements in the array (use both compile time & run time 
  initialization)
a.	139 , 12 , 34 , 5 , 566 , 7
b.	‘c’ , ’3’  ,  ’(‘ ,  ’?’
c.	“hello”, ”all”, ”good” , ”Morning” , ”453” ,  ”?<>|+_”
d.	true , false , true , false , true , true 
Find the length of all the above arrays   */
public class Arrayinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Arrayvalue();
		Arraystring();
		System.out.println("Enter the Array 6 value");
		int[] num= new int[6];
		
		for(int i=0; i<=num.length; i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);    
		}
	}

	public static void Arrayvalue() {
		ArrayList value=new ArrayList();
		
		value.add('c');
		value.add('3');
		value.add('(');
		value.add('?');
		
		System.out.println(value);
		System.out.println(value.size()+"Size");
		
		  Iterator itr=value.iterator();
		  while(itr.hasNext()){
		   System.out.println(itr.next());
		  }  
	
	
}
	public static void Arraystring() {
		
		ArrayList value=new ArrayList();
		
		value.add("hello");
		value.add("all");
		value.add("good");
		value.add("Morning");
		value.add("453");
		value.add("?<>|+_");
		

		System.out.println(value);
		System.out.println(value.size()+" Size");
		
		  Iterator itr=value.iterator();
		  while(itr.hasNext()){
		   System.out.println(itr.next());
		  }  
	}
		
	}
