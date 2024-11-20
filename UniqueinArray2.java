package gFGBasic;

public class UniqueinArray2 {

	public static void main(String[] args) {
		int ar[]=new int[] {12,34,33,34,12};
		
		int n=ar.length;
		int i,j,k;
		for(i=0;i<n;i++) {
			int c=0;
			for(j=0;j<i;j++) {
				if(ar[i]==ar[j]) {
					c++;
				}
			}
			for(k=i+1;k<n;k++) {
				if(ar[k]==ar[i]) {
					c++;
				}
			}
			
			if(c==0) {
				System.out.println(ar[i]);
			}
		}

	}

}
