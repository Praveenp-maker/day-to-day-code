package hrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class SubString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		  String s="welcometojava";
		  int k= 3;
		  sc.close();
		  List<String> lex= new ArrayList<>();
		
		  for(int i=0;i<=s.length()-k;i++){    
			
		      lex.add(s.substring(i,i+k));
		  }
		  
		  System.out.println(lex.size());
		  
		
		  Collections.sort(lex);
		  
		  for(int i=0;i<lex.size();i++) {
			  System.out.println(lex.get(i));
		  }
		  System.out.println("------------------------------------");
		  System.out.println(lex.get(0)+"\n"+lex.get(lex.size()-1));
		}
	

	

}
