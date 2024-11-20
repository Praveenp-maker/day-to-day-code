package patternpgm;

public class Leftangletriangle {

	public static void main(String[] args) {
//		int i,j,row=5;
//		for (i=1; i<=row; i++)   
//		{  
//	
//		for (j=i; j<=row; j++)         
//		{  
//	   
//		System.out.print("- ");        
//		}   
//				for (j=1; j<=i; j++ )   
//		{   
//	
//		System.out.print("* ");   
//		}   
//		
//		System.out.println();   
//		}   
//	}}	
//	


//note: no of characters printed in space and star should  be same otherwise distorted image will occur

//ans:
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 


//-----*
//----**
//---***
//--****
//-*****



		
		int rows = 5;
		for (int i = 1; i <=rows; i++) {
		   for (int j = 1; j <=i; j++) {
		        System.out.print("- ");
		    }
		    for (int k = i; k < rows; k++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}}   

	
}


//ans :
//	*****
//	 ****
//	  ***
//	   **
//	    *

