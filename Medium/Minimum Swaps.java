/*
You are given an unordered array consisting of consecutive integers [1, 2, 3, …, n] without any duplicates. 
You are allowed to swap any two elements. 
You need to find the minimum number of swaps required to sort the array in ascending order.

Input Format
The first line contains an integer, n, the size of the array . The second line contains n space-separated integers arr[i].

Constraints
1 <= n <= 10^5 1 <= arr[i] <= n

Output Format
Print the minimum number of swaps to sort the given array.

Sample Input
4
4 3 1 2
Sample Output
3
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
		System.out.println(numberOfSwaps(arr));
	}

	public static int numberOfSwaps(int arr[]) {
		int count = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != i + 1) {
				int temp = arr[i];
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp;
				count++;
			} else {
				i++;
			}
		}
		return count;
	}
}
