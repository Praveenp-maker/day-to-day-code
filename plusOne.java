package array;

import java.math.BigInteger;

public class plusOne {

	
//	class Solution {
//	    public int[] plusOne(int[] digits) {
//	        StringBuilder str = new StringBuilder();
//	         for(int i:digits){
//	            str.append(i);
//	         }
//	         String strVal =str.toString();
//	           int res = Integer.parseInt(strVal);
//	            res =res+1;
//
//	         String opStr= Integer.toString(res);
//	         int opArr[] =new int[opStr.length()];
//
//	         for(int i=0;i<opStr.length();i++){
//	            opArr[i]= Character.getNumericValue(opStr.charAt(i));
//	         }
//
//	        return opArr;
//	    }
//	}
	
	
	public static void main(String[] args) {

		int a[] = {9,8,7,6,5,4,3,2,1,0};

		// Convert the array elements to a single stringBuilder
		StringBuilder sb = new StringBuilder();
		for (int num : a) {
			sb.append(num);
		}

		
	     //String builder to string
		String arr = sb.toString();
		
		// Convert the concatenated string to an integer
		
		//int a1 = Integer.parseInt(arr);
		BigInteger a1= new BigInteger(arr);

		// Add 1 to the integer
		a1 = a1.add(BigInteger.ONE);

		// Print the result
		System.out.println(a1);

		
		//int to string
		String str2 = a1.toString();
		
		
		//string to integer array
		
		int arr2[] = new int[str2.length()];

		
		
		for (int i = 0; i < str2.length(); i++) {
			arr2[i] = Character.getNumericValue(str2.charAt(i));
		}

		for (int i : arr2) {
			System.out.println(i);
		}

	}

}
