package Basic_program;

import java.util.Scanner;

public class diomandstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter volue");
		
		int size=sc.nextInt();
		
		int star=size+1, space=-1; 
		
		for(int i=0; i<size; i++) {
			space++;
			star--;
			
			for(int J=0; J<space; J++) {
				System.out.print(" ");
			}
			for(int J=0; J<star; J++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
