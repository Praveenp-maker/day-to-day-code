package hrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagrams {
	
//	Hello
//	hello
//	
//	Not Anagrams

	public static void main(String[] args) {
Scanner u=new Scanner(System.in);

String a1=u.next();
String a2=u.next();
char[] ch1 = new char[a1.length()];
char[] ch2 = new char[a1.length()];
for (int i = 0; i < a1.length(); i++) {
    ch1[i] = a1.charAt(i);
}
for (int i = 0; i < a2.length(); i++) {
    ch2[i] = a1.charAt(i);
}


int n1=ch1.length;
int n2=ch2.length;

	
//	 Arrays.sort(ch1);
//     Arrays.sort(ch2);
//
//     // Compare sorted strings
//     boolean b=false;
//     for (int i = 0; i < n1; i++) {
//         if (ch1[i] != ch2[i]) {
//        	 b=false;
//         }
//     
//          b=true;  
//     }
//     System.out.println(b);
//     
//       }

	if(a1.length()==a2.length()) {
        String c = a1.toLowerCase();
        String d = a2.toLowerCase();
        // import java.util.Arrays;
        char str1[] = c.toCharArray();
        char str2[] = d.toCharArray();

        java.util.Arrays.sort(str1);
        java.util.Arrays.sort(str2);
        System.out.println(java.util.Arrays.equals(str1,str2));
    }
    else {
        System.out.println(false);
    }
	
	

}


	}

