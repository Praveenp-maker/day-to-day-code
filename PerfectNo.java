package codingakka;

public class PerfectNo {
	
	 static int isPerfectNumber(long N) {
	       
	       int pnum =1;
	       
	       if(N<2){
	           return 0;
	       }
	       
	       for(int i=2;i*i<=N;i++){
	           if(N%i==0){
	               pnum = pnum+i;
	               if (i != N / i) {
	                pnum += N / i; 
	                   }

	           }
	       }
	       
	       return pnum == N ? 1 : 0;
	       
	    }

	public static void main(String[] args) {
	
		
		System.out.println(isPerfectNumber(81));

	}

}
