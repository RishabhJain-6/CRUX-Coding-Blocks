/*
Take as input N, a number. Write a recursive function which prints counting from 0 to N in lexicographical order. 
In lexicographical (dictionary) order 10, 100 and 109 will be printed before 11.

Input Format
Enter a number N.

Constraints
None

Output Format
Display all the numbers upto N in a lexicographical order

Sample Input
10
Sample Output
0 1 10 2 3 4 5 6 7 8 9 
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.print(0 + " ");
		print(0, n);
	}

	public static void print(int start, int end) {
		int a = 0;
		if (start == 0)
			a = 1;

		for (int i = a; i <= 9; i++) {
			if (start * 10 + i > end)
				return;
			System.out.print((start * 10 + i) + " ");
			print(start * 10 + i, end);
		}
	}

    public static void method1(int n) { // Another way
		ArrayList<String> Al = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			String a = i + "";
			Al.add(a);
		}
		Collections.sort(Al);
		for (String i : Al)
			System.out.print(i + " ");
	}
}
