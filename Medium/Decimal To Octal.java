/*
Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
63
Sample Output
77

Explanation
Both input and output are integers
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = convert(n);
		System.out.println(ans);
	}

	public static int convert(int num) {
		if (num < 8) {
			return num;
		}
		int i = 0;
		int oct = 0;
		while (num > 0) {
			int rem = num % 8;
			int mult = (int) Math.pow(10, i);
			oct += rem * mult;
			i++;
			num /= 8;
		}
		return oct;
	}
}
