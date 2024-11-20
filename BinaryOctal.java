package conversion;

public class BinaryOctal {

	public static void main(String[] args) {
//binary to decimal 
		
	int a=100;
	int val=0,i=0;
	int c=0;
	if(a>0) {
	System.out.println(c++);
	}
	while(a>0) {
		System.out.println("Before increment"+ i);
		val+=Math.pow(2,i++)*(a%10);
		System.out.println("after increment"+ i);
		System.out.println(val);
		a=a/10;
	}

	
	System.out.println(val);
	
	System.out.println(1%10+" "+1/10+"  "+10%10+ " "+10/10);
	}

}
