package stringEx;

public class SubSequence {

	
	public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;
        
        if(s.equalsIgnoreCase(t)) {
        	System.out.println("equal");
        }

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();        
    }
	
	
	public static void main(String[] args) {
		
		String a="aab";
		String b ="baa";
		SubSequence obj =new SubSequence();
		
		System.out.println(obj.isSubsequence(a,b));

	}

}
