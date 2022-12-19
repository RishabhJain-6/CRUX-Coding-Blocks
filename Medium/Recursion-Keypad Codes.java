/*
Take as input str, a string. str represents keys pressed on a nokia phone keypad. 
We are concerned with all possible words that can be written with the pressed keys.

Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz

E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”

a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.

b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).

Input Format
Single line input containing a single integer.

Constraints
1 <= Length of string <= 10^3

Output Format
Print all the words in a space separated manner. Also print the count of these numbers in next line.

Sample Input
12
Sample Output
ad ae af bd be bf cd ce cf
9

Explanation
1 can correspond to 'a' , 'b' or 'c' .
2 can correspond to 'd', 'e' or 'f'.
We print all combinations of these
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = scn.next();
		System.out.print("\n" + keypadCode(S, ""));
	}

	public static int keypadCode(String S, String path) {
		if (S.length() == 0) {
			System.out.print(path + " ");
			return 1;
		}
		int count = 0;
		char c = S.charAt(0);
		String remain = S.substring(1);
		if (c == '1') {
			count += keypadCode(remain, path + 'a');
			count += keypadCode(remain, path + 'b');
			count += keypadCode(remain, path + 'c');
		}
		if (c == '2') {
			count += keypadCode(remain, path + 'd');
			count += keypadCode(remain, path + 'e');
			count += keypadCode(remain, path + 'f');
		}
		if (c == '3') {
			count += keypadCode(remain, path + 'g');
			count += keypadCode(remain, path + 'h');
			count += keypadCode(remain, path + 'i');
		}
		if (c == '4') {
			count += keypadCode(remain, path + 'j');
			count += keypadCode(remain, path + 'k');
			count += keypadCode(remain, path + 'l');
		}
		if (c == '5') {
			count += keypadCode(remain, path + 'm');
			count += keypadCode(remain, path + 'n');
			count += keypadCode(remain, path + 'o');
		}
		if (c == '6') {
			count += keypadCode(remain, path + 'p');
			count += keypadCode(remain, path + 'q');
			count += keypadCode(remain, path + 'r');
			count += keypadCode(remain, path + 's');
		}
		if (c == '7') {
			count += keypadCode(remain, path + 't');
			count += keypadCode(remain, path + 'u');
			count += keypadCode(remain, path + 'v');
		}
		if (c == '8') {
			count += keypadCode(remain, path + 'w');
			count += keypadCode(remain, path + 'x');
		}
		if (c == '9') {
			count += keypadCode(remain, path + 'y');
			count += keypadCode(remain, path + 'z');
		}
		return count;
	}
}
