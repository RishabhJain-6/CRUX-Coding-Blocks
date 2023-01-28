/*
Take as input str, a string. Write a recursive function that checks if the string was generated using the following rules and returns a Boolean value:
1. the string begins with an 'a'
2. each 'a' is followed by nothing or an 'a' or "bb"
3. each "bb" is followed by nothing or an 'a' Print the value returned.

Input Format
Enter the String

Constraints
None

Output Format
Display the boolean result

Sample Input
abba
Sample Output
true
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(check(str, 0, 'a'));
	}

	public static boolean check(String S, int idx, char last) {
		if (idx == S.length())
			return true;
		if (idx == 0 && S.charAt(idx) == 'a')
			return check(S, idx + 1, 'a');
		if ((idx+1)!=S.length() && S.charAt(idx) == 'b' && S.charAt(idx + 1) == 'b' && last == 'a')
			return check(S, idx + 2, 'b');
		if (last == 'b' && S.charAt(idx) == 'a')
			return check(S, idx + 1, 'a');
		if (last == 'a' && S.charAt(idx) == 'a')
			return check(S, idx + 1, 'a');
		return false;
	}
}
