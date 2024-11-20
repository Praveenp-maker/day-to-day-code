package hrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationofString {
	public static void main(String args[]) {
		String str = "cand";

		printval(str, "");

	}

	private static void printval(String str, String ans) {
		 Set<String> hash_Set = new HashSet<String>(); 
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);
			hash_Set.add(ros);

			printval(ros, ans + ch);
		}

		 for (String value : hash_Set) 
			  
	        if(value!="") {
	            System.out.println(value + ", "); 
	        }
	    
		

	}
}
