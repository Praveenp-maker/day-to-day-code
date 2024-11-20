package codingakka;

public class PrintAllDivisors {

	public static void main(String[] args) {
   
		int a=24;
		
		int temp =a;
		int temh =a/2;
		
		for(int i=1;i<a/2;i++) {
			if(a%i==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println(Math.sqrt(36));

	}

}
