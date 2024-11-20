package patternpgm;

public class Squarestarpattern {

	public static void main(String[] args) {
	int a=5;
	int b=5;
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=b;j++) {
			if(j==1||j==b||i==1||i==a) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	}

}
