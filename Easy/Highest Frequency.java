/*
Given an array find the number which comes with maximum frequency. It must work in O(n) time complexity.

Input Format
Enter the size of the array N and add N more numbers and store in an array

Constraints
1 <= N <= 10^7
-109 <= A[i] <= 109

Output Format
Display the number with the maximum frequency.

Sample Input
5
1 2 2 2 3
Sample Output
2

Explanation
2 has the highest frequency in the array i.e. 3.
*/

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++)
        {
            if (map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int maxF = -1;
        int max = Integer.MIN_VALUE;
        for (int key:map.keySet())
        {
            if (maxF<map.get(key))
            {
                maxF = map.get(key);
                max = key;
            }
        }
        System.out.println(max);
    }
}
