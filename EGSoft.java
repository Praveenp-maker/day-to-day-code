package backoffice;

public class EGSoft {

	public static void main(String[] args) {
	
//string args	
//	Error: Main method not found in class backoffice.EGSoft, please define the main method as:
//		   public static void main(String[] args)
//		or a JavaFX application class must extend javafx.application.Application

		
		int a=10;
		int b=20;
		
		if(a==b) {
			//System.out.println("equal");
		}else {
			//System.out.println("not");
		}
		
		
		String a1=new String("the bulk");
		String a2 =new String("the bulk");
		
		if(a1==a2) {
			//System.out.println("equal");
		}else {
			//System.out.println("not");
		}
		
		int temp =10;
		
		for(int i=0;i>temp;i++) {
			//System.out.println(i);
		}
		
		int one =0;
		int two =4;
		do {
			++one;
			two--;
		}
		while(two>0);
		
		System.out.print("value of one is "+ one);
	}

}
