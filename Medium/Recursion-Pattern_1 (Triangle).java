/*
Take as input N, a number. Print the following pattern. Can you do it recursively ?!

Hint : Bigger Problem? Smaller Problem ? wrt pattern

(for N =4)

*

* *

* * *

* * * *

* * * * *

Input Format
Enter the value of N

Constraints
None

Output Format
Tab separated (*)

Sample Input
5
Sample Output
*
*	*
*	*	*
*	*	*	*
*	*	*	*	*

*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		trianglePattern(n, 1);
	}

	public static void trianglePattern(int n, int i) {
		if (i > n) {
			return;
		}
		for (int j = 0; j < i; j++) {
			System.out.print("*\t");
		}
		System.out.println();
		trianglePattern(n, i + 1);
	}
}
