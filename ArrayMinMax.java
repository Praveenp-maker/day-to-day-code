package codingakka;

import java.util.Arrays;

public class ArrayMinMax {

	public static void main(String[] args) {
	
		
		int arr[] = {1,23,54,0,-9};
		
		 int min =arr[0];
	      int max= arr[0];
	      
	      for(int i=0;i<arr.length;i++){
	          if(min>arr[i]){
	              min =arr[i];
	          }
	          if(max<arr[i]){
	              max =arr[i];
	          }
	          
	          
	          
	      }
	      

	      Arrays.sort(arr);
	      
	      System.out.println(arr[arr.length-2]);
	      

	}

}
