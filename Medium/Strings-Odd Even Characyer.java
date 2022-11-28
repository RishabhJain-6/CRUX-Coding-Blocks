/*
Take as input S, a string. 
Write a function that replaces every even character with the character having just higher ASCII code 
and every odd character with the character having just lower ASCII code. Print the value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abcg
Sample Output
badf
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		System.out.println(oddEvenCharacter(S));
	}

	public static String oddEvenCharacter(String S) {
		String ans = "";
		char c;
		for (int i = 0; i < S.length(); i++) {
			c = S.charAt(i);
			if (i % 2 != 0) {
				c -= 1;
			} else {
				c += 1;
			}
			ans += c;
		}
		return ans;
	}
}
