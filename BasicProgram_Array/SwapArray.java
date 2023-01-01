package BasicProgram_Array;

public class SwapArray {
//6.	Swap the adjacent elements in the array
	public static void main(String[] args) {      //problem
		// TODO Auto-generated method stub
		
		int num[]= new int[6];
		num[0]= 12;
		num[1]= 30;
		num[2]= 40;
		num[3]= 25;
		num[4]= 36;
		num[5]= 28;
		int temp=0;
		for(int i=0; i<num.length; i++) {
			for(int J=i+1; J<num.length; J++) {
				temp=num[i];
				num[i]=num[J];
				num[J]=temp;
				System.out.println(num[J]);
			}
			
				
		}

	}
	public static void reverse() {

		int num[]= new int[6];
		num[0]= 12;
		num[1]= 30;
		num[2]= 40;
		num[3]= 25;
		num[4]= 36;
		num[5]= 28;
		int temp=0;
		for(int i=0; i<num.length; i++) {
			for(int J=i+1; J<num.length; J++) {
				temp=num[J];
				num[J]=num[i];
				num[i]=temp;
			}
			System.out.println(num[i]);
				
		}

	}

}
