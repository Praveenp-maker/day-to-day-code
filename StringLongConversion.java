package conversion;

import java.util.Scanner;

public class StringLongConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//1/STRING TO LONG
		//String str = "999999";

		//Long l = Long.parseLong(str);
		//Long l=Long.valueOf(str);

	//	System.out.print(l);
		
		
//2.LONG TO STRING
		
		Long l=sc.nextLong();
		String str=String.valueOf(l);
		//String str=l.toString();
		System.out.print(str);

	}

}
