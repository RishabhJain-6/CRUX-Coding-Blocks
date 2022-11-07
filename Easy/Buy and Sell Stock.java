/*
Consider an array for which on day i, ith element is the price of a given stock.
we are permitted at most only one transaction(i.e buy one and sell one share of stock).Find the maximum profit.

Note:Buying a stock is mandatory before selling.

Input Format
First line contains integer n as size of array. Next n lines contains n integer as element of array.

Constraints
None

Output Format
Print the maximum profit.

Sample Input
6
7
1
5 
3 
6 
4
Sample Output
5

Explanation
None
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(bsStock2(arr));
	}
    public static int bsStock2(int[] arr) {
		int min = arr[0];
		int max_profit = 0;
		for (int i = 0; i < arr.length; i++) {
			int profit = arr[i] - min;
			max_profit = Math.max(max_profit, profit);
			min = Math.min(min, arr[i]);
		}
		return max_profit;
	}
}
