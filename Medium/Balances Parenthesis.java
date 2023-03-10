/*
You are given a string of brackets i.e. '{', '}' , '(' , ')', '[' , ']' . You have to check whether the sequence of parenthesis is balanced or not.
For example, "(())", "(())()" are balanced and "())(", "(()))" are not.

Input Format
A string of '(' , ')' , '{' , '}' and '[' , ']' .

Constraints
1<=|S|<=10^5

Output Format
Print "Yes" if the brackets are balanced and "No" if not balanced.

Sample Input
(())
Sample Output
Yes

Explanation
(()) is a balanced string.
*/

import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		if (isBalanced(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean isBalanced(String expr)
    {
        Stack<Character> stack
            = new Stack<>();
 
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
        return (stack.isEmpty());
    }
}

