/*
Take as input str, a string. Write a recursive function which prints all the words possible by rearranging the characters of this string which are 
in dictionary order larger than the given string.
The output strings must be lexicographically sorted.

Input Format
Single line input containing a string

Constraints
Length of string <= 10

All characters are unique

Output Format
Display all the words which are in dictionary order larger than the string entered in a new line each. The output strings must be sorted.

Sample Input
cab

Sample Output
cba
Explanation
The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only one of them is lexicographically greater than "cab". 
We only print "cba".
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> res = new ArrayList<>();
		printWords(str, "", res);
		Collections.sort(res);
		for (String s : res) {
			if (s.compareTo(str) > 0) {
				System.out.println(s);
			}
		}
	}

	public static void printWords(String ques, String ans, ArrayList<String> res) {
		if (ques.length() == 0) {
			res.add(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			printWords(ros, ans + ch, res);
		}
	}
}
