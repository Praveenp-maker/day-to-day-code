package twopointercodingakka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateList {
	
	 public static int remove_duplicate(List<Integer> arr) {
	     HashSet<Integer>s =new HashSet<>();
			
			
		 int idx = 0;  

	        for (int i = 0; i < arr.size(); i++) {
	            if (!s.contains(arr.get(i))) { 
	                s.add(arr.get(i));  
	                arr.set(idx++, arr.get(i));  
	            }
	        }
			
			
			
			return idx;
		
	    }
	public static void main(String[] args) {
		
		List<Integer> arr=new ArrayList<>();
		
		arr.add(2);
		arr.add(2);
		arr.add(2);
		arr.add(2);
		arr.add(2);
		arr.add(2);
		
		
		int ans = 0;
		try {
			ans = remove_duplicate(arr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ans);

	}

}
