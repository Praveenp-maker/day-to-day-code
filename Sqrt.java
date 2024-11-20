package codingakka;

public class Sqrt {
	
	static long floorSqrt(long n) {
	     
		   if (n == 0 || n == 1) {
	        return n; 
	    }
	    
	    long low = 0;
	    long high = n;
	    long ans = 0;

	    while (low <= high) {
	        long mid = low + (high - low) / 2;

	        if (mid * mid == n) {
	            return mid; 
	        } else if (mid * mid < n) {
	            low = mid + 1;
	            ans = mid; 
	        } else {
	            high = mid - 1;
	        }
	    }
	    return ans;
	}

	public static void main(String[] args) {

		long a=81l;
		
		
		System.out.println(floorSqrt(a));

	}

}
