package com.workout.dayToDay;

public class Stringarray {

	public static void main(String[] args) {
		
		String arr[]=new String[] {"monday","tuesday","wednedday","thursday","friday","saturday","sunday"};
		System.out.println(arr.length);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}

		//reverse of string values
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
		
		String ip="nobodylike";
		
		String rev="";
		for(int i=0;i<ip.length();i++) {
			char ch=ip.charAt(i);
			rev=ch+rev;
		}
		
		System.out.println(rev);
		
	}

}
