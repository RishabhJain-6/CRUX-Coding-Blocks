/*
Now Lakshya bhaiya want to apply make up on the previous prime factorization question. He only wants to know unique prime factors.

Help him factorize the number while only printing unique prime factors

Input Format
Take an input number num.

Constraints
n<=1,000,000

Output Format
Print its Unique prime factors in a single line

Sample Input
252
Sample Output
2 5 7

Explanation
2 * 2 * 3 * 3 * 7 = 252
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && isPrime(i)) {
				System.out.print(i + " ");
				n /= i;
			}
		}
	}

	public static boolean isPrime(int x) {
		int count = 0;
		int i = 2;
		while (i <= Math.sqrt(x)) {
			int rem = x % i;
			if (rem == 0) {
				count++;
			}
			i++;
		}
		if (count == 0 && x != 1) {
			return true;
		} else {
			return false;
		}
	}
}
