package hrank;

import java.util.Scanner;

public class StringFormatter {

	public static void main(String[] args) {
Scanner u=new Scanner(System.in);

for(int i=0;i<3;i++) {
	String str=u.next();
	int val=u.nextInt();
	//String val=u.next();
	System.out.printf("the value of %s and %S are %n",str, val);
	System.out.println("the end");
}

	}

}
