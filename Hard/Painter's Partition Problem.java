/*
Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards 
i.e. if the length of a particular board is 5, it will take 5 units of time to paint the board. 
Compute the minimum amount of time to paint all the boards.

Note that:
Every painter can paint only contiguous segments of boards.
A board can only be painted by 1 painter at maximum.

Input Format
First line contains K which is the number of painters. 
Second line contains N which indicates the number of boards. 
Third line contains N space separated integers representing the length of each board.

Constraints
1 <= K <= 10
1 <= N <= 10
1<= Length of each Board <= 10^8

Output Format
Output the minimum time required to paint the board.

Sample Input
2
2
1 10
Sample Output
10
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt();
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(painterPartition(arr, k));
	}

	public static long painterPartition(int[] arr, int k) {
		long ans = -1;
		long s = 0;
		long e = 0;
		for (int i : arr) {
			e += i;
		}
		while (s <= e) {
			long mid = s + (e - s) / 2;
			boolean c = canPaint(arr, k, mid);
			if (c) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

	public static boolean canPaint(int[] arr, int k, long board) {
		int allocated = 1;
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (sum + arr[i] <= board) {
				sum += arr[i];
			} else {
				allocated++;
				if (allocated > k || arr[i] > board) {
					return false;
				}
				sum = arr[i];
			}
		}
		return true;
	}
}
