package gFGBasic;

import org.hibernate.internal.build.AllowSysOut;

public class Armstrong {

	public static void main(String[] args) {
		int start = 51;
		int end= 500;

		 for (int num = start; num <= end; num++) {
	            if (isArmstrong(num)) {
	                System.out.println(num);
	            }
	        }
	}

	static boolean isArmstrong(int num) {
		
		

		int temp = num;
		int r, arm = 0;
		int digits = String.valueOf(num).length();
//		System.out.println("digits are "+digits);
		while (num > 0) {
			r = num % 10;
			arm += Math.pow(r,digits);
			num = num / 10;
		}
		//System.out.println("temp"+temp +" "+"num"+" "+num);
		return arm == temp;
	}
}
