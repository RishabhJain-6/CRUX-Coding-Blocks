/*
You are provided an integers N. You need to count all possible distinct binary strings of length N such that there are no consecutive 1’s.

Input Format
First line contains integer t which is number of test case. For each test case, it contains an integer n which is the the length of Binary String.

Constraints
1<=t<=100 1<=n<=90

Output Format
Print the number of all possible binary strings.

Sample Input
2
2
3
Sample Output
3
5

Explanation
1st test case : 00, 01, 10 2nd test case : 000, 001, 010, 100, 101
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0) {
            int n = scn.nextInt();
            System.out.println(countStrings(n));
        }
    }

    public static long countStrings(int n)
    {
        // a[i] -> no of binary strings witout consecutive 1's
        // b[i] -> number of such strings which end in 1
        long a[] = new long[n];
        long b[] = new long[n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++)
        {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        return (a[n-1] + b[n-1]);
    }
}
