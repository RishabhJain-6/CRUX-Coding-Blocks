/*
There are N stairs, and a person standing at the bottom wants to reach the top. 
The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top
Note: order does not matter

Input Format
Take input N

Constraints
1 <= N <= 1000000

Output Format
print the number of ways, the person can reach the top

Sample Input
4
Sample Output
3
Explanation
Input: 
N = 4
Output: 
3

Explanation: 
Three ways to reach at 4th stair. They are {1, 1, 1, 1}, {1, 1, 2}, {2, 2}.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(countWays(n));
	}

	public static int countWays(int n) {
		return (n / 2 + 1);
	}
}
