/*
You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. 
In how many distinct ways can you climb to the top?

Input Format
Single line contains integer n.

Constraints
1<=n<=40

Output Format
Return the number of ways to climb the top.

Sample Input
2
Sample Output
2

Explanation
Testcase 1: There are two ways to reach the top;
i) 1 step + 1 step
ii) 2 step
N=3
Testcase 2: There are three ways to reach the top i) 1 step+1 step+ 1 step
ii) 2 step+ 1 step
iii) 1 step+ 2 step
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(climb(n));
	}

	public static int climb(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		int sp1 = climb(n - 1);
		int sp2 = climb(n - 2);
		return sp1 + sp2;
	}
}
