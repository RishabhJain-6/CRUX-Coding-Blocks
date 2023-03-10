/*
Given a set of "n" non-negative integers, and a value "sum", determine if there is a subset of the given set with sum equal to given sum.

Input Format
1st Line: n sum 2nd Line: a1 a2……an (Array Values)

Constraints
1<= n <= 1000
1<= sum <= 10^5
1<= Ai <=10^4

Output Format
Yes, if sum exist No, it sum does not exist

Sample Input
5 10
1 2 3 4 5
Sample Output
Yes
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        if (subsetSum(arr,n,target))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean subsetSum(int set[], int n, int sum)
    {
        boolean subset[][] = new boolean[sum + 1][n + 1];
 
        for (int i = 0; i <= n; i++)
            subset[0][i] = true;
 
        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;
 
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1])
                    subset[i][j]
                        = subset[i][j]
                          || subset[i - set[j - 1]][j - 1];
            }
        }
        return subset[sum][n];
    }
}
