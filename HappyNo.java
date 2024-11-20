package stringEx;

public class HappyNo {

	public static void main(String[] args) {
		
		
		int num=49;
		
		//String val = String.valueOf(a);
		
		boolean v =false;
	
//		while(!v) {
//			
//		for(int i=0;i<val.length();i++) {
//			String oneVal = String.valueOf(val.charAt(i));
//			a = Integer.parseInt(oneVal)*Integer.parseInt(oneVal);
//		}
//		if(a ==1) {
//			v= true;
//		}
//		v=false;
//		
//		}
		int ans =0;
		
		  while(num > 0) {
	            int remainder = num % 10;
	            ans += remainder * remainder;
	            num /= 10;
	        }
		
		System.out.println(ans); 

	}

}
