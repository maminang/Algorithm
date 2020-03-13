package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber // 2581
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int m = sc.nextInt();
        int n = sc.nextInt();

        // eratos start
        ArrayList<Boolean> primeList = new ArrayList<Boolean>();
        primeList.add(0, false);
        primeList.add(1, false);
        for(int i = 2; i <= n; i++)
        {
            primeList.add(i, true);
        }
        for(int i = 2; (i * i) <= n; i++)
        {
            for(int j = i * 2; j <= n; j += i)
            {
                primeList.set(j, false);
            }
        }
        // eratos end
        int sum = 0;
        int min = n;
        for(int i = m; i <= n; i++)
        {
            if(primeList.get(i))
            {
                sum += i;
                min = min > i ? i : min;
            }
        }
        if(sum != 0)
        {
            System.out.println(sum);
            System.out.println(min);
        }
        else
        {
            System.out.println(-1);
        }
    }

}
