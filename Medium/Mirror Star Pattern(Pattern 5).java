/*
Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

      *
   *  *  *  
*  *  *  *  *  
   *  *  *
      *
Input Format

Constraints
0 < N < 10 (only odd numbers allowed)

Output Format

Sample Input
5
Sample Output
      *
    * * *
  * * * * *
    * * *
      *
      
Explanation
Each '*' is separated from other by a tab.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int numsp = n / 2;
		    int numst = 1;
		    int row = 1;
		    while (row <= n) {
			    int s = 1;
			    while (s <= numsp) {
				    System.out.print("\t");
				    s++;
			    }
			    int i = 1;
			    while (i <= numst) {
				    System.out.print("*\t");
				    i++;
			    }
			    if (row < n / 2 + 1) {
				    numsp--;
				    numst += 2;
			    } else {
				    numsp++;
				    numst -= 2;
			    }
			    row++;
			    System.out.println();
		    }
    }
}
