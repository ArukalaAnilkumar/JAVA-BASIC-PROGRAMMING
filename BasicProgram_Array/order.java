package BasicProgram_Array;
//7.	Sort the array elements both in ascending and descending order
//a.	First half in ascending order, second half in descending order
public class order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]={2,8,56,23,25,49,50};
		System.out.println("assending order");
		for(int i=0; i<num.length; i++) {
			int temp;
			for(int j=i+1; j< num.length; j++) {
			
				if(num[i]< num[j]) {
					temp = num[j];
					num[j] =num[i];
					num[i]= temp;
					}
				
			}
			System.out.println(num[i]);
			
		}
		System.out.println("desending  order");
		for(int i=0; i<num.length; i++) {
			int temp;
			for(int j=i+1; j< num.length; j++) {
			
				if(num[i]> num[j]) {
					temp = num[j];
					num[j] =num[i];
					num[i]= temp;
					}
				
			}
			System.out.println(num[i]);
			
		}
		System.out.println("first half assending order");
		for(int i=0; i<num.length/2; i++) {
			int temp;
			for(int j=i+1; j< num.length/2; j++) {
			
				if(num[i]< num[j]) {
					temp = num[j];
					num[j] =num[i];
					num[i]= temp;
					}
				
			}
			System.out.println(num[i]);
			
		}
		System.out.println(" Secound half desending  order");
		for(int i=num.length/2; i<num.length; i++) {
			int temp;
			for(int j=i+1; j< num.length; j++) {
			
				if(num[i]>num[j]) {
					temp = num[j];
					num[j] =num[i];
					num[i]= temp;
					}
				
			}
			System.out.println(num[i]);
			
		}
		

	}

}
