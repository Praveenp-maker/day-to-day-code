package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class ContainsDuplicate {

	  public boolean containsNearbyDuplicate(int[] nums, int k) {
	        // Base case...
	        if(nums == null || nums.length < 2 || k == 0)
	            return false;
	        int i = 0;
	        // Create a Hash Set for storing previous of k elements...
	        HashSet<Integer> hset = new HashSet<Integer>();
	        // Traverse for all elements of the given array in a for loop...
	        for(int j = 0; j < nums.length; j++) {
	            // If duplicate element is present at distance less than equal to k, return true...
	            if(!hset.add(nums[j])){
	                return true;
	            }
	            // If size of the Hash Set becomes greater than k...
	            if(hset.size() >= k+1){
	                // Remove the last visited element from the set...
	                hset.remove(nums[i++]);
	            }
	        }
	        // If no duplicate element is found then return false...
	        return false;
	    }
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,1}, k=3;
		ContainsDuplicate obj =new ContainsDuplicate();
		
		System.out.println(obj.containsNearbyDuplicate(a, k));
		
//		Map<Integer, Integer> values =new HashMap<>();
//		for(int i=0;i<a.length;i++) {
//			for(int j=1;j<a.length;j++) {
//			if(a[i]==a[j] && i!=j) {
//				values.put(a[i], Math.abs(j-i));
//				if(Math.abs(j-i)<k) {
//					System.out.println("true");
//				}
//			}
//			}
//		}	
		
//		for(Entry<Integer, Integer>result :values.entrySet()) {
//			System.out.println(result.getKey()+" "+ result.getValue());
//		}
		
		
		
	}

}
