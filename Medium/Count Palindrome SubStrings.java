/*
You are given a string, count all palindrome substring in a given string with size >=2.

Input Format
The input string S.

Constraints
Length of the string is less than 500.

Output Format
An integer n representing the count of palindromic substrings

Sample Input
abaab
Sample Output
3

Explanation
3 SubStrings are as follows : aba baab aa
*/

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        String S = scn.next();
        int count = 0;
        for (int i=0;i<S.length();i++) {
            for (int j=i+1;j<S.length();j++) {
                if (isPalin(S.substring(i,j+1)))
                    count++;
            }
        }
        System.out.println(count);
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
