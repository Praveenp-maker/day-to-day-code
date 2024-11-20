package array;

import java.util.Arrays;

public class CyclicRotateByOne {

	  static int array[] = new int[] { 1, 2, 3, 4, 5 };

	static void rotate()
    {		
		int lastval=array[array.length-1];
		System.out.println(lastval);
		for(int i=array.length -1 ; i>0 ;i--) {
			array[i] =array [i-1];
			}
		array[0] = lastval;
    }
 
	
	
	
	public static void main(String[] args) {
	
		
	        rotate();
	 
	        System.out.println("Rotated Array is");
	        System.out.println(Arrays.toString(array));
		


		

		
	}

}
