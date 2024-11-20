package patternpgm;

public class ReverseHill {

	public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("  ");
		}
		for(int k=i;k<n;k++) {
			System.out.print("* ");
		}
		for(int p=i;p<=n;p++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print("  ");
		}
		for(int k=1;k<i;k++) {
			System.out.print("* ");
		}
		for(int p=1;p<=i;p++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}

}
