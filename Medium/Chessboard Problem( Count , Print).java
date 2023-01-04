/*
Take as input N, a number. N represents the size of a chess board. We’ve a piece standing in top-left corner and it must reach the bottom-right corner. 
The piece moves as follows –

a. In any cell, the piece moves like a knight. But out of the possible 8 moves for a knight, only the positive ones are valid 
   i.e. both row and column must increase in a move.

b. On the walls (4 possible walls), the piece can move like a rook as well (in addition of knight moves). 
   But, only the positive moves are allowed i.e. as a rook, piece can move any number of steps horizontally or vertically 
   but in a manner, such that row or column must increase.

c. On the diagonals (2 possible diagonals), the piece can move like a bishop as well (in addition to the knight and possibly rook moves). 
   But, only the positive moves are allowed i.e. as a bishop, piece can move in a way such that row and column must increase.

You are supposed to write the following functions

a. Write a recursive function which prints all valid paths.

b. Write a recursive function which returns the count of different distinct ways this board can be crossed. Print the value returned.

Input Format
Enter the size of the chessboard N

Constraints
None

Output Format
Display the total number of valid paths and print all the valid paths in a space separated manner

Sample Input
3
Sample Output
{0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-1}K{2-2} {0-0}R{0-1}R{0-2}R{1-2}R{2-2} {0-0}R{0-1}R{0-2}R{2-2} {0-0}R{0-1}R{1-1}B{2-2} {0-0}R{0-1}R{2-1}R{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-1}B{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{1-1}B{2-2} {0-0}B{2-2}
18

*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = fPath(n, "", n - 1, n - 1, 0, 0);
		if (ans != -1)
			System.out.println("\n" + ans);
	}

	public static int fPath(int n, String res, int rowAtEnd, int col_end, int currentRow, int currentCol) {
		if (currentCol == col_end && currentRow == rowAtEnd) {
			System.out.print(res + "{" + currentRow + "-" + currentCol + "} ");
			return 1;
		}
		if (currentCol >= n || currentRow >= n) {
			return 0;
		}
		int val = 0;
		val += fPath(n, res + "{" + currentRow + "-" + currentCol + "}K", rowAtEnd, col_end, currentRow + 2,
				currentCol + 1);
		val += fPath(n, res + "{" + currentRow + "-" + currentCol + "}K", rowAtEnd, col_end, currentRow + 1,
				currentCol + 2);
		if (currentCol == 0 || currentRow == 0 || currentCol == n - 1 || currentRow == n - 1) {
			for (int i = 1; i <= rowAtEnd; i++) {
				val += fPath(n, res + "{" + currentRow + "-" + currentCol + "}R", rowAtEnd, col_end, currentRow,
						currentCol + i);
			}
			for (int i = 1; i <= rowAtEnd; i++) {
				val += fPath(n, res + "{" + currentRow + "-" + currentCol + "}R", rowAtEnd, col_end, currentRow + i,
						currentCol);
			}
		}
		if (currentCol == currentRow || currentCol + currentRow == rowAtEnd) {
			for (int i = 1; i <= rowAtEnd; i++) {
				val += fPath(n, res + "{" + currentRow + "-" + currentCol + "}B", rowAtEnd, col_end, currentRow + i,
						currentCol + i);

			}
		}
		return val;
	}
}
