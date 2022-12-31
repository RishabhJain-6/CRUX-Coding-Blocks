/*
Take as input str, a number in form of a string. 
Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.

Input Format
Enter a number in form of a String

Constraints
1 <= Length of String <= 10

Output Format
Print the number after converting it into integer

Sample Input
1234
Sample Output
1234

Explanation
Convert the string to int. Do not use any inbuilt functions.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		convert(S, 0);
	}

	public static void convert(String S, int i) {
		if (S.length() == 0) {
			System.out.println(i);
			return;
		}

		char c = S.charAt(0);
		int a = c - '0';
		String remain = S.substring(1);
		convert(remain, i * 10 + a);
	}
}
