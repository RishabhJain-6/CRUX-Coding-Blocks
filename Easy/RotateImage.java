/*
Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.

Input Format
First line contains a single integer N. Next N lines contain N space separated integers.

Constraints
N < 1000

Output Format
Print N lines with N space separated integers of the rotated array.

Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9 13 

Explanation
Rotate the array 90 degrees anticlockwise.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = scn.nextInt();
			}
		}
		rotate(mat);
	}

	public static void rotate(int[][] mat) {
		int n = mat.length;
		for (int i = 0; i < n; i++) { // Reverse Matrix
			for (int j = 0; j < n / 2; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][n - j - 1];
				mat[i][n - j - 1] = temp;
			}
		}

		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) { // Transpose
			for (int j = 0; j < n; j++) {
				arr[i][j] = mat[j][i];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
