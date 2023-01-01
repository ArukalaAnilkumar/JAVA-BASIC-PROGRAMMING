package Basic_program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList array= new ArrayList();
		
		array.add(null);
		array.add(2);
		array.add('a');
		array.add("anil");
		array.add("kumar");
		//array.addAll(2, array);
		array.addAll(array);
		
		System.out.println(array);
		
		ListIterator i=array.listIterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		while(i.hasPrevious()) {
			System.out.print(i.previous()+" ");
		}
		System.out.println();
		while(i.hasPrevious()) {
			System.out.print(i.previous()+" ");
		}
		
		//Collection.reverse(array);
		 Collections.reverse(array);
		 System.out.println(array);
	}

}
