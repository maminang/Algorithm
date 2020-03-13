package etc;

public class Main
{
    // reflection으로 함수실행시간구하기

    public static void main(String[] args)
    {
        MesureTime mt;

        // 파라미터가 여러개일때
        mt = new MesureTime(new test());
        mt.measure("printStrN", new Class[] { String.class, int.class }, new Object[] { "다이제 마씨땅", 5 });

        Fibo fibo = new Fibo(); // 테스트를 위한 피보나치수열
        mt = new MesureTime(fibo);
        for(int i = 0; i <= 50; i++)
        {
            try
            {
                mt.measure("slowFibo", new Class[] { int.class }, new Object[] { i });
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            try
            {
                mt.measure("fastFibo", new Class[] { int.class }, new Object[] { i });
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        // 가변인자이거나 제네릭인자면?

        mt = new MesureTime(new test());
        try
        {
            mt.measure("max", new Class[] { int.class, int.class, int.class, int.class, int.class }, new Object[] { 1, 2, 3, 4, 5 });
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            mt.measure("genericParam", new Class[] { String.class }, new Object[] { "제네릭" });
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    static class test
    {
        // multiParam, void test
        public void printStrN(String str, int n)
        {
            for(int i = 0; i < n; i++)
            {
                System.out.println(str);
            }
        }

        // variableParam test
        public int max(int... i)
        {
            int max = i[0];
            for(int j : i)
            {
                if(max < j)
                {
                    max = j;
                }
            }
            return max;
        }

        // genericParam test
        public <T> T genericParam(T t)
        {
            return t;
        }
    }

}
