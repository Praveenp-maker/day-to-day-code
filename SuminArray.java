package array;
public class SuminArray {

	public static void main(String[] args) {

		int arr[]= {1,3,4};
		int length=arr.length;
		int value=5;
		int ans[]=new int[2];
		StringBuilder sb=new StringBuilder();
		sb.append("[");
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==value) {
				
					ans[0]=arr[i];
					ans[1]=arr[j];
					sb.append(ans[0]);
					sb.append(",");
					sb.append(ans[1]);
					
				}
			}
		}

		
		sb.append("]");
		
//		for(int i=0;i<ans.length;i++) {
//			System.out.print(ans[i]+" ");
//		}
		
		System.out.println(sb.toString());
	}

}
