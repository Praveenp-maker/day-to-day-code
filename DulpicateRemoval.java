package array;

public class DulpicateRemoval {

	 public int removeDuplicates(int[] nums) {
	        int k=0;
	        int nu[]=new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	            for(int j=0;j<nums.length;j++){
	                if(nums[i]!=nums[j]){
	                  k++;
	                 nu[i]= nums[i];
	                }
	            }
	        }
	        nums =nu;
	        for(int i :nu) {
	        System.out.println(nums[i]);
	        }
	        return k;
	        
	       
	    }
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,2};
		
		DulpicateRemoval obj =new DulpicateRemoval();
		obj.removeDuplicates(arr);

	}

}
