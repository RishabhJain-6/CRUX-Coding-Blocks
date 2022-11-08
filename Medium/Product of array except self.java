/*
Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of arr except arr[i].

Input Format
First line contains integer N as size of array.
Next line contains a N integer as element of array.

Constraints
arr[i]<=10000000

Output Format
print output array

Sample Input
4
1 2 3 4
Sample Output
24 12 8 6 
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long[] arr = new long[n];
		long prod = 1;
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextLong();
			prod = prod * arr[i];
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[i] = prod / arr[i];
			}
			System.out.print(arr[i] + " ");
		}
	}
}
