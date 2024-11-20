package com.workout.dayToDay;

public class PrimeFactors {

	public static void main(String[] args) {
	//int a=23;
	//even no
//	for(int i=2;i<=a;i++) {
//		if(a%i==0) {
//			System.out.println(i);
//		}
//	}
	//int flag=0;

//	for(int i=2;i<=10;++i) {
//		int j;
//		for(j=2;j<i;++j) {
//			if(i%j==0) {
//				flag++;
//			}
//			
//		}
//		if(flag==0) {
//			System.out.println(j);
//		}}
//	
	
//	for(int i=2;i<a;i++) {
//		if(a%i==0) {
//			flag++;
//		}
//		}
//	if(flag==0) {
//		System.out.println("prime");
//	}
//	else {
//		System.out.println("not prime");
//	}
	
	
	//list of prime no by me
	int a=100;
	
	int i,j,flag;
	for(i=1;i<=a;i++) {
		 if (i == 1 || i == 0)
             continue;
		 flag=1;
		for(j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag=0;
				break;
			}
		}
		if(flag==1) 
		System.out.print(i+" ");
	}}}
//		int N=45;
//		  int x, y, flg;
//       System.out.println(
//	            "All the Prime numbers within 1 and " + N
//	            + " are:");
//	       for (x = 1; x <= N; x++) {
//	  if (x == 1 || x == 0)
//	                continue;
//	        flg = 1;
//	    for (y = 2; y <= x / 2; y++) {
//	                if (x % y == 0) {
//	                    flg = 0;
//	                    break;
//	                }
//	            }
//	 
//	         if (flg == 1)
//	                System.out.print(x + " ");
//	        }
//	    }
//	}
//
