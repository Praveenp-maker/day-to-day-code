package twopointercodingakka;

import java.util.Arrays;

public class CoupleTriplet {

	static int countTriplet(int arr[], int n) {
	      
	        Arrays.sort(arr);
	        int count =0;
	        
	        for(int i=n-1;i>=2;i--){
	            int low =0;
	            int high =i-1;
	            
	            while(low<high){
	                int sum =arr[high]+arr[low];
	                if(sum==arr[i]){
	                   count++;
	                   low++;
	                   high--;
	                }else if(sum>arr[i]){
	                    high--;
	                }
	                else{
	                    low++;
	                }
	            }
	           
	        }
	         return count;
	    }

	public static void main(String args[]) {
   int n=4;
   int arr[]= {1,5,3,2};
		
		System.out.println(countTriplet(arr,n));
		
	}
}
