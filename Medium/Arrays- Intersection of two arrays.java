/*
Take as input N, the size of array. Take N more inputs and store that in an array. Take N more inputs and store that in another array. 
Write a function which gives the intersection of two arrays in an ArrayList of integers and Print the ArrayList.

Input Format
First line contains N denoting the size of the two arrays. 
Second line contains N space separated integers denoting the elements of the first array. 
Third line contains N space separated integers denoting the elements of the second array.

Constraints
Length of Arrays should be between 1 to 100000.

Output Format
Display the repeating elements in a comma separated manner enclosed in square brackets. The numbers should be sorted in increasing order.

Sample Input
7
1 2 3 1 2 4 1
2 1 3 1 5 2 2
Sample Output
[1, 1, 2, 2, 3]

Explanation
Check which integer is present in both the arrays and add them in an array .Print this array as the ans.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = scn.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer> Al = intersection(arr1, arr2);
		System.out.println(Al);
	}

	public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> Al = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr2[j] == arr1[i]) {
				Al.add(arr2[j]);
				j++;
				i++;
			} else if (arr2[j] > arr1[i]) {
				i++;
			} else {
				j++;
			}
		}
		return Al;
	}
}
