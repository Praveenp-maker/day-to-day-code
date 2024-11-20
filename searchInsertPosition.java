package array;

public class searchInsertPosition {

	public int search(int nums[], int target) {
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==target) {
//				return i;
//			}else if(arr[i]<target && target<arr[i+1]) {
//				return i+1;
//			}
//		}
//
//		return 0;
		
		int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start + end)/2;
          
            if (nums[mid] == target) {
            	return mid;
            }
            else if (nums[mid] > target) {
            	end = mid-1;
            }
            else {
            	start = mid+1;
            }
        }

        return start;
		
		
	}
	
	
	public static void main(String[] args) {
	
		int nums[]= {1,3,5,6,7,8,9};
		
		searchInsertPosition obj =new searchInsertPosition();
		System.out.println(obj.search(nums,2));
		
	}

}
