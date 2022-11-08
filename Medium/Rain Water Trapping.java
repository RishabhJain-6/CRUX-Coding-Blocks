/*
You are given an input array whose each element represents the height of a line towers. 
The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. 
You need to find how much water filled between these given towers.

Input Format
The first line consists of number of test cases T. Each test case consists an integer N as number of towers and next line contains the N space separated integers.

Constraints
1 <= N <= 1000000 1 <= t <= 10 0 <= A[i] <= 10000000

Output Format
Print how much unit of water collected among towers for each test case.

Sample Input
2
6
3  0  0  2  0  4
12
0  1  0  2  1  0  1  3  2  1  2  1
Sample Output
10
6
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int j = 0; j < t; j++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			System.out.println(totalRainWater1(arr));
		}
	}

	public static int totalRainWater1(int[] arr) {
		int n = arr.length;
		int[] max_right = new int[n];
		int[] max_left = new int[n];
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			max_left[i] = max;
		}
		max = arr[n - 1];
		for (int i = n - 1; i >= 0; i--) {
			if (max < arr[i]) {
				max = arr[i];
			}
			max_right[i] = max;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (max_left[i] < max_right[i]) {
				max_right[i] = max_left[i];
			}
			max_right[i] = Math.abs(arr[i] - max_right[i]);
			sum = sum + max_right[i];
		}
		return sum;
	}
  	public static void totalRainWater2(int[] arr) { //Another Way
		int n = arr.length;
		int[] max_right_wall = new int[n];
		int max = 0;
		for (int i = n - 1; i >= 0; i--) {
			max_right_wall[i] = max;
			max = Math.max(max, arr[i]);
		}
		int max_left_wall = 0;
		int result = 0;
		for (int i = 0; i < n; i++) {
			int a = Math.min(max_left_wall, max_right_wall[i]);
			int pani = Math.max(0, a - arr[i]);
			result += pani;
			max_left_wall = Math.max(max_left_wall, arr[i]);
		}
		System.out.println(result);
	}
}
