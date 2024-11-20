package codingakka;

public class GCDVSLCM {

	public static int gcd(int a, int b) {
	    while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}

	
	
	public static void main(String args[]) {

		//GCD
		int a = 16;
		int b = 8;
		int temp = Math.min(a, b);

		while (temp > 1) {
			if ((a % temp) == 0 && (b % temp) == 0) {
				break;
			}
			temp--;
		}

		System.out.println(temp);

		
		
		
		
//LCM
		
		 // Numbers
        int a1 = 15, b1 = 25;

        // Checking for the largest
        // Number between them
        int ans = (a1 > b1) ? a1 : b1;

        // Checking for a smallest number that
        // can de divided by both numbers
        while (true) {
            if (ans % a1 == 0 && ans % b1 == 0)
                break;
            ans++;
        }

        // Printing the Result
        System.out.println("LCM of " + a1 + " and " + b1
                           + " : " + ans);
        
        
        
        System.out.println(gcd(6,26));
        
        System.out.println(8%17 +" "+ 1/9);
	}
}
