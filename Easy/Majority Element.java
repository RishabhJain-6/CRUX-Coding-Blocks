/*
Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.

You may assume that the array is non-empty and the majority element always exist in the array.

Input Format
First line contains integer N (size of the array) followed by N more integers.

Constraints
Output Format
Majority Element of array

Sample Input
3
1 1 2
Sample Output
1

Explanation
Number of 1's in the array is more than 3/2 , Hence majority element is 1
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		findMajority3(arr);
	}
  public static void findMajority2(int arr[]) { //Another way
		Arrays.sort(arr);
		System.out.println(arr[arr.length / 2]);
	}
    public static void findMajority3(int arr[]) {
		int majority = arr[0];
		int frequency = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == majority) {
				frequency++;
			} else {
				frequency--;
			}
			if (frequency == 0) {
				majority = arr[i];
				frequency++;
			}
		}
		System.out.println(majority);
	}
}
