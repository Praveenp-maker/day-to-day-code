package array;

import java.util.Arrays;
import java.util.HashSet;

public class UnionIntersection {
static void Union(int[] a, int[] b, int n, int m)
{

    int[] result = new int[n + m];

    int index = 0;
    int left = 0, right = 0;
    while (left < n && right < m) {

        if (a[left] < b[right]) {
            if (index != 0
                && a[left] == result[index - 1]) {
                left++;
            }
            else {
                result[index] = a[left];
                left++;
                index++;
            }
        }
        else {
            if (index != 0
                && b[right] == result[index - 1]) {
                right++;
            }
            else {
                result[index] = b[right];
                right++;
                index++;
            }
        }
    }

    while (left < n) {
        if (index != 0
            && a[left] == result[index - 1]) {
            left++;
        }
        else {
            result[index] = a[left];
            left++;
            index++;
        }
    }

    while (right < m) {
        if (index != 0
            && b[right] == result[index - 1]) {
            right++;
        }
        else {
            result[index] = b[right];
            right++;
            index++;
        }
    }

//    System.out.print("Union: ");
//    for (int k = 0; k < index; k++)
//        System.out.print(result[k] + " ");
//    System.out.println("");
}

// Function to find intersection
//static void intersection(int[] a, int[] b, int n, int m)
//{
//
//    int i = 0, j = 0, k = 0;
//    int[] result = new int[n + m];
//    while (i < n && j < m) {
//        if (a[i] < b[j])
//            i++;
//        else if (a[i] > b[j])
//            j++;
//        else {
//        	
//        	
//            if (k != 0 && a[i] == result[k - 1]) {
//            	System.out.println(result[k-1]);
//                i++;
//                j++;
//            }
//            else {
//                result[k] = a[i];
//                i++;
//                j++;
//                k++;
//            }
//        }
//    }
//    System.out.print("Intersection: ");
//    for (int x = 0; x < k; x++)
//        System.out.print(result[x] + " ");
//    System.out.println();
//}

public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
    
    HashSet<Integer> set =new HashSet<>();
    int count =0;
    for(int i : a){
        set.add(i);
    }
    
    for(int j: b){
        if(set.contains(j)){
            count++;
        }
    }
    return count;
   }


// Driver Code
public static void main(String[] args)
{
    int[] a = { 1,2,2,6,3,5 };
    int[] b = { 3, 3, 5 };

    int n = a.length;
    int m = b.length;

    // sort
    Arrays.sort(a);
    Arrays.sort(b);

    // Function call
    Union(a, b, n, m);
  System.out.println(NumberofElementsInIntersection(a, b, 6, 3));
}
}

//This code is contributed by phasing17



	
	
	

