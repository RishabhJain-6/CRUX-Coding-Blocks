/*
Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.<br.

Input Format
First line contains a single integer N. Next N lines contains N integers each, where jth integer int ith line denotes the value at ith row and jth column 
in sudoku grid. This value is 0, if the cell is empty.

Constraints
N=9
At least one solution does exists for input matrix.

Output Format
Print N lines containing N integers each, where jth integer int ith line denotes the value at ith row and jth column in sudoku grid, such that all cells are filled.

Sample Input
9
5 3 0 0 7 0 0 0 0 
6 0 0 1 9 5 0 0 0 
0 9 8 0 0 0 0 6 0 
8 0 0 0 6 0 0 0 3 
4 0 0 8 0 3 0 0 1 
7 0 0 0 2 0 0 0 6 
0 6 0 0 0 0 2 8 0 
0 0 0 4 1 9 0 0 5 
0 0 0 0 8 0 0 7 9 

Sample Output
5 3 4 6 7 8 9 1 2 
6 7 2 1 9 5 3 4 8 
1 9 8 3 4 2 5 6 7 
8 5 9 7 6 1 4 2 3 
4 2 6 8 5 3 7 9 1 
7 1 3 9 2 4 8 5 6 
9 6 1 5 3 7 2 8 4 
2 8 7 4 1 9 6 3 5 
3 4 5 2 8 6 1 7 9 
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                mat[i][j]=scn.nextInt();
            }
        }
        suvle(0,0,mat);
    }

    public static void disp(int[][] mat) {
		for (int[] row : mat) {
			for (int ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void suvle(int r, int c, int[][] mat) {

//		moving logic
		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
			disp(mat);
			return;
		}

		if (mat[r][c] != 0) {
			suvle(r, c + 1, mat);
		} else {
			for (int d = 1; d <= 9; d++) {
				if (isSafe(mat, r, c, d)) {
					mat[r][c] = d;
					suvle(r, c + 1, mat);
					mat[r][c] = 0;
				}
			}
		}

	}

	private static boolean isSafe(int[][] mat, int r, int c, int d) {
		// TODO Auto-generated method stub
		for (int row = 0; row < 9; row++) {
			if (mat[row][c] ==  d) {
				return false;
			}
		}
		for (int col = 0; col < 9; col++) {
			if (mat[r][col] ==  d) {
				return false;
			}
		}

		int boxr = r / 3;
		int boxc = c / 3;

		for (int rr = boxr * 3; rr < boxr * 3 + 3; rr++) {
			for (int cc = boxc * 3; cc < boxc * 3 + 3; cc++) {
				if (mat[rr][cc] ==  d) {
					return false;
				}

			}
		}
		return true;
	}
}
