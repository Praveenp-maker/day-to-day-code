package twopointercodingakka;

public class Trappingrainwater {
	
   static long trappingWater(int arr[])
	{
	    int left = 0;
	    int right = arr.length- 1;
	    
	     long leftMax = 0L;
	     long rightMax = 0L;
	     long waterTrapped = 0;

	    while (left < right) 
	    {
	        if (arr[left] < arr[right]) 
	        {
	            if (arr[left] >= leftMax) 
	            {
	                leftMax = arr[left];
	            } 
	            
	            else 
	            {
	                waterTrapped += leftMax - arr[left];
	            }
	            left++;
	            
	        } 
	        else
	        {
	            
	            if (arr[right] >= rightMax) 
	            {
	                rightMax = arr[right];
	            }
	            
	            else 
	            {
	                waterTrapped += rightMax - arr[right];
	            }
	            right--;
	        }
	    }

	    return waterTrapped;
	 }
   
   public static void main(String args[]) {
	   
	   int arr[] = {3,0,0,2,0,4};
	   
	   System.out.println(trappingWater(arr));
	   
	};

}
