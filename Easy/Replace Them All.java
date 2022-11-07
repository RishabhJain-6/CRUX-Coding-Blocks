/*
Given a integer as a input and replace all the '0' with '5' in the integer

Input Format
Enter an integer n

Constraints
0<=n<=1000000000000

Output Format
All zeroes are replaced with 5

Sample Input
102
Sample Output
152

Explanation
Check each digit , if it is nonzero, then no change required but if it is zero then replace it by 5.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		long multiplier = 1;
		long rev = 0;
		while (num != 0) {
			long digit = num % 10;
			if (digit == 0) {
				digit = 5;
			}
			rev = rev + digit * multiplier;
			multiplier = multiplier * 10;
			num = num / 10;
		}
		if (rev == 0) {
			rev = 5;
		} 
		System.out.println(rev);
    }
}
