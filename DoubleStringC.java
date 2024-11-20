package conversion;

import java.util.Scanner;

public class DoubleStringC {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
//double to string
//	double d=sc.nextDouble();
//	String str=String.valueOf(d);
//	String str1=Double.toString(d);
//	System.out.print(str+" "+str1);
	
//string to double 
	String str=sc.next();
	double d=Double.parseDouble(str);
	double f=Double.valueOf(str);
	System.out.print(d+" "+f);
	
	
	

	}

}
