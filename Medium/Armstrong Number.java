/*
Take the following as input.

A number
Write a function which returns true if the number is an armstrong number and false otherwise, where Armstrong number is defined as follows.

A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.

abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….

1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4

371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

Input Format
Single line input containing an integer

Constraints
0 < N < 1000000000

Output Format
Print boolean output for each testcase.
"true" if the given number is an Armstrong Number, else print "false".

Sample Input
371
Sample Output
true

Explanation
Use functions. Write a function to get check if the number is armstrong number or not.
Numbers are armstrong if it is equal to sum of each digit raised to the power of number of digits.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int nod = numOfDigit(num);
		isArmstrong(num, nod);
	}

	public static int numOfDigit(int a) {
		int i = 0;
		while (a > 0) {
			i++;
			a /= 10;
		}
		return i;
	}

	public static void isArmstrong(int num, int n) {
		int a = num;
		int sum = 0;
		while (a > 0) {
			int digit = a % 10;
			sum = sum + (int) Math.pow(digit, n);
			a /= 10;
		}
		if (num == sum) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
