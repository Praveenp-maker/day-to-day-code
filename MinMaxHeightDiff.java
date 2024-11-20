package array;

import java.util.Arrays;

public class MinMaxHeightDiff {

	static int getMinDiffMyMethod(int[] arr, int n, int k) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + k;

		}

		int min = 0;
		int max = 0;
		min = arr[0];
		max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(min + " " + max);
		return max - min;
	}

	public static void main(String[] args) {
		int n = 2;
		int k = 4;
		int arr[] = { 1, 5, 8, 10 };
	//	System.out.print(getMinDiffMyMethod(arr, n, k));
		System.out.print(getMinCorrectMethod(arr,n,k));
	}

	private static int getMinCorrectMethod(int[] arr, int n, int k) {
		  Arrays.sort(arr);
		  for(Integer s:arr) {
		  System.out.print(s+" ");
		  }
	        // Maximum possible height difference
		  System.out.println("----------------------------------------");
		  System.out.println(arr[n - 1] +" "+ arr[0]);
	        int ans = arr[n - 1] - arr[0];
	 System.out.println("ans"+ ans);
	        int tempmin, tempmax;
	        tempmin = arr[0];
	        tempmax = arr[n - 1];
	 
	        for (int i = 1; i < n; i++) {
	 
	            // if on subtracting k we got negative then
	            // continue
	            if (arr[i] - k < 0)
	                continue;
	 
	            // Minimum element when we add k to whole array
	            tempmin = Math.min(arr[0] + k, arr[i] - k);
	            System.out.println("tempmin"+ tempmin);
	 
	            // Maximum element when we subtract k from whole
	            // array
	            tempmax
	                = Math.max(arr[i - 1] + k, arr[n - 1] - k);
	            System.out.println("tempmax"+ tempmax);
	            
	            ans = Math.min(ans, tempmax - tempmin);
	        }
	        return ans;
		
	}

}
