/*
Take N (number of rows), print the following pattern (for N = 4)

1
2 3
4 5 6
7 8 9 10

Input Format

Constraints
0 < N < 100

Output Format

Sample Input
4
Sample Output
1  
2	3  
4	5	6  
7	8	9	10

Explanation
Each number is separated from other by a tab.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int row = 1;
	int a = 1;
	while (row <= n) {
		int i = 1;
		while (i <= row) {
			System.out.print(a + "\t");
			a++;
			i++;
		}
		row++;
		System.out.println();
	}
    }
}
