/*
Take digits one by one and make a single number by concatenating them.

Digits are given from Right Most place.

Input Format
First line contains total digits = num. Following lines contains digits starting from the Right Most place.

Constraints
1<=num<=12

0<=digits<=9

Output Format
print the number in a single line

Sample Input
5
8
5
3
1
4
Sample Output
85314

Explanation
Self explanatory
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextInt();
		long num = 0;
		for (int i = 1; i <= n; i++) {
			long digit = scn.nextInt();
			long mult = (long) Math.pow(10, n-i);
			num += digit * mult;
		}
		System.out.print(num);
	}
}
