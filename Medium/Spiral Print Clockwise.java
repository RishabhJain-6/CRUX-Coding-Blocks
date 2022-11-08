/*
Take as input a 2-d array.Print the 2-D array in sprial form clockwise.

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
11, 12, 13, 14, 24, 34, 44, 43, 42, 41, 31, 21, 22, 23, 33, 32, END

Explanation
For spiral level clockwise traversal, Go for first row-> last column ->last row -> first column and then do the same traversal for the remaining matrix 
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
			for (int c = cst; c <= cnd && count < limit; c++) {
				System.out.print(mat[rst][c] + ", ");
				count++;
			}

			for (int r = rst + 1; r <= rnd && count < limit; r++) {
				System.out.print(mat[r][cnd] + ", ");
				count++;
			}

			for (int c = cnd - 1; c >= cst && count < limit; c--) {
				System.out.print(mat[rnd][c] + ", ");
				count++;
			}

			for (int r = rnd - 1; r >= rst + 1 && count < limit; r--) {
				System.out.print(mat[r][cst] + ", ");
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
