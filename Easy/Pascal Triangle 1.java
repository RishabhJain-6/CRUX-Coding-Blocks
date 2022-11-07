/*
Given an integer N, print Pascal Triangle upto N rows. 

Input Format
Single integer N.

Constraints
N <= 10

Output Format
Print pascal triangle.

Sample Input
4
Sample Output
       1
     1   1
   1   2   1
 1   3   3   1
 
Explanation
Last row has one " "
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int numsp = n - 1;
		int numst = 1;
		int row = 0;
		while (row < n) {
			int s = 1;
			while (s <= n - row) {
				System.out.print(" ");
				s++;
			}
			int i = 0;
			while (i <= row) {
				System.out.print(nCr(row, i) + " ");
				i++;
			}
			row++;
			System.out.println();
		}
	}

	public static int nCr(int n, int r) {

		int numerator = 1, denominator = 1;
		if (n < r || n == 0)
			return 1;
		int n_fact = fact(n);
		int r_fact = fact(r);
		int n_r_fact = fact(n - r);
		int ans = n_fact / (r_fact * n_r_fact);
		return ans;
	}

	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int ans = 1;
		for (int i = 2; i <= n; i++) {
			ans *= i;
		}
		return ans;
	}
}
