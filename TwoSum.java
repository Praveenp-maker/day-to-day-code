package twopointercodingakka;

import java.util.Arrays;

public class TwoSum {

	  static boolean twoSum(int arr[], int target) {
	       
	       Arrays.sort(arr);
	       int low=0;
	       int high =arr.length-1;
	       
	       while(low<high){
	           if(arr[low]+arr[high]==target){
	               return true;
	           }else if(arr[low]+arr[high]>target){
	               high--;
	           }else {
	               low++;
	           }
	           
	         }
	       return false;
	       
	  }
	
	
	public static void main(String[] args) {
		
	int	arr[] = {1, 4, 45, 6, 10, 8};
			int target =16;
			
			System.out.println(twoSum(arr,target));

	}

}
