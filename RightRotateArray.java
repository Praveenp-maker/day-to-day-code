package array;

public class RightRotateArray {

	static void rotateOne(int[]a) {
		
		int first =a[0];
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		a[a.length-1]=first;
		
	}
	
	static void rotate(int []a , int k) {
		for(int i=1;i<=k;i++) {
			RightRotateArray.rotateOne(a);
		}
	}
	
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("Before Rotate");
		for(int i : a) {
			System.out.print(i+ " ");
		}
		System.out.println();
		RightRotateArray obj=new RightRotateArray();
		RightRotateArray.rotate(a, 3);
		
		System.out.println("After Rotate");
		for(int i : a) {
			System.out.print(i+ " ");
		}
		
	}

}
