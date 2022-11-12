/*
Given an unsorted integer array arr, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.

Input Format
First line contains N(size of array).
Second line takes N integers of array.

Constraints
1<=N<=10^5
2^31<=arr[i]<=2^31+1

Output Format
Print the smallest missing positive number.

Sample Input
4
3 -1 4 1
Sample Output
2

Explanation
2 is the smallest missing positive integer in the array.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(firstMissingPositive(arr));
	}

	static void swap(int[] nums, int s, int e) {
		int temp = nums[s];
		nums[s] = nums[e];
		nums[e] = temp;
	}

	public static int firstMissingPositive(int[] nums) {
		int i = 0;
		int n = nums.length;
		while (i < n) {
			int rightIdx = nums[i] - 1;
			if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[rightIdx]) {
				swap(nums, i, rightIdx);
			} else {
				i++;
			}
		}
		for (int idx = 0; idx < nums.length; idx++) {
			if (nums[idx] != idx + 1) {
				return idx + 1;
			}
		}
		return nums.length + 1;
	}
}
