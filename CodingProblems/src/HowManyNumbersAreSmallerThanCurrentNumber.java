/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
 */
public class HowManyNumbersAreSmallerThanCurrentNumber {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] soln = new int[nums.length];
		int counter = 0;
        for (int i = 0; i < nums.length; i++) {
        	for (int j = 0; j < nums.length; j++) {
        		if (j == i) continue;
        		if (nums[j] < nums[i]) counter++;
        	}
        	soln[i] = counter;
        	counter = 0;
        }
		return soln;
    }
}
