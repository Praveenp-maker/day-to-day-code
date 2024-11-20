package stringEx;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InsoMorphicNum {

	public static void main(String[] args) {

		String first = "ana";

		String second = "fca";
	

		int map1[] = new int[10];
		int map2[] = new int[10];

		for (int i = 0; i < first.length(); i++) {
			System.out.println(map1[first.charAt(i)] + " " + map2[second.charAt(i)]);
		System.out.println(map1['n']);
			if (map1[first.charAt(i)] != map2[second.charAt(i)]) {
				System.out.println("false");
			}

			map1[first.charAt(i)] = i + 1;
			map2[second.charAt(i)] = i + 1;

		}
		
		
	
	}

}


//Map<Character, Character> obj = new HashMap<>();
//
//Set<Character> setobj =new HashSet<>();
//
//if (first.length() == second.length()) {
//
//	for (int i = 0; i < first.length(); i++) {
//		
//		if(!obj.containsKey(first.charAt(i))) {
//
//		obj.put(first.charAt(i), second.charAt(i));
//		}
//		else {
//			
//		}
//
//	}
//
//}
//
//
//
//for(Entry<Character, Character> o : obj.entrySet()) {
//	System.out.println(o.getKey()+ " "+ o.getValue());
//	
//}
//
