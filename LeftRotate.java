package array;

public class LeftRotate {

	static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		LeftRotate obj = new LeftRotate();
		int nums[] = { 1, 2, 3, 4, 5, 6 };
		int k = 7;

		k %= nums.length;

		reverse(nums, 0, nums.length - 1);
		for (int a : nums) {
			System.out.print(a + " ");
		}
		System.out.println();
		reverse(nums, 0, k - 1);
		for (int a : nums) {
			System.out.print(a + " ");
		}
		System.out.println();
		reverse(nums, k, nums.length - 1);
		for (int a : nums) {
			System.out.print(a + " ");
		}
	}

}
