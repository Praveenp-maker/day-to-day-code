package stringEx;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
	
		String a="anagram";
		String b ="nagamra";
		
		
		Character[] arr1= new Character[a.length()];
		Character arr2[]=new Character[b.length()];
		int i =a.length()-1, j =b.length()-1;
		for(char a1: a.toCharArray() ) {
			arr1[i--]=a1;
		}
		for(char b1: b.toCharArray() ) {
			arr1[j--]=b1;
		}
		if(arr1 !=null) {
		Arrays.sort(arr1);
		}
		if(arr2!=null) {
		Arrays.sort(arr2);
		
	
		if(arr1.equals(arr2)) {
			
		}
		}}
}
