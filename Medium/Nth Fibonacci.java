/*
Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

Input Format

Constraints
0 <= N <= 1000

Output Format

Sample Input
10
Sample Output
55

Explanation
The 0th fibonnaci is 0 and 1st fibonnaci is 1.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int i=1;
	int a = 0;
	int b = 1;
	while (i<=n) {
		int c = a + b;
		a = b;
		b = c;
		i++;
	}
	System.out.println(a);
    }
}
