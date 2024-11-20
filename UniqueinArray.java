package gFGBasic;

import java.util.Arrays;

public class UniqueinArray {

	public static void main(String[] args) {
		//list of no without duplicates
		int arr[] = new int[] { 1, 2, 3, 2, 1 };
//		int n = arr.length;
//		for (int i = 0; i < n; i++) {
//			int j;
//			for (j = 0; j < i; j++)
//				if (arr[i] == arr[j]) {
//					break;
//				}
//			if (i == j) {
//				System.out.print(arr[i] + " ");
//			}
//		}
		
	Arrays.sort(arr);
	for(int i=0;i<arr.length-1;i++) {
	//	if(arr[i]==arr[i+1]) {             ------>duplicates
	if(arr[i]!=arr[i+1]) {
	System.out.println(arr[i]);
	}
	}
	System.out.println(arr[arr.length-1]);
	
	

}
}