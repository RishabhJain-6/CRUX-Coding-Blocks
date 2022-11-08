/*
Print "lowercase" if user enters a character between 'a-z' , Print "UPPERCASE" is character lies between 'A-Z' and 
print "Invalid" for all other characters like $,.^# etc.

Input Format
Single Character .

Constraints
-

Output Format
lowercase UPPERCASE Invalid

Sample Input
$
Sample Output
Invalid

Explanation
-
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	char ch = scn.next().charAt(0);
	if (ch >= 'a' && ch <= 'z') {
		System.out.println("lowercase");
	} else if (ch >= 'A' && ch <= 'Z') {
		System.out.println("UPPERCASE");
	} else {
		System.out.println("Invalid");
	}
    }
}
