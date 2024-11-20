package array;

public class reverse {

	public static void main(String[] args) {

		char a[] = { 'e', 't', 'r', 'l', 'o' };
		char array[] = new char[a.length];

		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			char k = a[i];
			array[j] = k;
		}

		// Print the elements in the 'array' after copying
		System.out.println("\nCopied array:");
		for (char c : array) {
			System.out.print(c + " ");
		}

	//	------------------------------------------------------------------------------------------------------
		
	}

}
