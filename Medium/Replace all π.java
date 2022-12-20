/*
Replace all occurrences of pi with 3.14

Input Format
Integer N, no of lines with one string per line

Constraints
0 < N < 1000
0 <= len(str) < 1000

Output Format
Output result one per line

Sample Input
3
xpix
xabpixx3.15x
xpipippixx
Sample Output
x3.14x
xab3.14xx3.15x
x3.143.14p3.14xx

Explanation
All occurrences of pi have been replaced with "3.14".
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int j = 0; j <= n; j++) {
			String S = scn.nextLine();
			replace(S, "", 0);
		}
	}

	public static void replace(String S, String path, int i) {
		if (i == S.length()) {
			System.out.println(path);
			return;
		}
		char ch = S.charAt(i);
		if (ch == 'p') {
			if (i < S.length() - 1 && S.charAt(i + 1) == 'i') {
				replace(S, path + 3.14, i + 2);
			} else {
				replace(S, path + ch, i + 1);
			}
		} else {
			replace(S, path + ch, i + 1);
		}
	}
}
