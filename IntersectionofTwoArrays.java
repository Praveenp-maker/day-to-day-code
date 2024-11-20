package array;

import java.util.ArrayList;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {

		int a[]= {45,-9,1,5,8,9,-877,8};
		int b[]= {3,4,45,9};
		intersection(a,b);
		
		

	}

	private static void intersection(int[] a, int[] b) {
		
		ArrayList<Integer> inter=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					inter.add(a[i]);
				}
			}
		}
		
		for(Integer i: inter) {
			System.out.print(i+" ");
		}
	}

}
