/*
Print all the subsequences of a string in lexicographical order.

Input Format
First line contains an integer N, the no of strings.
Next, N lines follows one string per line.

Constraints
1 < len(str) < 20

Output Format
No of subsequences one per line

Sample Input
1  
ab
Sample Output
  
a  
ab  
b  

Explanation
4 subsequences are printed.
Empty string is a subsequence.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			String s = scn.next();
			print(s);
		}
	}

	public static void print(String s) {
		ArrayList<String> Al = new ArrayList<>();
		subsequence(s, "", Al);
		Collections.sort(Al);
		for (String a : Al)
			System.out.println(a);
	}

	public static void subsequence(String s, String path, ArrayList<String> Al) {
		if (s.length() == 0) {
			Al.add(path);
			return;
		}

		char piece = s.charAt(0);
		String remain = s.substring(1);
		subsequence(remain, path + piece, Al);
		subsequence(remain, path, Al);
	}
}
