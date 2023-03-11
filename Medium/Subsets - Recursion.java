/*
Find all the subsets of a given array that sum to k.

Input Format
The first line contains an integer N , the size of the array. The next line conatins N integers. The next line contains an integer K.

Constraints
0 < N <= 20

Output Format
Output all the subsets that sum to K. The output should be printed as follows :

Sets with least no of elements should be printed first.
For equal length, elements that appear later in the original set,should be printed first.
Sample Input
5
1 4 6 5 3
10
Sample Output
6 4
3 6 1
5 4 1

Explanation
4 + 6 = 10
1 + 4 + 5 = 10
1 + 3 + 6 = 10
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		int k = scn.nextInt();
		subsets(arr, 0, 0, k, "", new ArrayList<>());
	}

	public static void subsets(int[] arr, int idx, int sum, int k, String path, ArrayList<Integer> AL) {
       if (idx == arr.length) {
           if (sum == k) {
               for (int i = AL.size() - 1; i >= 0; i--) {
                   System.out.print(AL.get(i) + " ");
               }
               System.out.println();
           }
           return;
       }
       subsets(arr, idx + 1, sum, k, path, AL);
       AL.add(arr[idx]);
       subsets(arr, idx + 1, sum + arr[idx], k, path + arr[idx] + " ", AL);
       AL.remove(AL.size() - 1);

}
}
