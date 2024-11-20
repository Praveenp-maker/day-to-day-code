package hrank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams2 {

	public static void main(String[] args) {
	     Scanner u=new Scanner(System.in);
	     String a1="Hello";
	     String a2="hello";
	     
	     a1= a1.toLowerCase();
	     a2=a2.toLowerCase();
	     char ch1[]=a1.toCharArray();
	     char ch2[]=a2.toCharArray();
	     
	     Arrays.sort(ch1);
	     Arrays.sort(ch2);
	    
	     
	     if(ch1.length!=ch2.length){
	    
	         System.out.println("Not Anagrams");
	     }
	     else{
	         
	     String ans=Arrays.equals(ch1,ch2)?"Anagrams":"Not Anagrams";
	     System.out.println(ans);
	    }
	}

}
