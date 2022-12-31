/*
Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders). 
Take as input M, a number. M is the number of faces of the dice.

a. Write a recursive function which returns the count of different ways the board can be traveled using the dice. Print the value returned.

b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function).

Input Format
Enter a number N (size of the board) and number M(number of the faces of a dice)

Constraints
None

Output Format
Display the number of paths and print all the paths in a space separated manner

Sample Input
3
3

Sample Output
111 12 21 3 
4
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int ans = pathfind(0, n, m, "");
		System.out.println("\n" + ans);
	}

	public static int pathfind(int curr, int n, int m, String path) {
		if (curr == n) {
			System.out.print(path + " ");
			return 1;
		}

		if (curr > n) {
			return 0;
		}

		int count = 0;
		for (int i = 1; i <= m && n > 0; i++) {
			count += pathfind(curr + i, n, m, path + (char) (i + '0'));
		}
		return count;
	}
}
