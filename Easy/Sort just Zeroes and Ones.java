/*
Sort just 0 and 1

Input Format
A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space

Constraints
N will not exceed 10^7

Output Format
Sorted Sequence

Sample Input
7
1 0 0 1 1 0 1
Sample Output
0 0 0 1 1 1 1
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
		sort(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			if (arr[s] == 0) {
				s++;
			} else if (arr[e] == 1) {
				e--;
			} else if (arr[e] == 0) {
				int temp = arr[s];
				arr[s] = 0;
				arr[e] = temp;
				s++;
			} else {
				int temp = arr[e];
				arr[e] = 1;
				arr[s] = temp;
				e--;
			}
		}
	}
}
