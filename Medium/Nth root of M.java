/*
You are given 2 numbers (N , M); the task is to find N√M (Nth root of M).

Input Format
First line contains a single integer T denoting the number of test cases. Next T lines contains tow integers N and M

Constraints
1 <= T <= 200
2 <= N <= 20
1 <= M <= 10^9+5

Output Format
For each test case, in a new line, print an integer denoting Nth root of M if the root is an integer else print -1.

Sample Input
2
2 9
3 9
Sample Output
3
-1
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			root(n, m);
		}
	}

	public static void root(int n, int m) {
		int s = 1;
		int e = m;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			int a = (int) Math.pow(mid, n);
			if (a == m) {
				System.out.println(mid);
				return;
			} else if (a < m) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		System.out.println(-1);
	}
}
