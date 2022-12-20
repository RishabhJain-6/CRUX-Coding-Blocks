/*
Take as input str, a string. The string contains a single pair of parenthesis “(..)”. 
Write a recursive function which returns the contents between the parenthesis. E.g. for “xyz(abc)def” return “abc”. Print the value returned.

Input Format
Enter the string

Constraints
None

Output Format
Display the content between the parenthesis

Sample Input
abc(x)
Sample Output
x
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		find(S, "", false, 0);
	}

	public static void find(String S, String inside, boolean t, int i) {
		if (i == S.length()) {
			System.out.println(inside);
			return;
		}

		if (S.charAt(i) == '(') {
			find(S, inside, true, i + 1);
		} else if (S.charAt(i) == ')') {
			find(S, inside, false, i + 1);
			return;
		}

		if (t) {
			char c = S.charAt(i);
			find(S, inside + c, t, i + 1);
		} else {
			find(S, inside, t, i + 1);
		}
	}
}
