package com.workout.dayToDay;

public class LargeinArray {

	public static void main(String...names) {
		int[]a= {34,45,56};
		int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(large<a[i]) {
				large=a[i];
			}
		}
		System.out.println(large);

	}

}
