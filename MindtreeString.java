package twopointercodingakka;

import java.util.Scanner;

public class MindtreeString {

	public static void main(String args[]) {

		Scanner u = new Scanner(System.in);

		String input = u.nextLine();
		String[] parts = input.split(" ");

		String minString = null;
		int minNumber = Integer.MAX_VALUE;

		for (int i = 0; i < parts.length; i += 2) {
			String str = parts[i];
			int number = Integer.parseInt(parts[i + 1]);

			if (number < minNumber) {
				minNumber = number;
				minString = str;
			}
		}

		System.out.println("String with the minimum number: " + minString + " (Number: " + minNumber + ")");
	}

}
