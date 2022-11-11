/*
Given an array having n elements representing balls of various colours like red, white or blue, 
sort them in-place so that balls of the same colour are adjacent, with the colours in the order red, white and blue.
To represent the colour red, white, and blue we will use the integers 0, 1, and 2 respectively.
Note:You are not suppose to use the sort function for this problem.

Input Format
First line contains integer n as size of array. Next n lines contains a single integer as element of array.

Constraints
None

Output Format
Print the balls in order so that balls of same colour are adjacent.

Sample Input
6
2 0 2 1 1 0
Sample Output
0 0 1 1 2 2 
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
		int m = s;
		int e = arr.length - 1;
		while (m <= e) {
			if (arr[m] == 0) {
				int temp = arr[s];
				arr[s] = arr[m];
				arr[m] = temp;
				s++;
				m++;
			} else if (arr[m] == 1) {
				m++;
			} else {
				int temp = arr[e];
				arr[e] = arr[m];
				arr[m] = temp;
				e--;
			}
		}
	}
}
