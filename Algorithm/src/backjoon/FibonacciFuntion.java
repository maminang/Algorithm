package backjoon;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciFuntion
{ // 1003, 2748
    static HashMap<Long, Long> memo = new HashMap<Long, Long>();
    static Scanner                   sc   = new Scanner(System.in);

    public static void main(String[] args)
    {
        memo.put(0l, 0l);
        memo.put(1l, 1l);
        System.out.println(fibonacci(sc.nextLong()));
    }

    public static long fibonacci(long n)
    {
        if(!memo.containsKey(n))
        {
            if(n > 1)
            {
                memo.put(n, fibonacci(n - 1) + fibonacci(n - 2));
            }
            else
            {
                memo.put(n, n);
            }
        }
        return memo.get(n);
    }

}
