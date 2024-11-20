package gFGBasic;

import java.util.ArrayList;

public class Gcdoftwonum {

	
	public static void main(String[] args) {

		int x=102;
		int y=54;
//		 ArrayList<Integer> fnum = new ArrayList<>();
//		 ArrayList<Integer> snum = new ArrayList<>();
//		for(int i=1;i<=x;i++) {
//			if(x%i==0) {
//				fnum.add(i);
//				}}
//		for(int j=1;j<=y;j++) {
//			if(y%j==0) {
//			snum.add(j);
//			}}
		
	//	simple method but o/p is wrongly coming
//		int min=x<y?x:y;
//		while(min>=1) {
//		if(x%min==0&&y%min==0) {
//			System.out.println("GCD WILL BE "+min);
//		}
//		min--;
//		}
		
	//	System.out.println(lcm(x,y));
		System.out.println(gcd(x,y));
		
	}
	
	// for this method the b value should be always the lesser one
public static int gcd(int a,int b) {
	if(b==0) {
	return a;
	}
	return gcd(b,a%b);
	}
public static int lcm(int a,int b) {
	return a*b/gcd(a,b);
}
}