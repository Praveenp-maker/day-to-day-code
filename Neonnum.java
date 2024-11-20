package gFGBasic;

public class Neonnum {

	public static void main(String[] args) {
	int x=0;
	int y=500;
	for(int i=x;i<y;i++) {
		if(isneon(i)) {
			System.out.println(i);
		}
	}

	}

	
	static boolean isneon(int num) {
		int temp=num;
		int rem,sum=0;
		int sqr=num*num;
		while(sqr>0) {
			rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
			
		}
	//	System.out.println("temp"+temp+" "+"sum"+ sum);
		return temp==sum;
		
	}
}
