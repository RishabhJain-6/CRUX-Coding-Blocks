/*
Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.

Input Format
Single integer N.

Constraints
N <= 20

Output Format
Print pattern.

Sample Input
5
Sample Output
    *****
   *   *
  *   *
 *   *
*****

Explanation
For any input N. First line contains 4 space and then 5 {*} and then the second line contains according to the output format.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int numsp = n - 1;
		    int numst = n;
		    int row = 1;
		    while (row <= n) {
			    int s = 1;
			    while (s <= numsp) {
				    System.out.print(" ");
				    s++;
			    }
			    int i = 1;
			    while (i <= numst) {
				    if (row > 1 && row < n) {
					    if (i == 1 || i == numst) {
						    System.out.print("*");
					    } else {
						    System.out.print(" ");
					    }
				    } else {
					    System.out.print("*");
				    }
				    i++;
			    }
			    numsp--;
			    row++;
			    System.out.println();
		    }
    }
}
