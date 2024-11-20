package codingakka;

public class ReverseNo {

	public static void main(String[] args) {
		
		int a=300;
		
		int rev =0;
		int temp =a;
		
		while(temp>0) {
		int last=temp%10;   
			rev =rev*10+ last;       
			temp =temp/10;   
		}
		
		System.out.println(rev);
		
		
		int ex =11;
		
		int x=11;
		
		 long ans =(long) Math.pow(11,11);
		 
		// 311668616
		  
   System.out.println(ans);
	}

}
