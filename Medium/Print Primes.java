/*
Take N as input. Print all prime numbers from 2 to N.

Input Format
Constraints
1 <= N <= 1000

Output Format
Sample Input
10
Sample Output
2
3
5
7

Explanation
Each output should be on separate line. A prime number is that number which is divisible by one or itself.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int num = scn.nextInt();
	int i = 2;
	while (i <= num) {
		int n = i;
		int count = 0;
		int j = 2;
		while (j <= Math.sqrt(n)) {
			int rem = n % j;
			if (rem == 0) {
				count++;
			}
			j++;
		}
		if (count == 0 && n != 1) {
			System.out.println(i);
		}
		i++;
	}            
    }
}
