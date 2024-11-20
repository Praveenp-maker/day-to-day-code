package twopointercodingakka;

public class KthSortedArray {
	
	static int fullarr(int a1[],int a2[],int k){
	
		int str[]=new int[a1.length+a2.length];
		
		int alen =a1.length;
		int blen =a2.length;
		
		for(int i=0;i<a1.length;i++) {
			str[i]=a1[i];
		}
		
		for(int j=0;j<a2.length;j++) {
			str[alen+j]=a2[j];
		}
		
		System.out.println(str.length);
		return 0;
	}

	public static void main(String[] args) {

		
		int k = 5;
		int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		
		System.out.println(fullarr(arr1,arr2,k));

	}

}
