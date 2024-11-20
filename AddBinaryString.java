package gFGBasic;

public class AddBinaryString {

	public static void main(String[] args) {
//	String s1="happy";
//	String s2="moring";
//	String s=s1+s2;
//	String fi=s1.concat(s2);
//	
//	System.out.println(s);
//	System.out.println(fi);
		
		String num1="100000";
		String num2="0110";
		int i1=Integer.parseInt(num1,0,3,2);
		System.out.println(i1);
		
		
		String ans=Integer.toBinaryString(i1);
		System.out.println(ans);
		
	}

}
