package codingakka;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class ArraySubsetOfOther {

	public static void main(String[] args) {

		int a1[] = { 11, 7, 1, 13, 21, 3, 7, 3 };
		int a2[] = { 11, 3, 7, 1, 7 };

//		for (int i = 0; i < a2.length; i++) {
//			boolean isFound = true;
//			for (int j = 0; j < a1.length; j++) {
//
//				if (a2[i] == a1[j]) {
//					isFound = false;
//
//				}
//			}
//			if (!isFound) {
//				System.out.println("not subset");
//				break;
//			}
//
//		}
//*******************************************************************************
//		HashSet<Integer> h = new HashSet<>();
//
//		for (int a : a1) {
//			h.add(a);
//		}
//
//		for (int b : a2) {
//			if (!h.contains(b)) {
//				System.out.println("NOT a subset");
//			}
//		}
		
		
		HashMap<Integer, Integer> elementCount = new HashMap<>();

        // Store the frequency of elements in a1
        for (int num : a1) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }
        
        
        for(Map.Entry<Integer, Integer> val: elementCount.entrySet()) {
        	System.out.println(val.getKey()+ " "+ val.getValue());
        }

        // Check if each element in a2 exists in a1 with sufficient frequency
        for (int num : a2) {
            if (!elementCount.containsKey(num) || elementCount.get(num) == 0) {
               System.out.println("false"); // Element in a2 is not in a1 or its count is insufficient
            }
            elementCount.put(num, elementCount.get(num) - 1);  // Decrease the count
        }

        System.out.println("true");

	}

}
