package Basic_program;

import java.util.Scanner;

public class numcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter boy and girl age");
		
		int boyage=sc.nextInt();
		int girlage=sc.nextInt();
		
		if(boyage>=21 || girlage >= 18) {
			System.out.println("Eligible Marge");
		}else {
			System.out.println(" not Eligible Marge");	
		}
		

	}

}
