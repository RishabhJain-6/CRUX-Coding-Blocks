/*
Given an input string s, reverse the order of the words.

Input Format
A line containing multiple words

Constraints
The length of string <= 10^4

Output Format
The line in reversed order

Sample Input
the sky is blue
Sample Output
blue is sky the

Explanation
Reverse the string by reversing order of the words.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
        while (S.charAt(0) == ' ') {
			S = S.substring(1);
		}
		while (S.charAt(S.length() - 1) == ' ') {
			S = S.substring(0, S.length() - 1);
		}
		System.out.println(reverse(S, ""));
	}

	public static String reverse(String S, String path) {
		if (S.length() == 0) {
			return path;
		}

		int a = S.lastIndexOf(' ');
		String remain;
		String add;
		if (a == -1) {
			remain = "";
			add = S;
			return reverse(remain, path + add);
		} else {
			remain = S.substring(0, a);
			add = S.substring(a + 1);
			return reverse(remain, path + add + " ");
		}
	}
	
	public static String reverseWords(String s) {  //Another solution
		int n = s.length();
		StringBuilder ans = new StringBuilder("");
		StringBuilder temp = new StringBuilder("");

		for (int i = n - 1; i >= 0; i--) {
			char ch = s.charAt(i);

			if (ch != ' ')
				temp.append(ch);

			if ((ch == ' ' || i == 0) && temp.length() > 0) {
				if (ans.length() > 0)
					ans.append(" ");
				temp.reverse();
				ans.append(temp);
				temp.setLength(0);
			}
		}

		return ans.toString();
	}
}
