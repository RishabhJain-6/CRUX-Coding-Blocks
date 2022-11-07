/*
Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that reverses the array. Print the values in reversed array.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.Reverse the elements in the Array.
4.Print the reversed Array.

Input Format
First-line contains a single integer n denoting the size of the array.
Next, N line contains a single integer denoting the elements of the array.

Constraints
N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000.

Output Format
Print the elements of the reversed array

Sample Input
5
0
4 
6 
8 
9
Sample Output
9 
8 
6 
4 
0 

Explanation
In the sample case , arr=[0,4,6,8,9] is reversed to arr=[9,8,6,4,0].
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
		int e = arr.length - 1;
		int s = 0;
		while (s < e) {
			swap(arr, s, e);
			s++;
			e--;
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void swap(int a[], int i, int j) {
		int d = a[i];
		a[i] = a[j];
		a[j] = d;
	}
}
