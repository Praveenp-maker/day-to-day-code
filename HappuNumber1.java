package stringEx;

public class HappuNumber1 {


		
	
		public int square(int num) {
	        
	        int ans = 0;
	        
	        while(num > 0) {
	            int remainder = num % 10;
	            ans += remainder * remainder;
	            num /= 10;
	        }
	        
	        return ans;
	    }
		
		public static void main(String[] args) {
		        
		        int slow = 49;
		        int fast = 49;
		        
		        HappuNumber1 obj =new HappuNumber1();
		//while loop is not used here because initially slow and 
		//fast pointer will be equal only, so the loop won't run.
		        do {
		//slow moving one step ahead and fast moving two steps ahead

		            slow = obj.square(slow);
		            fast = obj.square(obj.square(fast));
		        } while (slow != fast);

		//if a cycle exists, then the number is not a happy number
		//and slow will have a value other than 1

		      if(slow != fast) {
		    	  System.out.println("false");
		      }else {
		    	  System.out.println("true");
		      }
		    }
		    
		//Finding the square of the digits of a number

		    
		
	

}
