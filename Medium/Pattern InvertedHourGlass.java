/*
Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 
             
Input Format
Take N as input.

Constraints

Output Format
Pattern should be printed with a space between every two values.

Sample Input
5
Sample Output
5                   5 
5 4               4 5 
5 4 3           3 4 5 
5 4 3 2       2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2 1 0 1 2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2       2 3 4 5 
5 4 3           3 4 5 
5 4               4 5 
5                   5 
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int row = 1;
	int num_row = n;
	int nst = 1;
	int nsp = 2 * n - 1;
	while (row <= 2 * n + 1) {
		int num = num_row;
		int cst1 = 1;
		while (cst1 <= nst) {
			System.out.print(num + " ");
			cst1++;
			num--;
		}
		int csp = 1;
		while (csp <= nsp) {
			System.out.print("  ");
			csp++;
		}
		int cst2 = 1;
		if (row == n + 1) {
			cst2 = 2;
			num += 2;
		} else {
			num += 1;
		}
		while (cst2 <= nst) {
			System.out.print(num + " ");
			num++;
			cst2++;
          	}
          	row++;
          	System.out.println();
		if (row <= n + 1) {
			nst++;
			nsp = nsp - 2;
		} else {
			nst--;
			nsp = nsp + 2;
		}
	}
    }
}
