/*
Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, …. z=26. 
Write a recursive function (return type Arraylist) to print all possible codes for the string. 
E.g. for “1123” possible codes are aabc, kbc, alc, aaw, kw.

Input Format
Enter a number

Constraints
None

Output Format
Display all the possible codes

Sample Input
1125
Sample Output
[aabe, aay, ale, kbe, ky]
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> Al = codeString(str);
		System.out.println(Al);
	}

	public static ArrayList<String> codeString(String s) {
		ArrayList<String> Al = new ArrayList<>();
		codeForm(s, "", Al);
		return Al;
	}

	public static void codeForm(String S, String path, ArrayList<String> Al) {
		if (S.length() == 0) {
			Al.add(path);
			return;
		}

		char a = S.charAt(0);
		int n1 = a - '0';
		char c1 = (char) (n1 - 1 + 'a');
		String remain1 = S.substring(1);
		codeForm(remain1, path + c1, Al);

		if (S.length() > 1) {
			String c = S.substring(0, 2);
			int n2 = Integer.parseInt(c);
			if (n2 - 1 < 26) {
				char c2 = (char) (n2 - 1 + 'a');
				String remain2 = S.substring(2);
				codeForm(remain2, path + c2, Al);
			}
		}
	}
}
