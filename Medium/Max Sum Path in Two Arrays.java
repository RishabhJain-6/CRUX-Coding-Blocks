/*
You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence. 
You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. 
You can switch from one array to another array only at common elements.

Input Format
First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays 
and next two lines contains n and m space separated integers respectively.

Constraints
1<=t<=100 1<=n,m<=100000

Output Format
Print the maximum path.

Sample Input
1
8 8
2 3 7 10 12 15 30 34
1 5 7 8 10 15 16 19
Sample Output
122

Explanation
122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
			for (int j = 0; j < n; j++) {
				arr1[j] = scn.nextInt();
			}
			for (int k = 0; k < m; k++) {
				arr2[k] = scn.nextInt();
			}
			System.out.println(calc(arr1, arr2));
		}
	}

	public static int calc(int arr1[], int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;
		int i = 0;
		int j = 0;
		int result = 0;
		int sum1 = 0;
		int sum2 = 0;
		while (i < n && j < m) {
			if (arr1[i] == arr2[j]) {
				result += Math.max(sum1, sum2) + arr1[i];
				sum1 = sum2 = 0;
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				sum1 += arr1[i];
				i++;
			} else if (arr1[i] > arr2[j]) {
				sum2 += arr2[j];
				j++;
			}
		}
		while (i < n) {
			sum1 += arr1[i];
			i++;
		}
		while (j < m) {
			sum2 += arr2[j];
			j++;
		}
		result += Math.max(sum1, sum2);
		return result;
	}
}
