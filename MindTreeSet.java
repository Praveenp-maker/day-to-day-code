package twopointercodingakka;

import java.util.Scanner;
import java.util.TreeSet;

public class MindTreeSet {

	public static void main(String[] args) {
		Scanner u =new Scanner(System.in);
		
		TreeSet<Character> tr = new TreeSet<>();
		
		String str = u.next();
		
		for(int i=0;i<str.length();i++) {
			tr.add(str.charAt(i));
		}
		
		System.out.println(tr);

	}

}
