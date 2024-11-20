package patternpgm;

public class NOpgm {

	public static void main(String[] args) {
		int n=5;
//		for(int i=1;i<=n;i++) {
//			int p=1;
//			for(int j=1;j<=i;j++) {
//				System.out.print(p++ +"");
//			}
//			System.out.println();
//		}
//		1
//		12
//		123
//		1234
//		12345

		
		//System.out.println(9-9);
		
		
		for(int i=1;i<=n;i++) {
			int p=5;
			for(int j=i;j<=n;j++) {
				System.out.print(p--+" ");
			}
			System.out.println();
		}

	}

}
