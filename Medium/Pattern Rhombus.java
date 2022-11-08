/*
Take N (number of rows), print the following pattern (for N = 3).

                         1
                       2 3 2
                     3 4 5 4 3
                       2 3 2
                         1
Input Format

Constraints
0 < N < 10

Output Format

Sample Input
3
Sample Output
    		1		
	2	3	2
3	4	5	4	3
	2	3	2
		1
    
Explanation
Each number is separated from other by a tab.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int row = 1;
	int numsp = n - 1;
	int numst = 1;
	int a = 1;
	while (row <= 2 * n - 1) {
		int s = 1;
		while (s <= numsp) {
			System.out.print("\t");
			s++;
		}
		int i = 1;
		while (i <= numst) {
			System.out.print(a + "\t");
			if (i <= numst / 2) {
				a++;
			} else {
				a--;
			}
			i++;
		}
		if (row < n) {
			numsp--;
			numst += 2;
            		a+=2;
		} else {
			numsp++;
			numst -= 2;
		}
		row++;
		System.out.println();
	}
    }
}
