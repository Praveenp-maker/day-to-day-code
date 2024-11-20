package array;

public class TwoSuminArray {

	public static void main(String[] args) {
		
		
		int arr[]= {3,5,3};
		int target =6;
		
		for(int i=1;i<arr.length;i++) {
			int first =arr[i]+ arr[i-1]; 
			if(target == first ) {
				System.out.println( i+" "+ (i-1));
			}
			first =0;
			
		}
		
	}

}
