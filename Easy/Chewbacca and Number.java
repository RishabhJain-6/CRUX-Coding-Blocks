/*
Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. 
Inverting digit t means replacing it with digit 9 - t.

Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. 
The decimal representation of the final number shouldn't start with a zero.

Constraints
x <= 100000000000000000

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
