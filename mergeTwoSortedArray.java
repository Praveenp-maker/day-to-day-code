package array;

import java.util.Arrays;

public class mergeTwoSortedArray {

	public int[] mergeArray(int nums1[],int nums2[], int m,int n) {
		
		int p1=m-1, p2=n-1, i =m+n-1;
		
		while(p2>=0) {
			if(p1>=0 && nums1[p1]>nums2[p2]) {
				nums1[i--]=nums1[p1--];
			}
			else {
				nums1[i--]=nums2[p2--];
			}
	   
		
		
	}
		Arrays.sort(nums1);
	
		  return nums1;
	}
	
//		 if(n == 0){
//			 return nums1 ;
//			 };
//	        int len1 = nums1.length;
//	        int end_idx = len1-1;
//	        while(n > 0 && m > 0){
//	            if(nums2[n-1] >= nums1[m-1]){
//	                nums1[end_idx] = nums2[n-1];
//	                n--;
//	            }else{
//	                nums1[end_idx] = nums1[m-1];
//	                m--;
//	            }
//	            end_idx--;
//	        }
//	        while (n > 0) {
//	            nums1[end_idx] = nums2[n-1];
//	            n--;
//	            end_idx--;
//	        }
//			return nums2;
		
		
	    

	
//		int size = (num1.length+ num2.length);
//		
//		int nsi= num1.length;
//		System.out.println("num1.length"+num1.length);
//		System.out.println("num2.length"+num2.length);
//		
//		System.out.print("size"+size);

//		int finalArr[] =new int[nsi];
//		
//		finalArr= Arrays.copyOf(num1, nsi);
//		
//		
//		
//       int result[] =new int[size];
//       
//       result =Arrays.copyOf(num2, size);

//		for(int i=0;i<num1.length;i++) {
//			for(int j=0;j<num2.length;j++) {
//				if(num1[i]==num2[j]) {
//					finalArr[i] =num1[i];
//				}
//				else if(num1[i]!=num2[j]) {
//					finalArr[i] =num1[i];
//				}
//				else if(num1[i]!=num2[j]) {
//					finalArr[i] =num2[j];
//				}
//			}
//		}

		// return finalArr;

	
	

	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };
		int m = 3;
		int n = 3;

		mergeTwoSortedArray obj = new mergeTwoSortedArray();

		int f[] = obj.mergeArray(nums1, nums2, m, n);

		for (int i : f) {
			System.out.print(i + ",");
		}

	}

}
