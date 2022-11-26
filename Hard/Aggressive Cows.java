/*
Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. 
The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. 
To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. 
What is the largest minimum distance?

Input Format
First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively. 
The next line contains N integers containing the indexes of stalls.

Constraints
2 <= N <= 100,000
0 <= xi <= 1,000,000,000
2 <= C <= N

Output Format
Print one integer: the largest minimum distance.

Sample Input
5 3
1 2 8 4 9
Sample Output
3
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c = scn.nextInt();
		int[] stalls = new int[n];
		for (int i = 0; i < n; i++) {
			stalls[i] = scn.nextInt();
		}
		System.out.println(largestMinimumDistance(stalls, c));
	}

	public static int largestMinimumDistance(int[] arr, int c) {
		int ans = 0;
		Arrays.sort(arr);
		int n = arr.length;
		int s = 1;
		int e = arr[n - 1] - arr[0];
		while (s <= e) {
			int mid = (s + e) / 2;
			boolean canplace = canPlace(arr, mid, c);
			if (canplace) {
				ans = Math.max(ans, mid);
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return ans;
	}

	public static boolean canPlace(int[] arr, int m, int c) {
		int i = 1;
		int d = 0;
		int a = arr[0];
		int cp = 1;
		while (i < arr.length) {
			d = arr[i] - a;
			if (d < m) {
				i++;
			} else {
				cp++;
				a = arr[i];
				i++;
			}
			if (cp == c) {
				return true;
			}
		}
		return false;
	}
}
