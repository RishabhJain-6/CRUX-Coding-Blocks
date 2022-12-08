/*
One of the important aspect of object oriented programming is readability of the code. 
To enhance the readability of code, developers write function and variable names in Camel Case. 
You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.

Input Format
A single line contains the string.

Constraints
|S|<=1000

Output Format
Print words present in the string, in the order in which it appears in the string.

Sample Input
IAmACompetitiveProgrammer
Sample Output
I
Am
A
Competitive
Programmer

Explanation
There are 5 words in the string.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		canRead(S);
	}

	public static void canRead(String S) {
		String str = "";
		for (int i = 0; i <= S.length(); i++) {
			if (i == S.length()) {
				System.out.println(str);
				return;
			}
			char ch = S.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				if (str.length() != 0) {
					System.out.println(str);
				}
				str = "";
				str += ch;
			} else {
				str += ch;
			}
		}
	}
}
