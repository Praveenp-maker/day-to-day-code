package array;

public class RemoveElement {

	
	  public int removeElement(int[] nums, int val) {
	        int k =0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==val){
	               nums[k]=nums[i];
	                k++;
	            }
	        }
	        
	        for(int i: nums) {
	        	System.out.println(nums[i]);
	        }
	      return k;  
	  }
	public static void main(String[] args) {
	
		RemoveElement obj =new RemoveElement();
		
		int u[]={3,2,2,3};
		obj.removeElement(u,2);
	}

}
