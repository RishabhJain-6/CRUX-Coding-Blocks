/*
Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000.

Output Format
Character

Sample Input
aaabacb
Sample Output
a

Explanation
For the given input string, a appear 4 times. Hence, it is the most frequent character.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		System.out.println(maxFrequencyChar(S));
	}

	public static char maxFrequencyChar(String S) {
		char res = 'a';
		int[] arr = new int[26];
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			int j = ch % res;
			arr[j]++;
		}
		int max_idx = 0;
		int maxm = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxm < arr[i]) {
				maxm = arr[i];
				max_idx = i;
			}
		}
		res += max_idx;
		return res;
	}
}
