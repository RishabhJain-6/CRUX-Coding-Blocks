/*
A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors 
obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . 
For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. 
Write a program to check whether a given integer is a Boston number.

Input Format
There will be only one line of input:N , the number which needs to be checked.

Constraints
1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)

Output Format
1 if the number is a Boston number. 0 if the number is a not Boston number.

Sample Input
378
Sample Output
1

Explanation
Self Explanatory
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = sumPrimes(n);
		int s = 0;
		while (n > 0) {
			int digit = n % 10;
			s += digit;
			n /= 10;
		}
		if (s == sum) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public static int sumPrimes(int n) {
		int sum = 0;
		while (n % 2 == 0) {
			n /= 2;
			sum += 2;
		}
		for (int i = 3; i <= n; i += 2) {
			if (n % i == 0) {
				n /= i;
				if (i > 9) {
					sum += sumofDig(i);
				} else {
					sum += i;
				}
				i -= 2;
			}
		}
		if (n > 2) {
			if (n > 9) {
				sum += sumofDig(n);
			} else {
				sum += n;
			}
		}
		return sum;
	}

	public static int sumofDig(int a) {
		int s = 0;
		while (a > 0) {
			int d = a % 10;
			s += d;
			a /= 10;
		}
		return s;
	}
}
