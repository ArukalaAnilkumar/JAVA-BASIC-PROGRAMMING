package BasicProgram_Array;
/*  
  b.	Divide the array into two equal halves 
  i.	Print the First half in reverse order andt the whole array print
  ii.	Print the Second half in reverse order and print the whole array 
*/
public class half_array {

	public static void main(String[] args) 
	{
		int n[]= {12,10,11,45,1,7,5,44};  
		int l=(n.length/2)-1; 
	
		for(int i=l;i>=0;i--)
			System.out.print(n[i]+" ");
	
		for(int i=l+1;i<n.length;i++)
			System.out.print(n[i]+"  ");
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int temp=0;
//		for(int i=0; i<num.length/2; i++) {
//			
//			
//				for(int J=i+1; J<num.length/2; J++) {
//					temp=num[J];
//					num[J]=num[i];
//					num[i]=temp;
//				}
//				System.out.println(num[i]);
//					
//			
//		}
//		
//		for(int i=num.length/2; i<num.length; i++) {
//			for(int J=i+1; J<num.length/2; J++) {
//				temp=num[J];
//				num[J]=num[i];
//				num[i]=temp;
//			}
//			System.out.println(num[i]);
//				
//		}
//	}


