/*
Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 
Input Format
Take N as input.

Constraints
N is odd number.

Output Format
Pattern should be printed with a space between every two values.

Sample Input
7
Sample Output
            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 
            
Explanation
Catch the pattern and print it accordingly.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int row = 1;
	int nst = 1;
	int nsp1 = n - 1;
	int nsp2 = -1;
	int val1 = row;
	int val2 = 1;

	while (row <= n) {
		int csp1 = 1;
		while (csp1 <= nsp1) {
			System.out.print("  ");
			csp1 = csp1 + 1;
		}

		int cst1 = 1;
		while (cst1 <= nst) {
			System.out.print(val1 + " ");
			val1 = val1 - 1;
			cst1 = cst1 + 1;
		}

		int csp2 = 1;
		while (csp2 <= nsp2) {
			System.out.print("  ");
			csp2 = csp2 + 1;
		}

		if (row != 1 && row != n) {
			int cst2 = 1;
			while (cst2 <= nst) {
				System.out.print(val2 + " ");
				val2 = val2 + 1;
				cst2 = cst2 + 1;
			}
		}
		System.out.println();

		if (row <= n / 2) {
			nst = nst + 1;
			nsp1 = nsp1 - 2;
			nsp2 = nsp2 + 2;
			val1 = row + 1;
			val2 = 1;
		} else {
			nst = nst - 1;
			nsp1 = nsp1 + 2;
			nsp2 = nsp2 - 2;
			val1 = n - row;
			val2 = 1;
		}
		row = row + 1;
	}
    }
}
