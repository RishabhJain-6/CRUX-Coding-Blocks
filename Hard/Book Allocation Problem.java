/*
You are given number of pages in n different books and m students. 
The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. 
The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.

Input Format
First line contains integer t as number of test cases. Next t lines contains two lines. 
For each test case, 1st line contains two integers n and m which represents the number of books and students 
and 2nd line contains n space separated integers which represents the number of pages of n books in ascending order.

Constraints
1 < t < 50
1< n < 100
1< m <= 50
1 <= Ai <= 1000

Output Format
Print the maximum number of pages that can be assigned to students.

Sample Input
1
4 2
12 34 67 90
Sample Output
113 

Explanation
1st students : 12 , 34, 67 (total = 113)
2nd students : 90 (total = 90)
Print max(113, 90)
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scn.nextInt();
			}
			System.out.println(allocateBook(arr, m));
		}
	}

	public static int allocateBook(int[] arr, int m) {
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		int ans = -1;
		int s = 0;
		int e = sum;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (isPossible(arr, m, mid)) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isPossible(int[] arr, int m, int pages) {
		int allocated = 1;
		int pageSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (pageSum + arr[i] <= pages) {
				pageSum += arr[i];
			} else {
				allocated++;
				if (allocated > m || arr[i] > pages) {
					return false;
				}
				pageSum = arr[i];
			}
		}
		return true;
	}
}
