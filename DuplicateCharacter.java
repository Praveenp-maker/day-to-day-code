package com.workout.dayToDay;

import java.util.ArrayList;

import org.apache.logging.log4j.util.Chars;

public class DuplicateCharacter {

	public static void main(String[] args) {
	
		String a="zamakkalam";
		
		a=a.toLowerCase();
		
		 ArrayList<Character> arr1 = new ArrayList<Character>();
		for(int i=0;i<a.length();i++) {
			char oneval=a.charAt(i);
		
			
			for(int j=i+1;j<a.length();j++) {
				char anotherval=a.charAt(j);
				
				if(oneval==anotherval) {
					if(!isPresent(oneval, arr1)) {
						arr1.add(oneval);
						
					}
					break;
				}
			}
			
			
				
			}
		

		System.out.print(arr1);
	

	}
	
	public static boolean isPresent(char oneval, ArrayList<Character> arr1) {
		
		 for (char element : arr1) {
	            if (element == oneval)
	                return true;
	        }

	        return false;
	    }
		
	}


