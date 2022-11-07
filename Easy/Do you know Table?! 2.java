/*
Help Lakshya Bhaiya recite tables of an input number x to the limit x*y.

Print the table of x from x*1, x * 2, x * 3… x * y.

Input Format
Take two inputs, x and y

Constraints
x<=10,000 y<=10,000

Output Format
each line contains the table of the number x

Sample Input
2 4
Sample Output
2
4
6
8
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int n = 0;
		int i = 1;
		while (true) {
			n = x * i;
			if (n > x*y) {
				break;
			}
			System.out.println(n);
			i++;
		}
	}
}
