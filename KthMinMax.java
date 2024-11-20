package array;

import java.util.Arrays;

public class KthMinMax {

	
		static long getMinVal(long a[], int n)  
	    {
			 Arrays.sort(a);
		   
		        return a[n-1];	  
		        
	    }
		
		public static void main(String[] args) {
			KthMinMax obj=new KthMinMax();
			long a[]= {123,4122,45566,3,56677788,976};
			
			System.out.println(obj.getMinVal(a, 3));
		}

	}


