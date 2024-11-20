package com.workout.dayToDay;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNum {

	public static void main(String args[]) {
	 Scanner input = new Scanner(System.in);
     
     
     
     BigInteger bI = new BigInteger(input.next());
     if(bI.isProbablePrime(1)==true){
         System.out.println("prime");
     }
     else{
         System.out.println("not prime");
     }
}
}