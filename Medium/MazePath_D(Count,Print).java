/*
Take as input N1 and N2, both numbers. 
N1 and N2 is the number of rows and columns on a rectangular board. 
Our player starts in top-left corner of the board and must reach bottom-right corner. 
In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).

Write a recursive function which:
a. Returns the count of different ways the player can travel across the board. Print the value returned.
b. Prints moves for all valid paths across the board.

Input Format
Enter the number of rows N1 and number of columns N2

Constraints
None

Output Format
Display the total number of paths and print all the possible paths in a space separated manner

Sample Input
3
3
Sample Output
VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
13
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int ans = maze(n1, n2, 0, 0, "");
		if (ans != -1)
			System.out.println("\n" + ans);
	}

	public static int maze(int n1, int n2, int i, int j, String Path) {
		if (n1 <= 1 && n2 <= 1) {
			System.out.println(0);
			return -1;
		}
		if (i == n1 - 1 && j == n2 - 1) {
			System.out.print(Path + " ");
			return 1;
		}

		if (i >= n1 || j >= n2) {
			return 0;
		}

		int count = 0;
		count += maze(n1, n2, i + 1, j, Path + 'V');
		count += maze(n1, n2, i, j + 1, Path + 'H');
		count += maze(n1, n2, i + 1, j + 1, Path + 'D');
		return count;
	}
}
