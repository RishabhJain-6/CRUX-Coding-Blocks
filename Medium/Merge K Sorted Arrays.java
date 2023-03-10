/*
Given K sorted arrays each with N elements merge them and output the sorted array

Input Format
First line contains 2 space separated integers K and N.
Next lines contain K*N space separated integers

Constraints
Elements of array <= |10^15|
N <= 10^5
K <= 10

Output Format
Single line consisting of space separated numbers

Sample Input
3 4
1 3 5 7
2 4 6 8
0 9 10 11
Sample Output
0 1 2 3 4 5 6 7 8 9 10 11

Explanation
If we were to combine all the arrays into one and then sort it , the output would be as above.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<k;j++)
            {
                int a = scn.nextInt();
                pq.add(a);
            }
        }
        while (!pq.isEmpty())
            System.out.print(pq.poll()+" ");
    }
}
