/*
You are given N elements, a1,a2,a3….aN. Find the number of good sub-arrays.
A good sub-array is a sub-array [ai,ai+1,ai+2….aj] such that (ai+ai+1+ai+2+….+aj) is divisible by N.



Input Format
The first line contains the number of test cases T. First line of each test case contains an integer N denoting the number of elements. 
Second line of each test case contains N integers, a1, a2, a3….aN, where ai denotes the ith element of the array.

Constraints
1<=T<=10
1<=N<=10^5
|ai|<=10^9

Output Format
Output a single integer denoting the number of good sub-arrays.

Sample Input
2
5
1 1 1 1 1
5
5 5 5 5 5
Sample Output
1
15

Explanation
In first test case, there is only one sub-array [1, 1, 1, 1, 1], such that 1+1+1+1+1=5, which is divisible by N=5
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scn.nextInt();
			}
			System.out.println(divisibleSubArrays3(arr));
		}
	}

	public static long divisibleSubArrays3(int[] arr) {
		int n = arr.length;
		long[] mod = new long[n];
		mod[0]++;
		long ans = 0;
		long sum = 0;
		for (int i : arr) {
			sum = (sum + i) % n;
			if (sum < 0) {
				sum += n;
			}
			ans += mod[(int) sum];
			mod[(int) sum]++;
		}
		return ans;
	}
}
