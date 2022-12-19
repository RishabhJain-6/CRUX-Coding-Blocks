/*
Take an input str, a string. 
Write a recursive function which returns a new string in which all duplicate consecutive characters are separated by a ‘ * ’. E.g. for “hello” return “hel*lo”. 
Print the value returned

Input Format
Enter a String

Constraints
1<= Length of string <= 10^4

Output Format
Display the resulting string (i.e after inserting (*) b/w all the duplicate characters)

Sample Input
hello
Sample Output
hel*lo

Explanation
We insert a "*" between the two consecutive 'l' .
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.next();
		System.out.println(format(S, 0));
	}

	public static String format(String S, int i) {
		if (i >= S.length()) {
			return "";
		}
		char c = S.charAt(i);
		if (i < S.length() - 1 && S.charAt(i + 1) == c) {
			return c + "*" + format(S, i + 1);
		} else {
			return c + format(S, i + 1);
		}
	}
}
