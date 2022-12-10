/*
You are given two strings a and b of the same length. 
Choose an index and split both strings at the same index, splitting a into two strings: aprefix and asuffix where a = aprefix + asuffix, 
and splitting b into two strings: bprefix and bsuffix where b = bprefix+ bsuffix . 
Check if aprefix+ bsuffix or bprefix+ asuffix forms a palindrome.Return true if it is possible to form a palindrome string, otherwise return false.

Input Format
The first line representing the first string. The second line representing the second string.

Constraints
The length of both the strings is less than 10^5.

Output Format
The boolean result representing that the string can be a palindrome or not.

Sample Input
x
y
Sample Output
true

Explanation
aprefix = "", asuffix = "x"

bprefix = "", bsuffix = "y"

Then, aprefix + bsuffix = "" + "y" = "y", which is a palindrome.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S1 = scn.nextLine();
		String S2 = scn.nextLine();
		System.out.println(canBreak(S1, S2));
	}

	public static boolean canBreak(String S1, String S2) {
		if (isPalindrome(S1) || isPalindrome(S2))
			return true;
		String str;
		int n = Math.min(S1.length(), S2.length());
		for (int i = 1; i < n; i++) {
			str = S1.substring(0, i) + S2.substring(i);
			if (isPalindrome(str))
				return true;

			str = S2.substring(0, i) + S1.substring(i);
			if (isPalindrome(str))
				return true;
		}
		return false;
	}

	public static boolean isPalindrome(String S) {
		int s = 0;
		int e = S.length() - 1;
		while (s < e) {
			if (S.charAt(s) != S.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
