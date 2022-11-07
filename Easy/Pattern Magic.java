/*
You will be given a number N. You have to code a hollow diamond looking pattern.

The output for N=5 is given in the following.
*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********

Input Format
The input has only one single integer N.

Constraints
Output Format
Output the given pattern.

Sample Input
Sample Output

Explanation
Write a code to print above given pattern. No space between any two characters.
*/

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int row = 1;
		    int numst1 = n;
		    int numst2 = n-1;
		    int numsp = 0;
		    while (row <= 2*n-1) {
			    int i = 1;
			    while (i <= numst1) {
				    System.out.print("*");
				    i++;
			    }
			    int s = 1;
			    while (s <= numsp) {
				    System.out.print(" ");
				    s++;
			    }
			    int j = 1;
			    while (j <= numst2) {
				    System.out.print("*");
				    j++;
			    }
			    if (row == 1) {
				    numst1--;
				    numsp++;
			    } else if (row < n) {
				    numst1--;
				    numst2--;
				    numsp += 2;
			    } else if (row == 2*n - 2) {
				    numst1++;
				    numsp -= 1;
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
