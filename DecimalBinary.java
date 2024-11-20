package conversion;

import java.util.Scanner;

public class DecimalBinary {

	public static void main(String[] args) {
	
		
		Scanner u=new Scanner(System.in);
	
		//decimal to binary
		//int num=17;
//		int i=0;
//		int[] array=new int[1000];
//		while(num>0) {
//			array[i]=num%2;
//			num=num/2;
//			i++;
//		}
//		for(int j=i-1;j>=0;j--) {
//			//System.out.print(array[j]);
//		}
		
		
		
		//Binary to decimal
		
		
		
		int n=1110;
		int lastnum=1;
		int base=1;
		int value=0;
		while(n>0) {
			lastnum=n%10;
			value+=lastnum*base;
			n=n/10;
			base=base*2;
			
			
		}
		System.out.println(value);
		
           
		
//		int num = 1010;
//        int dec_value = 0;
// 
//        
//        int base = 1;
// 
//        int temp = num;
//        while (temp > 0) {
//            int last_digit = temp % 10;
//            temp = temp / 10;
// 
//      dec_value += last_digit * base;
// 
//            base = base * 2;
//        }
//		System.out.println(dec_value);
		
	}

}
