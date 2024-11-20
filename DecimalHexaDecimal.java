package conversion;

import java.util.Scanner;

public class DecimalHexaDecimal {

	public static void main(String[] args) {
	Scanner u=new Scanner(System.in);
	
	
//decimal to hecademical	
	//int a=u.nextInt();
//	int a=10;
//	
//	int[]arr=new int[1000];
//	int i=0;
//	while(a!=0) {
//		arr[i]=a%16;
//		a=a/16;
//		i++;
//	}
//
//	for(int j=i-1;j>=0;j--) {
//		if(arr[j]<9) {
//		System.out.print(arr[j]);
//		}
//		else {
//			System.out.print((char)(55+arr[j]));
//		}
//	}
	
	
	
//hexamdecimal to decimal	
	String a=u.next();
	
	int len=a.length();
	int base=1;
	int decvalue=0;
	for(int j=len-1;j>=0;j--) {
		if(a.charAt(j)>='0'&&a.charAt(j)<='9') {
		   decvalue+=(a.charAt(j)-48)*base;
		   base=base*16;
		}
		else if(a.charAt(j)>='A'&&a.charAt(j)<='F') {
		decvalue+=(a.charAt(j)-55)*base;
		base=base*16;
			
		}
	}
	System.out.println(decvalue);
	
	}

}
