/*
Take as input x and n, two numbers. Write a function to calculate x raise to power n. Target complexity is O(logn).
NOTE: Try both recursive and bitmasking approach.

Input Format
Enter the number N and its power P

Constraints
None

Output Format
Display N^P

Sample Input
2
3
Sample Output
8
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(xPown(x, n));
	}

	public static int xPown(int x, int n) {
		if (n == 1) {
			return x;
		}
		int sp = xPown(x, n - 1);
		return x * sp;
	}
}
