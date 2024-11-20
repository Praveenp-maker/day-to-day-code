package codingakka;

public class PowerDivideandconquer {

	static long power(int R, int N) {
		
	    if(R==0){
	           return 1L;
	       }
	       long pow= 1L;

	        for (int i = 0; i < R; i++) {
	            pow = pow * N;
	        }

	        return pow;
	}
	
	 static int powerVal(int x, int y)
	    {
	        if (y == 0) {
	            return 1;
	        }
	        else if (y % 2 == 0) {
	            return powerVal(x, y / 2) * powerVal(x, y / 2);
	        }
	        else {
	            return x * powerVal(x, y / 2) * powerVal(x, y / 2);
	        }
	    }

	public static void main(String args[]) {

		int a = 11;
		int b =11;

		//311668616
		
		System.out.println(power(a, b));
		
		System.out.println(powerVal(a, b));

	}

}
