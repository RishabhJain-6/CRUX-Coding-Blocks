/*
Take N (number of rows), print the following pattern (for N = 5).

     * * * * *
     * *   * *
     *       *
     * *   * *
     * * * * *
Input Format
Constraints
0 < N < 10 (where N is an odd number)

Output Format

Sample Input
5
Sample Output
* * * * *
* *   * *
*       *
* *   * *
* * * * *

Explanation
Each '*' is separated from other by a tab.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int row = 1;
	int numst1 = n / 2 + 1;
	int numst2 = n / 2;
	int numsp = 0;
	while (row <= n) {
		int i = 1;
		while (i <= numst1) {
			System.out.print("*\t");
			i++;
		}
		int s = 1;
		while (s <= numsp) {
			System.out.print(" \t");
			s++;
		}
		int j = 1;
		while (j <= numst2) {
			System.out.print("*\t");
			j++;
		}
		if (row == 1) {
			numst1--;
			numsp++;
		} else if (row <= n / 2) {
			numst1--;
			numst2--;
			numsp += 2;
		} else if (row == n - 1) {
			numst1++;
			numsp -= 2;
		} else {
			numst1++;
			numst2++;
			numsp -= 2;
		}
		System.out.println();
		row++;
	}
    }
}
