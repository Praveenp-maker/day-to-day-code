package codingakka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {

	static Object[] frequency(int arr[], int N, int P) {

		HashMap<Integer, Integer> val = new HashMap<>();

		ArrayList<Integer> arr2 = new ArrayList<>();

		for (int i = 0; i < P; i++) {
			val.put(arr[i], val.getOrDefault(arr[i], 0) + 1);
		}

		for (int i = 1; i <= N; i++) {
			if (val.containsKey(i)) {
				Integer value = val.get(i);
				arr2.add(value);
			} else {
				arr2.add(0);
			}
		}

		Object[] arrlat = arr2.toArray();

		for (Object obj : arrlat) {
			System.out.print(obj + " ");
		}
		return arrlat;
	}

	public static void main(String[] args) {

		int n = 5;
		int arr[] = { 2, 3, 2, 3, 5 };
		int P = 5;

		frequency(arr, n, P);
	}

}
