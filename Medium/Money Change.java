/*
Given a big amount N and the array of denominations S. Assuming infinite supply of each of S = {S1,S2….Sm} denominations, 
find the number of ways to make change for N cents.

Input Format
First line contains an integer T denoting the total number of test cases.
For every test case, there are three lines.
First line will contain an integer 'M' denoting the size of array.
The second line contains M space-separated integers A1, A2, …, Am denoting the elements of the array.
The third line contains an integer 'N' denoting the cents.

Constraints
1 <= T <= 10 1 <= n <= 500 1 <= S[i] <= 1000 1 <= N <= 1000000

Output Format
Print number of possible ways to make change for N cents in a new line. Since answers can be large, print answer % (1000000000 + 7).

Sample Input
2
3
1 2 3
4
4
2 5 3 6
10
Sample Output
4
5

Explanation
For N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4. 
For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.
*/

import java.util.*;
public class Main {
    static int mod = 1000000000+7;
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0) {
            int m = scn.nextInt();
            int[] coins = new int[m];
            for (int i=0;i<m;i++)
                coins[i] = scn.nextInt();
            int n = scn.nextInt();
            System.out.println(countWays(coins, n));
        }
    }
    public static int countWays(int[] coins, int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i=0;i<coins.length;i++) {
            for (int j=coins[i];j<=n;j++) {
                dp[j] = (dp[j] + dp[j-coins[i]]) % mod;
            }
        }
        return dp[n];
    }
}
