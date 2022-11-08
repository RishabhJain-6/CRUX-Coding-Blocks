/*
You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive numbers.

Input Format
First line contains integer t which is number of test case.
For each test case, it contains an integer n which is the size of array and next line contains n space separated integers denoting the elements of the array.

Constraints
1<=t<=100
1<=n<=1000
|Ai| <= 10000

Output Format
Print the maximum circular sum for each testcase in a new line.

Sample Input
1
7
8 -8 9 -9 10 -11 12
Sample Output
22

Explanation
Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			int sum = 0;
			for (int j = 0; j < n; j++) {
				arr[j] = scn.nextInt();
				sum += arr[j];
			}
			int a = kadenAlgo(arr);
			for (int k = 0; k < n; k++) {
				arr[k] = arr[k] * (-1);
			}
			int b = kadenAlgo(arr) + sum;
			System.out.println(Math.max(a, b));
		}
	}

	public static int kadenAlgo(int[] arr) {
		int max_sum = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			max_sum = Math.max(max_sum, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return max_sum;
	}
}
