/*
Tughlaq introduces a strange monetary system. He introduces copper coins and each coin has a number written on it. 
A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4. A coin can also be sold for gold. 
One can get as much grams of gold as the number written on the coin. You have one copper coin. What is the maximum weight of gold one can get from it?

Input Format
The input file contains a single integer n, the number on the coin.

Constraints
0 <= n <= 1 000 000 000

Output Format
Print the maximum weight of gold you can get.

Sample Input
12
Sample Output
13
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        System.out.println(gold(n,new HashMap<>()));
    }

    public static long gold(long n,HashMap<Long,Long> map) {
        if (n<=1)
            return n;
        
        if (map.containsKey(n))
            return map.get(n);
        long sp1 = gold(n/2,map);
        long sp2 = gold(n/3,map);
        long sp3 = gold(n/4,map);
        map.put(n,Math.max(n,sp1+sp2+sp3));
        return Math.max(n,sp1+sp2+sp3);
    }
}
