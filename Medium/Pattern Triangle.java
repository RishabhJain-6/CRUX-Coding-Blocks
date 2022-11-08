/*
Take N (number of rows), print the following pattern (for N = 4).

                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
Input Format

Constraints
0 < N < 10

Output Format

Sample Input
4
Sample Output
      1
		2	3	2
	3	4	5	4	3
4	5	6	7	6	5	4

Explanation
Each number is separated from other by a tab.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int row = 1;
		    int numst = 1;
		    int numsp = n - 1;
		    while (row <= n) {
			    int a = row;
			    int s = 1;
			    while (s <= numsp) {
				    System.out.print("\t");
				    s++;
			    }
			    int i = 1;
			    while (i <= numst) {
				    System.out.print(a + "\t");
				    i++;
				    if (i <= numst / 2 + 1) {
					    a++;
				    } else {
					    a--;
				    }
			    }
			    row++;
			    numsp--;
			    numst = numst + 2;
			    System.out.println();
		    }
    }
}
