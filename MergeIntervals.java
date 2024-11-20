package twopointercodingakka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	static void merge(int[][] intervals) {
		if (intervals.length == 0) {
			System.out.println("No intervals to merge.");
			return;
		}

		List<int[]> mergedIntervals = new ArrayList<>();

		// Sort intervals by the start time
		Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

		int[] currentInterval = intervals[0];

		for (int i = 1; i < intervals.length; i++) {
			int[] nextInterval = intervals[i];

			if (nextInterval[0] <= currentInterval[1] && nextInterval[1] > currentInterval[1]) {

				currentInterval[1] = nextInterval[1];
			} else {

				mergedIntervals.add(currentInterval);
				currentInterval = nextInterval; // Move to the next interval
			}
		}

		mergedIntervals.add(currentInterval);

		for (int[] merged : mergedIntervals) {
			System.out.println(Arrays.toString(merged));
		}
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 5, 18 } };
		merge(intervals);
	}
}
