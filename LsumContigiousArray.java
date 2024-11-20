package array;

public class LsumContigiousArray {

	
	static void contiguossum(int a[]) {
		
		

		int sumuptohere=0;
		int maxValue=Integer.MIN_VALUE;
		
		System.out.println("maxvalue   "+  maxValue);
		
		for(int i=0;i<a.length;i++) {
			sumuptohere=sumuptohere+a[i];
			if(maxValue<sumuptohere) {
				maxValue=sumuptohere;
				}
			else if(sumuptohere<0) {
				sumuptohere=0;
			}
			
			
			
		}
		
		
		
		System.out.println("maxvalue   "+  maxValue);
	}
	public static void main(String[] args) {
	
		
		int a[]= {1,4,5,-7};

		contiguossum(a);
		
	}

}
