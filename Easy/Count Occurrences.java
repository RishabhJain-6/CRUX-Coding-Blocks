/*
Write a program that counts the number of occurrence of a character C in a string S.

Input Format
The first line contains a string S.
The second line contains a character C.

Constraints
Output Format
Display a single line output containing no. of occurrences.

Sample Input
This is a test string
i
Sample Output
3
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		char C = scn.next().charAt(0);
		countOccurrences(S, C, 0, 0);
	}

	public static void countOccurrences(String S, char C, int count, int i) {
		if (i == S.length()) {
			System.out.println(count);
			return;
		}
		if (S.charAt(i) == C) {
			countOccurrences(S, C, count + 1, i + 1);
		} else {
			countOccurrences(S, C, count, i + 1);
		}
	}
}
