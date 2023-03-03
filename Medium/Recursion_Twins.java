/*
Take an input str, a string. A “twin” is defined as two instances of a char separated by a char. E.g. "AxA" the A's make a “twin”. 
“twins” can overlap, so "AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which recursively counts number of “twins” in a string. 
Print the value returned.

Input Format
Enter the string

Constraints
None

Output Format
Display the number of twins

Sample Input
AXAXA
Sample Output
3
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(isTwin(s,0));
    }

    public static int isTwin(String s,int i)
    {
        if (i==s.length()-1 || i==s.length())
            return 0;
        
        if (i+2<s.length() && s.charAt(i)==s.charAt(i+2))
            return 1 + isTwin(s,i+1);
        return isTwin(s,i+1);
    }
}
