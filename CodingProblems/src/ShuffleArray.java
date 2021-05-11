/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class ShuffleArray {
	public static int[] shuffle(int[] nums, int n) {
		if (n == 1) return nums;
		int x = 0;
		int x1 = n;
		int[] newArray = new int[nums.length];
		for (int i = 0; i < nums.length; i+=2) {
			newArray[i] = nums[x];
			newArray[i+1] = nums[x1];
			x++;
			x1++;
		}
		return newArray;
	}
}
