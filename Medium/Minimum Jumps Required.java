/*
You are provided an array of integers where each element represents the max number of steps you can take to move ahead. You need to check that how many minimum 
steps required to reach at the end of the array.

Hint - If N==0 you can never move forward, your return INT_MAX (Infinity).

Input Format
First line contains integer t which is number of test case. For each test case, it contains an integers n which the size of array A[]. 
Next line contains n space separated integers.

Constraints
1<=t<=50
1<=n<=1000
0<=A[i]<=100

Output Format
Print the minimum number of jumps.

Sample Input
1
11
1 3 5 8 9 2 6 7 6 8 9
Sample Output
3

Explanation
1-> 3 (you can pick 5 or 8 or 9 , pick either 8 or 9) -> 8 -> 9
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++)
                arr[i]=scn.nextInt();
            System.out.println(minSteps(arr,0,n-1,new Integer[n+1]));
        }
    }

    public static int minSteps(int arr[], int l, int h,Integer[] dp) {
        if (h == l)
            return 0;
 
        if (arr[l] == 0)
            return Integer.MAX_VALUE;
        if (dp[l]!=null)
            return dp[l];

        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
            int jumps = minSteps(arr, i, h,dp);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        dp[l]=min;
        return min;
    }
}
