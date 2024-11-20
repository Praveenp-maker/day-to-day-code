package codingakka;

import java.util.Arrays;

public class ArrCompare {

	static boolean checkEqual(int arr1[],int arr2[]) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean flag = Arrays.equals(arr1, arr2);
		
		
		return flag;
	}
	
	public static void main(String[] args) {

		int a[]= {1,33,2,89};
		int b[]= {2,33,1,89};
		
		
		System.out.println(checkEqual(a,b));

	}

}
