package backjoon;

import java.util.Scanner;

public class HoneyComb
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = sc.nextInt();
        int distance = 1;
        while(true)
        {
            if(n > distance * 6 + 1)
            {
                n -= distance * 6;
            }
            else
            {
                distance++;
                break;
            }
            distance++;
        }

        System.out.println(distance);
    }

}
