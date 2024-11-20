package twopointercodingakka;

public class LengthOfLarSubArray {

//	// Function to find the longest subarray
//	// with increasing contiguous elements
//	public static int maxiConsecutiveSubarray(int arr[],
//	                                          int N)
//	{
//	     
//	    // Stores the length of
//	    // required longest subarray
//	    int maxi = 0;
//	 
//	    for(int i = 0; i < N - 1; i++) 
//	    {
//	         
//	        // Stores the length of length of
//	        // longest such subarray from ith
//	        // index
//	        int cnt = 1, j;
//	 
//	        for(j = i; j < N - 1; j++)
//	        {
//	             
//	            // If consecutive elements are
//	            // increasing and differ by 1
//	        	System.out.println(arr[j + 1]); 
//	        	System.out.println(arr[j] + 1 );
//	        	System.out.println("_---------------------------");
//	            if (arr[j + 1] == arr[j] + 1) 
//	            {
//	                cnt++;
//	            }
//	 
//	            // Otherwise
//	            else
//	            {
//	                break;
//	            }
//	        }
//	 
//	        // Update the longest subarray
//	        // obtained so far
//	        maxi = Math.max(maxi, cnt);
//	        i = j;
//	    }
//	 
//	    // Return the length obtained
//	    return maxi;
//	}

//	static int maxiConsecutiveSubarray(int arr[], int n, int k) {
//		int len = 0;
//
//		for (int i = 0; i < n ; i++) {
//			int sum = 0;
//			for (int j = i; j < n ; j++) {
//                for (int o = i; o <= j; o++) {
//					sum += arr[o];
//					
//					if (sum == k) {
//						len = Math.max(len, j - i + 1);
//					}
//
//				}
//			}
//		}
//
//		return len;
//	}
	
	
	static int maxiConsecutiveSubarray(int arr[], int n, int k) {
	    int len = 0;

	    for (int i = 0; i < n; i++) {  // iterate over each element
	        int sum = 0;
	        for (int j = i; j < n; j++) {  // consider each subarray starting at i
	            sum += arr[j];  // accumulate the sum of the subarray
	            
	            if (sum == k) {
	                len = Math.max(len, j - i + 1);  // update the length of the largest subarray
	            }
	        }
	    }

	    return len;  // return the length of the largest subarray
	}


	// Driver Code
	public static void main(String args[]) {
		int N = 6, K = 15;
		int arr[] = { 10, 5, 2, 7, 1, 9 };

		System.out.println(maxiConsecutiveSubarray(arr, N, K));
	}
}
