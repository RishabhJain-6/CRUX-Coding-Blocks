/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which returns the LCM of N1 and N2. Print the value returned.

Input Format

Constraints
0 < N1 < 1000000000
0 < N2 < 1000000000

Output Format

Sample Input
4 
6
Sample Output
12

Explanation
The smallest number that is divisible by both N1 and N2 is called the LCM of N1 and N2.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int divisor = a;
		    int dividend = b;
		    while (divisor != 0) {
			    int rem = dividend % divisor;
			    dividend = divisor;
			    divisor = rem;
		    }
		    int lcm = (a * b) / dividend;
		    System.out.println(lcm);
    }
}
