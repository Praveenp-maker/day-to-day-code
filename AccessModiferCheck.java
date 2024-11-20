package collections;

import com.gForGeeks.Babber.Child;

public class AccessModiferCheck extends Child {

	
	public AccessModiferCheck(String name, int rollno,String subject, Float amount) {
		super(name,rollno,subject,amount);
	}
	
	public static void main(String[] args) {
	
		
		AccessModiferCheck obj =new AccessModiferCheck("praveeen ", 67, "ginger",90.0f);
		
		String s= obj.subject;
	    float f= obj.amount;
		
		
		
		
	}

}
