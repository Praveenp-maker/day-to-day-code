package conversion;

import java.util.Scanner;

public class BooleanString {

	public static void main(String[] args) {
		Scanner u=new Scanner(System.in);
		
		boolean b=u.nextBoolean();
		String str=Boolean.toString(b);
		System.out.println(str);

	}

}
