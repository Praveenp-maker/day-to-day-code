package array;

import java.util.Arrays;

public class Movenegative {

	
	static void moveright(int arr[]) {
		Arrays.sort(arr);

//	int low=0;
//	int high=arr.length-1;
//
//	
//	while(low<high) {
//		int temp=arr[low];
//		if(temp<0) {
//			arr[low]=arr[high];
//			arr[high]=temp;
//			high--;
//		}
//		low++;
//		}
		for(int s:arr) {
	System.out.print(s+" ");	
		}
		
		
	}
	public static void main(String[] args) {
	int[] array= {-90,1,23,-45,-9,6,-78,12,45,87};
	
	moveright(array);

	}

}
