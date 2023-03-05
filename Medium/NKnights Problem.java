/*
Take as input N, the size of a chess board. We are asked to place N number of Knights in it, so that no knight can kill other.

a. Write a recursive function which returns the count of different distinct ways the knights can be placed across the board. Print the value returned.

b.Write a recursive function which prints all valid configurations (void is the return type for function).

Input Format
Enter the size of the chessboard N

Constraints
None

Output Format
Display the number of ways a knight can be placed and print all the possible arrangements in a space separated manner

Sample Input
2
Sample Output
{0-0} {0-1}  {0-0} {1-0}  {0-0} {1-1}  {0-1} {1-0}  {0-1} {1-1}  {1-0} {1-1} 
6
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean[][] visited = new boolean[n][n];
		System.out.println("\n" + place(0, 0, n, n, "", visited));
	}

	public static int place(int i, int j, int n, int KTP, String path, boolean[][] Visited) {
		if (KTP == 0) {
			System.out.print(path + " ");
			return 1;
		}

		if (j == n) {
			i++;
			j = 0;
		}
		if (i == n)
			return 0;

		int sp1 = 0;
		if (isSafe(Visited, i, j)) {
			Visited[i][j] = true;
			sp1 += place(i, j + 1, n, KTP - 1, path + "{" + i + "-" + j + "} ", Visited);
			Visited[i][j] = false;
		}
		sp1 += place(i, j + 1, n, KTP, path, Visited);
		return sp1;
	}

	private static boolean isSafe(boolean[][] visited, int i, int j) {
		int t1 = i;
		int t2 = j;
		if (t1 - 2 >= 0 && t2 - 1 >= 0)
			if (visited[t1 - 2][t2 - 1])
				return false;
		if (t1 - 1 >= 0 && t2 - 2 >= 0)
			if (visited[t1 - 1][t2 - 2])
				return false;
		if (t1 - 1 >= 0 && t2 + 2 < visited.length)
			if (visited[t1 - 1][t2 + 2])
				return false;
		if (t1 - 2 >= 0 && t2 + 1 < visited.length)
			if (visited[t1 - 2][t2 + 1])
				return false;
		return true;
	}
}
