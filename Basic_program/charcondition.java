package Basic_program;

import java.util.Scanner;

public class charcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char value");
		
		String ch=sc.nextLine();
		
		char cha='a';
		int num =6;
		
		if(cha>='a'|| cha<='z' || cha>='A' || cha<='Z') {
			System.out.println(" char value");
		}else if(num >= 0 || num <= 9 ) {
			System.out.println(" digit value");
			
		}
		

	}

}
