/*
Take as input S, a string. 
Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.

Input Format
A single String S.

Constraints
A string of length between 1 to 1000

Output Format
The compressed String.

Sample Input
aaabbccds
Sample Output
a3b2c2ds

Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 
'b' is repeated twice, 'c' is repeated twice. But, 'd' and 's' occurred only once that's why we do not write their occurrence.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		System.out.println(compress(S));
	}

	public static String compress(String S) {
		if (S.length() < 2) {
			return S;
		}
		String ans = "";
		char curr = S.charAt(0);
		char next;
		int count = 1;
		for (int i = 1; i < S.length(); i++) {
			next = S.charAt(i);
			if (curr == next) {
				count++;
			}
			if (i == S.length() - 1 || curr != next) {
				ans += curr;
				if (count != 1) {
					ans += count;
				}
				if (i == S.length() - 1 && curr != next) {
					ans += next;
				}
				curr = next;
				count = 1;
			}
		}
		return ans;
	}
}
