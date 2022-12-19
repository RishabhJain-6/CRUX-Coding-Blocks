/*
Take as input N, a number. Print the following pattern (for N = 5)

       *    *   *   *   *   
       *    *   *   *
       *    *   *
       *    *   
       *    
Input Format
Enter value of N

Constraints
None

Output Format
Tab separated (*)

Sample Input
5
Sample Output
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*	

*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		invertedTriangle(n);
	}

	public static void invertedTriangle(int n) {
		if (n == 0) {
			return;
		}
		for (int i = 0; i < n; i++) {
			System.out.print("*\t");
		}
		System.out.println();
		invertedTriangle(n - 1);
	}
}
