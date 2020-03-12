package etc;

import java.util.*;

public class Fibo
{
    Map<Long, Long> memo;

    public Fibo()
    {
        memo = new HashMap<Long, Long>();
        memo.put(0l, 0l);
        memo.put(1l, 1l);
    }

    // 느린 피보나치
    public long slowFibo(int n)
    {
        return n < 2 ? n : slowFibo(n - 1) + slowFibo(n - 2);
    }

    // 빠른 피보나치
    public long fastFibo(int n)
    {
        if(!memo.containsKey((long) n))
        {
            memo.put((long) n, fastFibo(n - 1) + fastFibo(n - 2));
        }
        return memo.get((long) n);
    }

}
