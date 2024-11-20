package stringEx;

import java.util.Scanner;

public class StringRegex {

	 public static int camelcase(String s) {
		    // Write your code here
		      String a[] =s.split("[A-Z]+");
		      return a.length>0?a.length:0;
		    }
	
	
	public static void main(String[] args) {

     Scanner u=new Scanner(System.in);
     
     String s = "saveChangesInTheEditor";
     if(s.trim().length()!=0){
     String a[]= s.trim().split("[A-Z]+");
     System.out.println(a.length);
    for(String ans: a){
        System.out.println(ans);
    }
     }
     else{
         System.out.println(0);
     }
     
	}

}
