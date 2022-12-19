/*
Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.

a. Write a recursive function which returns the count of subsequences for a given string. Print the value returned.

b. Write a recursive function which prints all possible subsequences for a “abcd” has following subsequences 
“”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.given string (void is the return type for function).
Note: Use cin for input for C++

Input Format
Enter a string

Constraints
None

Output Format
Print all the subsequences in a space separated manner and isplay the total no. of subsequences.

Sample Input
abcd
Sample Output
 d c cd b bd bc bcd a ad ac acd ab abd abc abcd 
16

Explanation
Print all possible subsequences of the given string.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.next();
		System.out.print("\n"+subsequences(S, ""));
	}

	public static int subsequences(String S, String path) {
		if (S.length() == 0) {
			System.out.print(path + " ");
			return 1;
		}
		int count = 0;
		String coming = S.substring(0, 1);
		String remain = S.substring(1);
		count += subsequences(remain, path);
		count += subsequences(remain, path + coming);
		return count;
	}
}
