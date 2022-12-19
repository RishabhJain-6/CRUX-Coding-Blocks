/*
Take as input str, a string. We are concerned with all the possible ascii-subsequences of str. 
E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”

a. Write a recursive function which returns the count of ascii-subsequences for a given string. Print the value returned.

b. Write a recursive function which prints all possible ascii-subsequences for a given string (void is the return type for function).

Input Format
Enter the string

Constraints
None

Output Format
Display the number of ASCII-subsequences and display all the ASCII- subsequences

Sample Input
ab
Sample Output
 b 98 a ab a98 97 97b 9798
9
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.next();
		System.out.println("\n" + subsequences(S, ""));
	}

	public static int subsequences(String S, String path) {
		if (S.length() == 0) {
			System.out.print(path + " ");
			return 1;
		}
		int count = 0;
		char coming = S.charAt(0);
		String remain = S.substring(1);
		count += subsequences(remain, path);
		count += subsequences(remain, path + coming);
		count += subsequences(remain, path + (int) coming);
		return count;
	}
}
