/*
A Good String is a string which contains only vowels (a,e,i,o,u) . 
Given a string S, print a single positive integer N where N is the length of the longest substring of S that is also a Good String.

Note: The time limit for this problem is 1 second, so you need to be clever in how you compute the substrings.

Input Format
A string 'S'

Constraints
Length of string < 10^5

Output Format
A single positive integer N, where N is the length of the longest sub-string of S that is also a Good String.

Sample Input
cbaeicde
Sample Output
3

Explanation
Longest good substring is "aei"
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		System.out.println(lenOfGoodString(S));
	}

	public static int lenOfGoodString(String S) {
		int length = 0;
		int ans = 0;
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				length++;
			} else {
				length = 0;
			}
			ans = Math.max(ans, length);
		}
		return ans;
	}
}
