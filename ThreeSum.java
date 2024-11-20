package twopointercodingakka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	static boolean threeSumValue(int arr[], int sum) {

//		int res[] =new int[3];
//		
//		for(int i=0;i<arr.length-2;i++) {
//			for(int j=i+1;j<arr.length-1;j++) {
//				for(int k=j+1;k<arr.length;k++) {
//					if(arr[i]+arr[j]+arr[k]==sum) {
//						res[0]=arr[i];
//						res[1]=arr[j];
//						res[2]=arr[k];
//					}
//				}
//			}
//		}
//		
//		
//		return res;

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 2; i++) {
			int low = i + 1;
			int high = arr.length - 1;

			while (low < high) {

				int sumVal = arr[i] + arr[low] + arr[high];

				if (sumVal == sum) {
					return true;
				} else if (sumVal > sum) {
					high--;
				} else {
					low++;
				}

			}
		}
		return false;

	}

//	public static List<List<Integer>> threeSum(int[] nums) {
//		List<List<Integer>> res = new ArrayList<>();
//		int n = nums.length;
//		if (n > 3) {
//			for (int i = 0; i < n - 2; i++) {
//				int low = i + 1, high = n - 1;
//				while (low < high) {
//					int sum = nums[i] + nums[low] + nums[high];
//					if (sum == 0) {
//						List<Integer> d = new ArrayList<>();
//						d = Arrays.asList(nums[i] + nums[low] + nums[high]);
//						res.add(d);
//						low++;
//						high--;
//					}else if(sum>0){
//						high--;
//					}
//					else {
//						low++;
//					}
//				}
//			}
//		} else {
//			return null;
//		}
//		return res;
//	}

	public static List<List<Integer>> threeSum(int[] nums) {
	    List<List<Integer>> res = new ArrayList<>();
	    int n = nums.length;

	    // If array has less than 3 elements, no triplet is possible
	    if (n < 3) {
	        return res; // returning empty list instead of null for better usability
	    }

	    // Sort the array to use the two-pointer technique
	    Arrays.sort(nums);

	    for (int i = 0; i < n - 2; i++) {
	        // Skip duplicates for the first element
	        if (i > 0 && nums[i] == nums[i - 1]) continue;

	        int low = i + 1, high = n - 1;
	        while (low < high) {
	            int sum = nums[i] + nums[low] + nums[high];
	            
	            System.out.println( "values"+ nums[i] +" "+ nums[low] +" "+ nums[high] +" sum"+ sum);
	            if (sum == 0) {
	                // Add the triplet to the result
	                res.add(Arrays.asList(nums[i], nums[low], nums[high]));

	                // Move low and high pointers and skip duplicates
	                while (low < high && nums[low] == nums[low + 1]) low++;
	                while (low < high && nums[high] == nums[high - 1]) high--;

	                low++;
	                high--;
	            } else if (sum > 0) {
	                high--;
	            } else {
	                low++;
	            }
	        }
	    }
	    return res;
	}

	
	public static void main(String args[]) {

		int arr[] = {-1,0,1,2,-1,-4,-1};
	//	int sum = 24;
//		Output: 12, 3, 9 

	//	System.out.println(threeSumValue(arr, sum));
		
		
		List<List<Integer>> fin	 =threeSum(arr);
		
		System.out.println(fin.toString());

	}
}
