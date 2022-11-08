/*
Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.

Input Format
A list of integers to be processed

Constraints
All numbers input are integers between -1000 and 1000.

Output Format
Print all the numbers before the cumulative sum become negative.

Sample Input
1
2
88
-100
49
Sample Output
1
2
88
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int sum = 0;
	while (sum >= 0) {
		int n = scn.nextInt();
		sum += n;
		if (sum < 0)
			break;
		System.out.println(n);
	}
    }
}
