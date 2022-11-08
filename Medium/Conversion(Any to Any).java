/*
Take sb (source number system base), db (destination number system base) and sn (number in source format). 
Write a function that converts sn to its counterpart in destination number system. Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
8
2 
33
Sample Output
11011

Explanation
All input output is as integers and in separate lines.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int sn = scn.nextInt();
		int num = anyToDecimal(sn, sb);
		if (db==10)
		{
			System.out.println(num);
		}
		else
		{
			System.out.println(decimalToAny(num,db));
		}
	}

	public static int anyToDecimal(int num, int b) {
		if (b == 10) {
			return num;
		}
		int i = 0;
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
			int mult = (int) Math.pow(b, i);
			ans += digit * mult;
			i++;
			num /= 10;
		}
		return ans;
	}

	public static int decimalToAny(int num, int b) {
		if (num < b) {
			return num;
		}
		int ans = 0;
		int mult = 1;
		while (num > 0) {
			int rem = num % b;
			ans += rem * mult;
			mult*=10;
			num = (num / b);
		}
		return ans;
	}
}
