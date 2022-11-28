/*
Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000

Output Format
String

Sample Input
aabccba
Sample Output
abcba

Explanation
For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2.
After removing all of the consecutive occurences, the Final ans will be : - "abcba".
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		System.out.println(removeDuplicates(S));
	}

	public static String removeDuplicates(String S) {
		if (S.length() < 2) {
			return S;
		}
		String ans = "";
		char curr = S.charAt(0);
		char next;
		for (int i = 1; i < S.length(); i++) {
			next = S.charAt(i);
			if (i == S.length() - 1 || curr != next) {
				ans += curr;
				if (i == S.length() - 1 && curr != next) {
					ans += next;
				}
				curr = next;
			}
		}
		return ans;
	}
}
