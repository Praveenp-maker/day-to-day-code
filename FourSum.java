package twopointercodingakka;

import java.util.Arrays;
import java.util.Comparator;

public class FourSum {

	static class pairSum {

		public int first;

		public int sec;

		public int sum;
	}

	static boolean noCommon(pairSum a, pairSum b) {
		if (a.first == b.first || a.first == b.sec || a.sec == b.first || a.sec == b.sec)
			return false;

		return true;
	}

	static void fourVal(int[] myArr, int sum) {
		int i, j;
		int length = myArr.length;

		int size = (length * (length - 1)) / 2;
		pairSum[] aux = new pairSum[size];

		int k = 0;
		for (i = 0; i < length - 1; i++) {
			for (j = i + 1; j < length; j++) {
				aux[k] = new pairSum();
				aux[k].sum = myArr[i] + myArr[j];
				aux[k].first = i;
				aux[k].sec = j;
				k++;
			}
		}

		Arrays.sort(aux, new Comparator<pairSum>() {

			public int compare(pairSum a, pairSum b) {
				return (a.sum - b.sum);
			}
		});

		i = 0;
		j = size - 1;
		while (i < size && j >= 0) {
			if ((aux[i].sum + aux[j].sum == sum) && noCommon(aux[i], aux[j])) {
				String output = myArr[aux[i].first] + ", " + myArr[aux[i].sec] + ", " + myArr[aux[j].first] + ", "
						+ myArr[aux[j].sec];
				System.out.println(output);
				return;
			} else if (aux[i].sum + aux[j].sum < sum)
				i++;
			else
				j--;
		}

	}

	public static void main(String[] args) {

		int a[] = { 3, 5, 2, 4, 5, 6, 7, 1, 1 };
		int tar = 11;

		fourVal(a, tar);

	}

}
