package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ListExp {

	public static void main(String[] args) {
		
//		ArrayList a =new ArrayList();
//		a.add("gfd");
//	   a.add("7");
//	   
//	   LinkedList b =new LinkedList();
//	   b.add("sxvgsv");
//	   b.add(7);
	   
	  int arr[] = {3,2,5,6,9};
	  
	  int n = arr.length;
	  System.out.println(n);
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n-1; j++) {
              if (arr[j] > arr[j+1]) {
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
          }
      }
	  

	  for(int i=0;i<arr.length;i++) {
		  // System.out.print(arr[i]+" ");
	  }
	   
	  
	  
	  char array[] = {'s','a','k','j','b'};
	  
	  int len =array.length;
	  char temp;
	  
	  for(int i=0;i< len ;i++) {
		  for(int j=0;j<len-i-1;j++) {
			  if(array[j]>array[j+1]) {
				temp =array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			  }
		  }
	  }
	  
	   
	  for(char c: array) {
		 // System.out.print(c+" ");
	  }
	
	  
 String arrays[] = {"sanju","kicha","guna","abi","balayya"};
	  
	  int lens =array.length;
	  String temps;
	  
	  for(int i=0;i< lens ;i++) {
		  for(int j=0;j<lens-i-1;j++) {
			  if(arrays[j].compareTo(arrays[j+1])>1) {
				temps = arrays[j];
				arrays[j]=arrays[j+1];
				arrays[j+1]=temps;
			  }
		  }
	  }
	  
	 for(String a: arrays) {
		 System.out.print(a+ " ");
	 }
	  
	}

}
