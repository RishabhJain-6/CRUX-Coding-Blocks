/*
Take as input N, a number. Take N more inputs to form an array. Reorder items of array in such a manner that all 0’s are moved to end. Target complexity is O(n)

Input Format
Take as input N, a number. Take N more inputs to form an array

Constraints
None

Output Format
Display the array containing all the zeros at the end , the numbers should be separated by a space

Sample Input
5
0
0
0
0
1
Sample Output
1 0 0 0 0 
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
		zerosAtEnd(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void zerosAtEnd(int arr[]) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			if (arr[e] == 0) {
				e--;
			} else if (arr[s] == 0) {
				arr[s] = arr[e];
				arr[e] = 0;
				e--;
			} else {
				s++;
			}
		}
	}
}
