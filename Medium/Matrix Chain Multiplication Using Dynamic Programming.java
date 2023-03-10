/*
Matrix chain multiplication problem: Determine the optimal parenthesization of a product of n matrices.

Matrix chain multiplication (or Matrix Chain Ordering Problem, MCOP) is an optimization problem that to find the most efficient way to multiply a given sequence 
of matrices. The problem is not actually to perform the multiplications but merely to decide the sequence of the matrix multiplications involved.

 
The matrix multiplication is associative as no matter how the product is parenthesized, the result obtained will remain the same. For example, for four matrices 
A, B, C, and D, we would have:

((AB)C)D = ((A(BC))D) = (AB)(CD) = A((BC)D) = A(B(CD))

 
However, the order in which the product is parenthesized affects the number of simple arithmetic operations needed to compute the product or the efficiency. 
For example, if A is a 10 × 30 matrix, B is a 30 × 5 matrix, and C is a 5 × 60 matrix, then computing (AB)C needs (10×30×5) + (10×5×60) = 1500 + 3000 = 4500 
operations while computing A(BC) needs (30×5×60) + (10×30×60) = 9000 + 18000 = 27000 operations. Clearly, the first method is more efficient.

 

Input Format
An integer n denoting size of dimensions array.
Elements of dimension array

Constraints
0<=n<=50
0<=dims[i]<=1000

Output Format
Total cost

Sample Input
4
10 30 5 60
Sample Output
4500
*/

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        System.out.println(MatrixChainOrder(arr,1,n-1,new Integer[n+1][n+1]));
    }

    public static int MatrixChainOrder(int arr[], int i, int j,Integer[][] dp)
    {
        if (i == j)
            return 0;

        if (dp[i][j]!=null)
            return dp[i][j];
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int count = MatrixChainOrder(arr, i, k,dp)
                        + MatrixChainOrder(arr, k + 1, j,dp)
                        + arr[i - 1] * arr[k] * arr[j];
 
            min=Math.min(min,count);
        }
        dp[i][j]=min;
        return min;
    }
}
