package stringEx;

import java.util.HashSet;

public class HayyNuMin {

	  static int sumOfSquaresOfDigits(int n) {
	        int sum = 0;
	        while (n > 0) {
	            int digit = n % 10;
	            n = n / 10;
	            sum += digit * digit;
	        }
	        return sum;
	    }
	  
	public static void main(String[] args) {
	
	

		         HashSet<Integer> seen = new HashSet<>();
                  int n=497;
                  
		        while (n != 1 && !seen.contains(n)) {
		            seen.add(n);
		            n = sumOfSquaresOfDigits(n);
		        }
		        
		       if(n==1) {
		    	   System.out.println("true");
		       }
		       else {
		    	   System.out.println("false");
		       }
		    }
		    
		  
		



}
