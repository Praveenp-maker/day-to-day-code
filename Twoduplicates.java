package array;

import java.util.HashSet;

public class Twoduplicates {

	public static void main(String[] args) {
//		Approach 1
//	String arr[]= {"java","python","c","c++"};
//	boolean flag=false;
//	for(int i=0;i<arr.length;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]==arr[j]) {
//				System.out.println("duplicate"+ arr[i]);
//				flag=true;
//			}
//		}
//	}
//	if(flag==false) {
//		System.out.println("no duplicates");
//	}
		
		//Approach 2
		Integer arr[]= {12,34,67,89,54,12,67,87,56,0};
		HashSet<Integer>lang=new HashSet<>();
		boolean flag=false;
		for(int i:arr) {
			if(lang.add(i)==false) {
			System.out.println("duplicate value"+ i);
			flag=true;
			}
		}
		if(flag==false) {
			System.out.println("no duplicates");
		}
		
		
	}

	
	
}
