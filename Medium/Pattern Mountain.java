/*

Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1   
Input Format
Constraints
0 < N < 10

Output Format
Sample Input
4
Sample Output
1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int row = 1;
	int numst = 2 * n - 1;
	int a = 1;
	while (row <= n) {
		int i = 1;
		while (i <= numst) {
			if (i > row && i < numst - row + 1) {
				System.out.print("\t");
			} else {
				System.out.print(a + "\t");
			}
			if (i <= (2 * n - 1) / 2) {
				a++;
			} else if (i == numst) {

			} else {
				a--;
			}
			i++;
		}
		System.out.println();
		row++;
	}
    }
}
