package codingakka;

public class Armstromg {

	 static String armstrongNumber(int n) {
		    
		    int temp =n;
		    int rev=0;
		    while(temp>0){
		        int last =temp%10;
		        rev =rev+ (last*last*last);
		        temp =temp/10;
		    }
		    if(rev==n){
		        return "true";
		    }
		    else{
		        return "false";
		    }
	 }
	public static void main(String[] args) {
	
		
		System.out.println(armstrongNumber(153));

	}

}
