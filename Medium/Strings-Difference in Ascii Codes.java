/*
Take as input S, a string. 
Write a program that inserts between each pair of characters the difference between their ascii codes and print the ans.

Input Format
String

Constraints
Length of String should be between 2 to 1000.

Output Format
String

Sample Input
acb
Sample Output
a2c-1b
Explanation
For the sample case, the Ascii code of a=97 and c=99 ,the difference between c and a is 2.Similarly ,the Ascii code of b=98 and c=99 and their difference is -1. 
So the ans is a2c-1b.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		System.out.println(diffInASCIICodes(S));
	}

	public static String diffInASCIICodes(String S) {
		String ans = "";
		char c1;
		char c2;
		for (int i = 0; i < S.length() - 1; i++) {
			c1 = S.charAt(i);
			c2 = S.charAt(i + 1);
			int a = c2 - c1;
			ans += c1;
			ans += a;
			if (i == S.length() - 2) {
				ans += c2;
			}
		}
		return ans;
	}
}
