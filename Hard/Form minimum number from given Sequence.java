/*
Given an array of patterns containing only I’s and D’s. I for increasing and D for decreasing. 
Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.

Input Format
The First Line contains an Integer N, size of the array. Next Line contains N Strings separated by space.

Constraints
1 ≤ T ≤ 100 1 ≤ Length of String ≤ 8

Output Format
Print the minimum number for each String separated by a new Line.

Sample Input
4
D I DD II
Sample Output
21
12
321 
123

Explanation
For the Given sample case, For a Pattern of 'D' print a decreasing sequence which is 2 1.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.next();
		}
		for (int i = 0; i < arr.length; i++) {
			printMinNumberForPattern(arr[i]);
		}
	}

	public static void printMinNumberForPattern(String arr) {
		int curr_max = 0;
		int last_entry = 0;

		int j;
		for (int i = 0; i < arr.length(); i++) {
			int noOfNextD = 0;
			if (arr.charAt(i) == 'I') {
				j = i + 1;
				while (j < arr.length() && arr.charAt(j) == 'D') {
					noOfNextD++;
					j++;
				}

				if (i == 0) {
					curr_max = noOfNextD + 2;
					System.out.print(++last_entry);
					System.out.print(curr_max);
					last_entry = curr_max;
				} else {
					curr_max = curr_max + noOfNextD + 1;
					last_entry = curr_max;
					System.out.print(last_entry);
				}

				for (int k = 0; k < noOfNextD; k++) {
					System.out.print(--last_entry);
					i++;
				}
			} else {
				if (i == 0) {
					j = i + 1;
					while (j < arr.length() && arr.charAt(j) == 'D') {
						noOfNextD++;
						j++;
					}

					curr_max = noOfNextD + 2;

					System.out.print(curr_max);
					System.out.print(curr_max - 1);

					last_entry = curr_max - 1;
				} else {
					System.out.print(last_entry - 1);
					last_entry--;
				}
			}
		}
		System.out.println();
	}
}
