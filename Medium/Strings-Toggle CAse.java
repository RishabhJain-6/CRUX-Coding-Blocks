/*
Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abC
Sample Output
ABc

Explanation
Toggle Case means to change UpperCase character to LowerCase character and vice-versa.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		System.out.println(toggleCase2(S));
	}

	public static String toggleCase1(String S) {
		String ans = "";
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (ch == Character.toUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else {
				ch = Character.toUpperCase(ch);
			}
			ans += ch;
		}
		return ans;
	}

	public static String toggleCase2(String S) {
		String ans = "";
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			ch = (char) (ch ^ 32);
			ans += ch;
		}
		return ans;
	}
}
