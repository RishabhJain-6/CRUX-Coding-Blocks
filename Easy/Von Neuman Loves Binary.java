/*
Given a binary number ,help Von Neuman to find out its decimal representation. For eg 000111 in binary is 7 in decimal.

Input Format
The first line contains N , the number of binary numbers. Next N lines contain N integers each representing binary represenation of number.

Constraints
N<=1000 Digits in binary representation is <=16.

Output Format
N lines,each containing a decimal equivalent of the binary number.

Sample Input
4
101
1111
00110
111111
Sample Output
5
15
6
63

Explanation
For binary number fedcba , Decimal number = f * 2^5 + e * 2^4 + d * 2^3 + …..+ a * 2^0.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();
	int i = 0;
	while (i < N) {
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
		i++;
	}
    }
}
