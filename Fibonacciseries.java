package com.workout.dayToDay;

public class Fibonacciseries {

	public static void main(String[] args) {
	int i=0;
	int j=1;
	System.out.println("fibonacci series is "+ i+j);
	int l=0;
	for(int k=2;k<=10;k++) {
		 
		l=i+j;
		
		System.out.println(l);
		i=j;
		j=l;
	}

	}

}
