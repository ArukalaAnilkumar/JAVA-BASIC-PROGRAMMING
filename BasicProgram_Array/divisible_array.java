package BasicProgram_Array;

import java.util.ArrayList;

/*
e.	Print the elements which are divisible by 4 
f.	Print the indices which are divisible by 3
*/
public class divisible_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]=new int[11];
		num[0]= 12;
		num[1]= 30;
		num[2]= 40;
		num[3]= 25;
		num[4]= 36;
		num[5]= 28;
		num[6]= 24;
		num[7]= 32;
		num[8]= 48;
		num[9]= 56;
		num[10]= 60;
		
		ArrayList<Integer> four=new ArrayList<>();
		ArrayList<Integer>three = new ArrayList<Integer>();
		
		for(int i=0; i<num.length-1; i++) {
			if(num[i]%4==0) {
				four.add(num[i]);
			}/*else if(num[i]%3== 0) {
				three.add(num[i]);
			*/
		}
		for(int i=0; i<num.length-1; i++) {
			if(num[i]%3== 0) {
				three.add(num[i]);
			}
		}
		
		System.out.println("divisible by 4");
		for(Integer f:four) {
			System.out.println(f);
		}
		System.out.println("divisible by 3");
		for(Integer t:three) {
			System.out.println(t);
		}
		

	}

}
