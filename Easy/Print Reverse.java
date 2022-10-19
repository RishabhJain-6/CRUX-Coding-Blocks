// Take N as input, Calculate it's reverse also Print the reverse.


import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = (rev * 10) + digit;
			num = num / 10;
		}
		System.out.println(rev);
    }
}
