/*
Take as input a 2-d array. Print the 2-D array in spiral form anti-clockwise.

Input Format
Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers separated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END

Explanation
For spiral level anti-clockwise traversal, Go for first column-> last row ->last column-> first row and then do the same traversal for the remaining matrix .
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] mat = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = scn.nextInt();
			}
		}
		spiral_anticlock(mat);
	}

	public static void spiral_anticlock(int[][] mat) {
		int rst = 0;
		int cst = 0;
		int rnd = mat.length - 1;
		int cnd = mat[0].length - 1;
		int count = 0;
		int limit = mat.length * mat[0].length;

		while (rst <= rnd && cst <= cnd) {
			for (int r = rst; r <= rnd && count < limit; r++) {
				System.out.print(mat[r][cst] + ", ");
				count++;
			}

			for (int c = cst + 1; c <= cnd && count < limit; c++) {
				System.out.print(mat[rnd][c] + ", ");
				count++;
			}

			for (int r = rnd - 1; r >= rst && count < limit; r--) {
				System.out.print(mat[r][cnd] + ", ");
				count++;
			}

			for (int c = cnd - 1; c >= cst + 1 && count < limit; c--) {
				System.out.print(mat[rst][c] + ", ");
				count++;
			}

			rst++;
			rnd--;
			cst++;
			cnd--;
		}
		System.out.println("END");
	}
}
