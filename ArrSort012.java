package codingakka;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrSort012 {

	static void sort012(int arr[]) {
		int low = 0, mid = 0, high = arr.length - 1;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0: {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				mid++;
				low++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
				break;
			}

			}

		}

	

	}

	public static void main(String[] args) {

		int arr[] = { 0, 2, 1, 2, 0 };
		// Output: 0 0 1 2 2

		sort012(arr);

	}

}
