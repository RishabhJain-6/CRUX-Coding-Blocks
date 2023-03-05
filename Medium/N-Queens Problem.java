/*
Take as input N, the size of a chess board. We are asked to place N number of queens in it, so that no queen can kill other.

a. Write a recursive function which returns the count of different distinct ways the queens can be placed across the board. Print the value returned.

b. Write a recursive function which prints all valid configurations (void is the return type for function).

Input Format
Enter the number N(Size of the chessboard)

Constraints
None

Output Format
Display the number of possible ways of arranging N queens and print all the possible arrangements in a space separated manner

Sample Input
4
Sample Output
{1-2} {2-4} {3-1} {4-3}  {1-3} {2-1} {3-4} {4-2}
2
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		solveNQueens(n);
	}

	public static void solveNQueens(int n) {
		char[][] board = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}
		int a = help(0, n, board);
		System.out.println("\n" + a);

	}

	public static int help(int i, int n, char[][] board) {
		// BASE CASE
		if (i == n) {
			String s = "";
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (board[j][k] == 'Q')
						s += "{" + (j+1) + "-" + (k+1) + "} ";
				}
			}
			System.out.print(s + " ");
			return 1;
		}

		// RECURSION
		int ans = 0;
		for (int j = 0; j < n; j++) {
			if (isSafe(i, j, board, n)) {
				board[i][j] = 'Q';
				ans += help(i + 1, n, board);
				board[i][j] = '.';
			}
		}
		return ans;
	}

	static boolean isSafe(int i, int j, char[][] board, int n) {
		// up
		int tempi = i;
		while (tempi >= 0) {
			if (board[tempi][j] == 'Q')
				return false;
			tempi--;
		}

		// Right Diagonal
		tempi = i;
		int tempj = j;
		while (tempi >= 0 && tempj <= n - 1) {
			if (board[tempi][tempj] == 'Q')
				return false;
			tempi--;
			tempj++;
		}

		// left diagonal
		tempi = i;
		tempj = j;
		while (tempi >= 0 && tempj >= 0) {
			if (board[tempi][tempj] == 'Q')
				return false;
			tempi--;
			tempj--;
		}
		return true;
	}
}
