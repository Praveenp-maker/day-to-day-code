package array;



import java.util.Arrays;

public class MajorityElement {

	public int majority(int nums[]){ 
		int n = nums.length;
	
		 Arrays.sort(nums);
	        int ni = nums.length;
	        return nums[ni/2];
	        
//    Map<Integer, Integer> map = new HashMap<>();
//    
//    for (int i = 0; i < n; i++) {
//        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//    }
//    
//    n = n / 2;
//    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//        if (entry.getValue() > n) {
//            return entry.getKey();
//        }
//    }
//	return 0;
	}
	
	public static void main(String[] args) {
		
		MajorityElement n=new MajorityElement();
		int nums[]= {1,4,2,5,7,1};
		System.out.println(n.majority(nums));

	}

}
