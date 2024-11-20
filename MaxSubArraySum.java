package twopointercodingakka;

public class MaxSubArraySum {

    static int maxSubarraySum(int[] arr) {

    	 int res = arr[0];
    	 for (int i = 0; i < arr.length; i++) {
             int currSum = 0;  //-6
       
     
             for (int j = i; j < arr.length; j++) {
                 currSum = currSum + arr[j]; //-11
               
               
                 res = Math.max(res, currSum); //-6
             }
         }
         return res;
    }
    
   static int maxProduct(int[] arr) {
        int prod = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                prod =prod * arr[j];
                max =Math.max(max,prod);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {8 ,-2 ,-2, 0 ,8, 0 ,-6, -8 ,-6 ,-1};
        System.out.println("Maximum Subarray Sum: " + maxProduct(arr));
    }
}
