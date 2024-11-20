package array;

import java.util.HashSet;

public class UnionofArrays {

	
	static void count(int a[],int b[]) {
		int count =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
		}
		
		int length=a.length+b.length;
		
	//	System.out.println(length-count);
	}
	public static void main(String[] args) {

		
		int a[]= {45,-9,1,5,8,9,-877,8};
		int b[]= {3,4,45,9};
		
		count(a,b);
		unioniteams(a,b);

	}
	private static void unioniteams(int[] a, int[] b) {
		
		HashSet<Integer> hash=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
		  hash.add(a[i]);
		}
		
		for(int j=0;j<b.length;j++) {
			  hash.add(b[j]);
			}
		
	
		System.out.println(hash.toString());
		
		
	}

}
