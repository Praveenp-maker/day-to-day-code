package hrank;

import java.util.Scanner;

public class Mathformula {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	         int val=a;
	         for(int j=0;j<n;j++){
	              val += (Math.pow(2, j) * b); 
	              System.out.print(val + " ");
	            }
	            System.out.println(); 
	        }
	        in.close();
	    }

	}

//(a+2^0*b),(a+2^1*b),(a+2^2*b)......
