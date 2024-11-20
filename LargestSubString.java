package slidingWindowExp;

import java.util.HashSet;
import java.util.Set;

public class LargestSubString {
	    
	
	        static int lengthOfLongestSubstring(String s) {
//	            int n = s.length();
//	            int maxLength = 0;
//	            Set<Character> charSet = new HashSet<>();
//	            int left = 0;
//	            
//	            for (int right = 0; right < n; right++) {
//	                if (!charSet.contains(s.charAt(right))) {
//	                    charSet.add(s.charAt(right));
//	                    maxLength = Math.max(maxLength, right - left + 1);
//	                } else {
//	                    while (charSet.contains(s.charAt(right))) {
//	                        charSet.remove(s.charAt(left));
//	                        left++;
//	                    }
//	                    charSet.add(s.charAt(right));
//	                }
//	                
//	                
//	                	System.out.println(left +"   "+charSet.toString()+ " " + right);
//	                
//	                
//	            }
//	            
//	            return maxLength;
	        	
	        	
	        	
	        	 int r =0,l=0, n =s.length(), max =0;
	             Set<Character>val =new HashSet<>();
	             
	                  while(r<n){
	                    
	                    if(!val.contains(s.charAt(r))){
	                      val.add(s.charAt(r));
	                      max = Math.max(max,r-l+1);
	                      r++;
	                    }else{
	                    	while(val.contains(s.charAt(r))) {
	                       val.remove(s.charAt(l));
	                       l++;
	                    	}
	                    	
	                    }
	                	System.out.println(l +"   "+val.toString()+ " " + r);

	                   }
	                  return max;

	        }
	    
	    public static void main(String[] args) {
	        String s = "pwwkew";
	       
	        
	        System.out.println(lengthOfLongestSubstring(s));
	    }
	}

	
	//static int calculateLargeSubString(String val) {
		
//	Set<Character> setVal =new HashSet<>();
//		int largeVal = Integer.MIN_VALUE;
//		
//		
//		for(int i=0;i<val.length();i++) {
//			if(!setVal.add(val.charAt(i))) {
//				
//			}else {
//				setVal.add(val.charAt(i));
//			}
//		}
//		
//		for(Character s: setVal) {
//			System.out.print(s+" ");
//		}
//		
//		
//		return 0;
//		
//	}
//
//	public static void main(String[] args) {
		
//		String a="bdbdbbd";   //2
//		String b="bcbdbdbbdcd";  //3 
//		String c="abcbdbdbbdcdabd";  //5
//		
//		
//	   System.out.println(calculateLargeSubString(a));
//		
//	}

//}
