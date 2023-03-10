/*
Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, 
In how many ways can we make the change? The order of coins doesn’t matter.

Input Format
First line of input contain two space separated integers N and M. Second line of input contains M space separated integers - value of coins.

Constraints
1<=N<=250 1<=m<=50 1 <= Si <= 50

Output Format
Output a single integer denoting the number of ways to make the given change using given coin denominations.

Sample Input
10 4
2 5 3 6
Sample Output
5

Explanation
2 2 2 2 2
2 2 3 3
2 2 6
2 3 5
5 5

Total 5 ways
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        System.out.println(coinChange(arr,0,target,new Integer[n][target+1]));
    }

    public static int coinChange(int[] nums,int idx,int target,Integer[][] dp) {
        if (target==0)
            return 1;
        if (idx==nums.length || target<0)
            return 0;

        if (dp[idx][target]!=null)
            return dp[idx][target];
        int sp1 = coinChange(nums,idx,target-nums[idx],dp);
        int sp2 = coinChange(nums,idx+1,target,dp);
        dp[idx][target] = sp1+sp2;
        return sp1+sp2;
    }
}
