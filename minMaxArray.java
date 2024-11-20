package array;

public class minMaxArray {

	static long getMinMax(long a[], long n)  
    {
		 long templow=a[0];
		 long temphigh=a[0];
		 
        for(int i=0;i<a.length;i++){
          
            if(templow>a[i]){
                templow=a[i];
            }
            
            if(temphigh<a[i]){
                temphigh=a[i];
            }
            
        }
        System.out.println(templow+" "+temphigh);
        return templow;
    }
	
	public static void main(String[] args) {
		minMaxArray obj=new minMaxArray();
		long a[]= {123,4122,45566,3,56677788,976};
		
		obj.getMinMax(a, 6);
	}

}
