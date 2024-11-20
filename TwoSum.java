package array;

public class TwoSum {

//	public int[] twoSum(int[] nums, int target) {
//	      int ans[]=new int[2];
//	        for(int i=0;i<nums.length-1;i++ ){
//	            if(nums[i]+nums[i+1]==target){
//	                ans[0]=i;
//	                ans[1]=i+1;
//	            }else if(i==0 && nums[i]+nums[i+2]==target) {
//	            	ans[0]=i;
//	                ans[1]=i+1;
//	            }
//	        }
//	        return ans;
//	}

	    public int[] twoSum(int[] nums, int target) {
	    int a[]=new int[2];
	    	for(int i=0;i<nums.length;i++){
	        for(int j=i+1;j<nums.length;j++){
	            if(nums[i]+nums[j]==target){
	                return new int[]{i,j};
	            }
	        }
	    }
	    return new int[]{};
	}   

	
	
	public static void main(String[] args) {
	
		TwoSum obj =new TwoSum();
		
		int nums[]= {3,2,3};
		System.out.println(nums.length);
		int op[] = obj.twoSum(nums, 6);
		
		for(int i=0;i<op.length;i++) {
			System.out.println(op[i]);
		}
		
		
	}

}
