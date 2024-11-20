package twopointercodingakka;

public class CountInversion {

	static void countValue(int arr[]) {
		int count = 0;
		//int n = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

	public static void main(String args[]) {

		int arr[] = { 2, 4, 1, 3, 5 };
		countValue(arr);

	}

}
