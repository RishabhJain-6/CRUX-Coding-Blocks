/*
Given coefficients of a quadratic equation , you need to print the nature of the roots (Real and Distinct , Real and Equal or Imaginary) and the roots.
If Real and Distinct , print the roots in increasing order.
If Real and Equal , print the same repeating root twice
If Imaginary , no need to print the roots.

Note : Print only the integer part of the roots.

Input Format
First line contains three integer coefficients a,b,c for the equation ax^2 + bx + c = 0.

Constraints
-100 <= a, b, c <= 100

Output Format
Output contains one/two lines. First line contains nature of the roots .The next line contains roots(in non-decreasing order) separated by a space if they exist. 
If roots are imaginary do not print the roots. Output the integer values for the roots.

Sample Input
1 -11 28
Sample Output
Real and Distinct
4 7

Explanation
The input corresponds to equation ax^2 + bx + c = 0. Roots = (-b + sqrt(b^2 - 4ac))/2a , (-b - sqrt(b^2 - 4ac))/2a
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int c = scn.nextInt();
		    int b2 = (int) Math.pow(b, 2);
		    int D = b2 - 4 * a * c;
		    if (D == 0) {
			    int root = -b / 2 * a;
			    System.out.println("Real and Equal");
			    System.out.println(root + " " + root);
		    } else if (D > 0) {
			    int sD = (int) Math.sqrt(D);
			    int root1 = (-b + sD) / 2 * a;
			    int root2 = (-b - sD) / 2 * a;
			    System.out.println("Real and Distinct");
			    if (root1 < root2) {
				    System.out.print(root1 + " " + root2);
			    } else {
				    System.out.print(root2 + " " + root1);
			    }
		    } else {
			    System.out.println("Imaginary");
		    }
    }
}
