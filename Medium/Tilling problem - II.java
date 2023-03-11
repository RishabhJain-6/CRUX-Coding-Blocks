/*
Given a floor of size n x m. Find the number of ways to tile the floor with tiles of size 1 x m . A tile can either be placed horizontally or vertically.

Input Format
First line of input contains an integer T denoting the number of test cases. Then T test cases follow.
The first line of each test case contains two integers N and M.

Constraints
1 <= T<= 1000
1 <= N,M <= 100000

Output Format
Print answer for every test case in a new line modulo 10^9+7.

Sample Input
2
2 3
4 4
Sample Output
1
2
*/

import java.util.*;
public class Main {
    static int mod = 1000000000+7;
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            System.out.println(tilingWays(n,m));
        }
    }
    public static int tilingWays(int n, int m) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i=1;i<=n;i++) {
            if (i<m)
                dp[i] = 1;
            else
                dp[i] = (dp[i-1]+dp[i-m])%mod;
        }
        return dp[n];
    }
}
