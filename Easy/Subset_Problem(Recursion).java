/*
Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number

a. Write a recursive function which prints subsets of the array which sum to target.

b. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.

Input Format
Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number

Constraints
None

Output Format
Display the number of subsets and print the subsets in a space separated manner.

Sample Input
3
1
2
3
3
Sample Output
1 2  3
2

Explanation
Add 2 spaces between 2 subset solutions
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		ArrayList<Integer> Al = new ArrayList<>();
		System.out.println("\n" + subsets(arr, target, 0, 0, Al));
	}

	public static int subsets(int[] arr, int target, int curr_sum, int i, ArrayList<Integer> Al) {
		if (curr_sum == target) {
			for (int a : Al) {
				System.out.print(a + " ");
			}
			System.out.print(" ");
			return 1;
		}

		if (i >= arr.length || curr_sum > target) {
			return 0;
		}

		int count = 0;
		Al.add(arr[i]);
		count += subsets(arr, target, curr_sum + arr[i], i + 1, Al);
		Al.remove(Al.size() - 1);
		count += subsets(arr, target, curr_sum, i + 1, Al);
		return count;
	}
}
