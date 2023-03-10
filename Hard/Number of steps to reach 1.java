/*
Given a positive number N your task is to bring this number to 1 by performing only a set of operations. 
The operations can be either dividing the number by 2 only if the number is even or you can add or subtract 1 only if the number is odd.
More Precisely:
1) N=N/2 (if N is even)
2)N=N+1/ N=N-1 (if N is odd)
Your task is to minimize these number of operations.

Input Format
A single positive integer N

Constraints
n<=100000

Output Format
Print on a single line the minimum number of steps needed to reach 1 by performing the given operations.

Sample Input
8
Sample Output
3

Explanation
8->4->2->1
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(stepsToOne(n));
    }

    public static int stepsToOne(int n) {
        if (n==1)
            return 0;
        
        if (n<1) {
            return Integer.MAX_VALUE;
        }
        
        if (n%2==0) {
            return stepsToOne(n/2) + 1;
        }
        else {
            int sp1 = stepsToOne(n+1);
            int sp2 = stepsToOne(n-1);
            return Math.min(sp1,sp2) + 1;
        }
    }
}
