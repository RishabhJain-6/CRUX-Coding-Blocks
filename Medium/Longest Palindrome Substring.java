/*
A regular palindrome is a string of numbers or letters that is the same forward as backward. 
For example, the string "ABCDEDCBA" is a palindrome because it is the same when the string is read from left to right as when the string is read from right to left.

A substring is a contiguous sequence of characters within a string. For instance, "the best of" is a substring of "It was the best of times".

Now the question is, given a string, find the longest substring which is a palindrome.

Input Format
The first line represents the number of testcases t The second line represents Input string

Constraints
1<=t<=100
1<=string.length<=1000

Output Format
Longest palindromic substring Print length of the substring in next line

Sample Input
2
ababbagh
ilovecodinggnidoc
Sample Output
abba
4
codinggnidoc
12
*/

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0) {
            String S = scn.next();
            String ans = "";
            for (int i=0;i<S.length();i++) {
                for (int j=i+1;j<S.length();j++) {
                    if (isPalin(S.substring(i,j+1))) {
                        if (ans.length()<S.substring(i,j+1).length())
                            ans = S.substring(i,j+1);
                    }
                }
            }
            System.out.println(ans + "\n" + ans.length());
        }
    }

    public static boolean isPalin(String S) {
        int s=0;
        int e=S.length()-1;
        while (s<=e){
            if (S.charAt(s)!=S.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
}
