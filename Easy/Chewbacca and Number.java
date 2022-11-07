/*
Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. 
Inverting digit t means replacing it with digit 9 - t.

Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. 
The decimal representation of the final number shouldn't start with a zero.

Input Format
The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.

Constraints
x <= 100000000000000000

Output Format
Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.

Sample Input
4545
Sample Output
4444

Explanation
There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater than the original digit. 
If it is less, then invert it otherwise leave it.
*/


import java.util.*;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
       System.out.println(smallest_num(n));
    }

  public static long smallest_num(long num){
    long ans = 0;
    long mult = 1;
    while(num != 0){
      long rem = num % 10;
      if(rem >= 5){
        if(rem == 9 && (num/10) == 0){
          // do nothing
        }else{
          rem = 9 - rem;
        }
      }
      ans += rem * mult;
      mult *= 10;
      num /= 10;
    }
    return ans;
  }
}
