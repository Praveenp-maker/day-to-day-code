package slidingWindowExp;

public class SmallSubString {
	
	
	static int findSmalledSubArray(int a[], int target) {
		
		int minValue =Integer.MIN_VALUE;
		int windowstart =0;
		int windowEnd =0;
		int currentWindowSum =0;
		
		for( windowEnd=0; windowEnd<a.length;windowEnd++) {
			currentWindowSum  += a[windowstart];
			
			while(currentWindowSum>=target) {
				minValue =Math.min(minValue, windowEnd -windowstart+1);
				currentWindowSum -= a[windowstart];
				windowstart++;
			}
			
		}
		
		
		return minValue;
	}

	public static void main(String[] args) {
		
		
		int a[]= new int[] {2,3,1,2,4,3};
		int target =7;
		
		System.out.println(findSmalledSubArray(a,target));
		
		
		

	}

}
