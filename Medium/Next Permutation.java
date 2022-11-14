/*
Given an array Arr[], Treat each element of the array as the digit and whole array as the number. 
Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.

If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order.

Note: The replacement must be in-place, do not allocate extra memory.

Input Format
The First Line contains the Number of test cases T.
Next Line contains an Integer N, number of digits of the number.
Next Line contains N-space separated integers which are elements of the array 'Arr'.

Constraints
1 <= T <= 100
1 <= N <= 1000
0 <= Ai <= 9

Output Format
Print the Next Permutation for each number separated by a new Line.

Sample Input
2
3
1 2 3 
3
3 2 1

Sample Output
1 3 2
1 2 3

Explanation
Possible permutations for {1,2,3} are {1,2,3} , {1,3,2} , {2,1,3} , {2,3,1}, {3,1,2} and {3,2,1}. {1,3,2} is the immediate next permutation after {1,2,3}.
For the second testcase , {3,2,1} is the last configuration so we print the first permutation as its next permutation.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int j = 0; j < t; j++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			arr = nextPermutation(arr);
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static int[] nextPermutation(int arr[]) {
		boolean isIncreasing = true;
		int i = arr.length - 1;
		while (i > 0) {
			if (arr[i] <= arr[i - 1]) {
				// do nothing
			} else {
				isIncreasing = false;
				break;
			}
			i--;
		}
		int swap_idx = i;
		while (swap_idx < arr.length && !isIncreasing) {
			if (arr[i - 1] >= arr[swap_idx]) {
				swap_idx--;
				break;
			}
			swap_idx++;
		}
		if (swap_idx == arr.length) {
			swap_idx--;
		}
		if (!isIncreasing) {
			swap(arr, i - 1, swap_idx);
			reverse(arr, i, arr.length - 1);
		} else {
			reverse(arr, 0, arr.length - 1);
		}
		return arr;
	}

	public static void swap(int arr[], int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}

	public static void reverse(int arr[], int s, int e) {
		for (int i = s; i < e; i++) {
			int temp = arr[i];
			arr[i] = arr[e];
			arr[e] = temp;
			e--;
		}
	}
}
