package slidingWindowExp;

public class TwoSum2 {

	public static void main(String[] args) {

		
		
		int a[]= {2,3,4};
		
		 int l=0,r=a.length-1, sum=0;
		int target =6;
		while(l<r) {
			sum = a[l]+a[r];
			
			if(sum==target) {
				System.out.println((l + 1) + " " + (r + 1));
				break;
			}
			else if(sum>target){
				r--;
			}
			else {
				l++;
			}
		}
		
	
		
	}

}
