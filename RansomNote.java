package stringEx;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	
	
	 public boolean canConstruct(String ransomNote, String magazine) {
	        Map<Character, Integer> magazineCount = new HashMap<>();

	        // Count the frequency of each character in the magazine
	        for (char c : magazine.toCharArray()) {
	            magazineCount.put(c, magazineCount.getOrDefault(c, 0)+1);
	        }

	        // Check if the ransom note can be constructed
	        for (char c : ransomNote.toCharArray()) {
	            if (!magazineCount.containsKey(c) || magazineCount.get(c) == 0) {
	                return false;
	            }
	            magazineCount.put(c, magazineCount.get(c) - 1);
	        }

	        return true;
	    }

	public static void main(String[] args) {
		
		RansomNote obj =new RansomNote();
		
		String a="aab";
		String b ="baa";
		
		System.out.println(obj.canConstruct(a, b));
		
	}

}
