package codingakka;

public class FindLastDigitPower {

	    static int getLastDigit(String a, String b) {
	        // If b is "0", then a^b is always 1 (anything raised to the power 0 is 1)
	        if (b.equals("0")) {
	            return 1;
	        }

	        // Get the last digit of a
	        int lastDigitOfA = a.charAt(a.length() - 1) - '0';

	        // If b is "0", return 1 (anything raised to the power 0 is 1)
	        if (b.equals("0")) return 1;
	        
	        // Convert the last two digits of b to an integer
	        int lastTwoDigitsOfB = 0;
	        int len = b.length();
	        if (len > 1) {
	            lastTwoDigitsOfB = Integer.parseInt(b.substring(len - 2));
	        } else {
	            lastTwoDigitsOfB = Integer.parseInt(b);
	        }

	        // Calculate the effective exponent (since last digits repeat in cycles)
	        int exponent = lastTwoDigitsOfB % 4;
	        if (exponent == 0) {
	            exponent = 4;
	        }

	        // Calculate the last digit of a^b
	        int result = (int) Math.pow(lastDigitOfA, exponent) % 10;
	        
	        return result;
	    }
	

	
	
	
	public static void main(String[] args) {
	
		String a="3";
		String b="9";
		
		int a1 = Integer.valueOf(a);
		int b1 = Integer.valueOf(b);
		
		int c =(int) Math.pow(a1, b1);
		
		int ans =c%10;
		
		//System.out.println(c+" "+ ans);
		
		
		FindLastDigitPower obj =new FindLastDigitPower();
		
		System.out.println(obj.getLastDigit("389", "67"));
		
		
		

	}

}
