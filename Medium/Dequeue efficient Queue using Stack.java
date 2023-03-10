/*
Implement a Queue using two stacks Make it Dequeue efficient.

Input Format
Enter the size of the queue N add 0 - N-1 numbers in the queue

Constraints
Output Format
Display the numbers in the order they are dequeued and in a space separated manner

Sample Input
5
Sample Output
0 1 2 3 4
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Queue q = new Queue();
        for (int i=0;i<n;i++)
        {
            q.enqueue(i);
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(q.dequeue()+" ");
        }
    }
}

class Queue {
    Stack<Integer> stk1;
    Stack<Integer> stk2;

    Queue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }

    void enqueue(int ele) {
        while (!stk2.isEmpty())
            stk1.add(stk2.pop());
        stk1.add(ele);
        while (!stk1.isEmpty())
            stk2.add(stk1.pop());
    }

    int dequeue() {
        return stk2.pop();
    }
}
