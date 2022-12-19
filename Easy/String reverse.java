/*
Given a String line. Which may or may not have multiple words.

Reverse the whole string recursively

Input Format
Single line input containing a string

Constraints
Output Format
Print the reversed string

Sample Input
Hey there
Sample Output
ereht yeH
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		System.out.println(reverse(S, 0));
	}

	public static String reverse(String S, int i) {
		if (i >= S.length()) {
			return "";
		}
		return reverse(S, i + 1) + S.charAt(i);
	}
}
