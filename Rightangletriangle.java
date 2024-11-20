package patternpgm;

public class Rightangletriangle {

	public static void main(String[] args) {
//for(int i=0;i<5;i++) {
//	for(int j=0;j<=i;j++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}

//ans:right angle triangle
//	*
//	**
//	***
//	****
//	*****

		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		
//		ans:right angle triangle inverse
//		*****
//		****
//		***
//		**
//		*

	}

}
