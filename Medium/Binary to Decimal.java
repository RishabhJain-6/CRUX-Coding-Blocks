/*
Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format

Sample Input
101010
Sample Output
42

Explanation
For binary number fedcba , Decimal number = f * 2^5 + e * 2^4 + d * 2^3 + …..+ a * 2^0.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int num = 0;
		    int m = 0;
		    while (n > 0) {
			    int digit = n % 10;
			    num = num + digit * (int) Math.pow(2, m);
			    m++;
			    n = n / 10;
		    }
		    System.out.println(num);
    }
}
