/*
Vivek loves to play with array . One day Vivek just came up with a new array game which was introduced to him by his friend Ujjwal. 
The rules of the game are as follows:

Initially, there is an array, A , containing 'N' integers.

In each move, Vivek must divide the array into  two non-empty contiguous parts such that the sum of the elements in the left part is equal  
to the sum of the elements in the right part. If Vivek can make such a move, he gets '1' point; otherwise, the game ends.

After each successful move, Vivek have to discards either the left part or the right part and continues playing by using 
the remaining partition as array 'A'.

Vivek loves this game and wants your help getting the best score possible. Given 'A', can you find and print the maximum number of points he can score?

Input Format
First line of input contains an integer T denoting number of test cases. Each further Test case contains first line an integer 'N' , the size of array 'A'. 
After that 'N' space separated integers denoting the elements of array.

Constraints
1 <= T <= 10 1 <= N <= 17000 0 <= A[i] <= 10^9

Output Format
For each test case, print Vivek's maximum possible score on a new line.

Sample Input
3
3
3 3 3
4
2 2 2 2
7
4 1 0 1 1 0 1
Sample Output
0
2
3
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-- >0){
            int n =sc.nextInt();
            int[] arr=new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
            System.out.println(ans(arr,0,n-1));
        }
    }

        public static int ans(int[] arr, int start , int end){
            if(start>end){
                return 0;
            }

            int leftpart=0;
            int rightpart=0;

            for(int i=start;i<end;i++){
                int sum1=calsum(arr,start,i);
                int sum2=calsum(arr,i+1,end);

                if(sum1==sum2){
                    leftpart=ans(arr,start,i);
                    rightpart=ans(arr,i+1,end);
                    int jawab=Math.max(leftpart,rightpart)+1;
                    return jawab;
                }
            }
            return 0;
        }

        public static int calsum(int[] arr,int start,int end){
             int count = 0;
             for(int i = start; i <= end ; i++){
                 count+=arr[i];
                 }
                return count;
        }
}
