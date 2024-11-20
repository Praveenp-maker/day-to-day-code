package com.workout.dayToDay;

public class Palindrome {

	public static void main(String[] args) {
		String pal="deed";
		
		String rev="";
		for(int i=0;i<pal.length();i++) {
			char ch=pal.charAt(i);
			rev=ch+rev;
		}
        System.out.println(rev);
		
		if(pal.toLowerCase().equals(rev.toLowerCase())){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		
		
//		int a=121;
//		int sum=0,r;
//       int temp=a;
//		while(a>0) {
//			r=a%10;
//			sum=(sum*10)+r;
//			a=a/10;
//		}
//		
//			if(temp==sum) {
//		System.out.println("pal");
//			}else {
//				System.out.println("not");
//			}
//	}
	}
}
