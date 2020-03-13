package backjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PadovanSequence // 9461
{
    static Scanner         sc   = new Scanner(System.in);
    static Map<Long, Long> memo = new HashMap<Long, Long>();

    public static void main(String[] args)
    {
        memo.put(1l, 1l);
        memo.put(2l, 1l);
        memo.put(3l, 1l);
        long t = sc.nextLong();
        for(long i = 0; i < t; i++)
        {
            System.out.println(padovan(sc.nextLong()));
        }
    }

    static private long padovan(long n)
    {
        if(!memo.containsKey(n))
        {
            memo.put(n, padovan(n - 2) + padovan(n - 3));
        }
        return memo.get(n);
    }
}
