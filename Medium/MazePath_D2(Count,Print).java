/*
Take as input N. N is the number of rows and columns on a square board. Our player starts in top-left corner of the board and must reach bottom-right corner. 
In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east). 
But the diagonal step is allowed only when the player is currently on one of the diagonals (there are two diagonals)

Write a recursive function which:
a. Returns the count of different ways the player can travel across the board. Print the value returned.
b. Prints moves for all valid paths across the board.

Input Format
Enter the number N.

Constraints
None

Output Format
Display the total number of paths and display all the possible paths in a space separated manner.

Sample Input
3
Sample Output
VVHH VHVH VHHV VHD HVVH HVHV HVD HHVV DVH DHV DD 
11
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("\n" + escape(n, 0, 0, ""));
	}

	public static int escape(int n, int i, int j, String path) {
		if (i == n - 1 && j == n - 1) {
			System.out.print(path + " ");
			return 1;
		}
		if (i >= n || j >= n) {
			return 0;
		}

		int count = 0;
		count += escape(n, i + 1, j, path + "V");
		count += escape(n, i, j + 1, path + "H");
		if (i == j || i + j == n - 1) {
			count += escape(n, i + 1, j + 1, path + "D");
		}
		return count;
	}
}
