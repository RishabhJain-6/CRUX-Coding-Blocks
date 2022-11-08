/*
Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

Input Format

Constraints
2 < N <= 1000000000

Output Format

Sample Input
3
Sample Output
Prime

Explanation
The output is case specific
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int count = 0;
	int i = 2;
	while (i <= Math.sqrt(n)) {
		int rem = n % i;
		if (rem == 0) {
			count++;
		}
		i++;
	}
	if (count == 0 && n != 1) {
		System.out.println("Prime");
	} else {
		System.out.println("Not Prime");
	}
    }
}
