package backjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class HanoiTower
{ // 11729
    static Scanner        sc = new Scanner(System.in);
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args)
    {
        int n = sc.nextInt();

<<<<<<< HEAD
		try {
			bw.write((int) (Math.pow(2, n) - 1) + "\n");
			move(n, 0, 1, 2);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
=======
        try
        {
            bw.write((int) Math.pow(2, n) - 1);
            bw.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
>>>>>>> branch 'master' of https://github.com/maminang/Algorithm.git

<<<<<<< HEAD
	static long move(int n, int from, int by, int to) { // n°³ÀÇ ¿ø¹ÝÀ» from Àå´ë¿¡¼­ by Àå´ë¸¦ °ÅÃÄ to Àå´ë·Î ¿Å±â°í ¸î¹ø ¿Å°å´ÂÁö ¹ÝÈ¯
		long cnt = 0;
		if (n > 1) {
			cnt += move(n - 1, from, to, by); // n-1 °³¸¦ by¿¡ ¿Å±â°í
			cnt += move(1, from, by, to); // ¸Ç¹Ø¿¡ ÀÖ´ø ¿ø¹Ý ÇÏ³ª¸¦ to·Î ¿Å±â°í
			cnt += move(n - 1, by, from, to); // by¿¡ ÀÖ´ø n-1°³ÀÇ ¿ø¹ÝÀ» to·Î ¿Å±ä´Ù
		} else {
			try {
				bw.write((from + 1) + " " + (to + 1) + "\n");
				cnt++;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
=======
    static int move(int n, int from, int by, int to)
    { // nï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ from ï¿½ï¿½ë¿¡ï¿½ï¿½ by ï¿½ï¿½ë¸¦ ï¿½ï¿½ï¿½ï¿½ to ï¿½ï¿½ï¿½ï¿½ cntï¿½ï¿½ ï¿½Å±ï¿½
        int cnt = 0;
        if(n > 1)
        {
            cnt += move(n - 1, from, to, by);
            cnt += move(1, from, by, to);
            cnt += move(n - 1, by, from, to);
        }
        else
        {
            try
            {
                bw.write((from) + " " + (to) + "\n");
                cnt++;
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        return cnt;
    }
>>>>>>> branch 'master' of https://github.com/maminang/Algorithm.git
}
