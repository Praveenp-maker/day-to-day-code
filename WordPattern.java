package stringEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WordPattern {
	
	
	public boolean wordPattern(String pattern, String s) {
	      pattern =  pattern.trim();
	      s=  s.trim();
	        String arr[] =s.split(" ");
	        Map<Character,String>strVal =new HashMap<>();
	        Set<String> setVal =new HashSet<>();

	         if (pattern.length() != arr.length) {
	            return false;
	        }


	        for(int i=0;i<pattern.length();i++){
	          char ch =pattern.charAt(i);
	          String str =arr[i];

	          if(strVal.containsKey(ch)){
	            String mappedWord =strVal.get(ch);
	               if(!str.equals(mappedWord)){
	                return false;
	               }

	          }else{
	               if(setVal.contains(str)){
	                 return false;
	                   }
	                strVal.put(ch,str);
	                   setVal.add(str);

	          }
	      



	        }
	        

	        
	        return true;
	        
	        
	            }
	
	

	public static void main(String[] args) {

		String pattern = "abba";
		

		String word = "dog cat cat dog";
		
		WordPattern obj =new WordPattern();
		
		System.out.println(obj.wordPattern(pattern, word));
		

//		HashMap<Character, String> val = new HashMap<>();
//
//
//		String[] arr =word.split(" ");
//
//		 pattern.trim();
//	        s.trim();
//	        String arr[] =s.split(" ");
//	        Map<Character,String>strVal =new HashMap<>();
//	        Set<String> setVal =new HashSet<>();
//	        for(int i=0;i<pattern.length();i++){
//	          char ch =pattern.charAt(i);
//	          String str =arr[i];
//
//	          if(!strVal.containsKey(ch)){
//	        	   String mappedWord = strVal.get(ch);
//	               if(str.equals(mappedWord)){
//	            	   System.out.println(" false;");
//	               }
//
//	          }else{
//	               if(!setVal.contains(str)){
//	                   strVal.put(ch,str);
//	                   setVal.add(str);
//	               }else{
//	                System.out.println(" false;");
//	                }
//
//	          }
//	      
//
//
//
//	        }
//	        
//
//	        
//	        System.out.println(true);
	        
	        
	            }
}
//		
//		  HashMap<Character, String> charToWordMap = new HashMap<>();
//	        Set<String> wordsSet = new HashSet<>();
//
//	        for (int i = 0; i < pattern.length(); i++) {
//	            char currentChar = pattern.charAt(i);
//	            String currentWord = arr[i];
//
//	            if (charToWordMap.containsKey(currentChar)) {
//	                // If the character is already mapped to a different word, return false
//	                if (!charToWordMap.get(currentChar).equals(currentWord)) {
//	                    System.out.println("Pattern does not match.");
//	                    return;
//	                }
//	            } else {
//	                // If the word is already mapped to a different character, return false
//	                if (wordsSet.contains(currentWord)) {
//	                    System.out.println("Pattern does not match.");
//	                    return;
//	                }
//	                charToWordMap.put(currentChar, currentWord);
//	                wordsSet.add(currentWord);
//	            }
//	        }
//
//	        // If we reach here, the pattern matches
//	        System.out.println("Pattern matches.");
//	    }
//				

	
