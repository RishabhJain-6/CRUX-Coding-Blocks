/*
You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from position (i,j), down or right on the grid.
Initially rat is on the position (1,1). It wants to reach position (N,M). 
Find the rightmost path through which, rat can reach this position. 
A path is rightmost, if the rat is at position (i,j), it will always move to (i,j+1), if there exists a path from (i,j+1) to (N,M).

Input Format
First line contains 2 integers, N and M, denoting the rows and columns in the grid. Next N line contains. M characters each. 
An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.

Constraints
1<=N,M<=1000 GRID(i,j)='X' or 'O'

Output Format
If a solution exists: Print N lines, containing M integers each. 
A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
If solution doesn't exist, just print "-1".

Sample Input
5 4
OXOO
OOOX
OOXO
XOOO
XXOO
Sample Output
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 1 
0 0 0 1 
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < n; i++) {
			String S = scn.next();
			for (int j = 0; j < m; j++) {
				maze[i][j] = S.charAt(j);
			}
		}
		int[][] arr = new int[n][m];
		boolean ans = escape(maze, 0, 0, arr);
		if (!ans) {
			System.out.println("-1");
			return;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean escape(char[][] maze, int i, int j, int[][] output) {
		if (i == maze.length - 1 && j == maze[0].length - 1 && maze[i][j] == 'O') {
			output[i][j] = 1;
			return true;
		}
		if (i == maze.length || j == maze[0].length) {
			return false;
		}
		if (maze[i][j] == 'O') {
			output[i][j] = 1;
		} else if (maze[i][j] == 'X') {
			return false;
		}

		boolean res = false;
		res = escape(maze, i, j + 1, output);
		if (!res) {
			if (j + 1 < maze[0].length) {
				output[i][j + 1] = 0;
			}
			res = escape(maze, i + 1, j, output);
		}
		return res;
	}
}
