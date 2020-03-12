package etc;

import java.lang.reflect.Method;

public class MesureTime
{
    Object target;

    public MesureTime(Object target)
    {
        this.target = target;
    }

    // no params
    // public long measure(String method) throws Exception
    // {
    // Method m = target.getClass().getMethod(method);
    //
    // long start = System.currentTimeMillis();
    // Object result = m.invoke(target);
    // long end = System.currentTimeMillis();
    //
    // long time = end - start;
    // print(m.getName(), time, result, null, null);
    // return time;
    // }

    public long measure(String method, Class<?>[] paramTypes, Object[] params)
    {
        try
        {
            return print(target.getClass().getMethod(method, paramTypes), paramTypes, params);
        }
        catch(NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch(SecurityException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1l;
    }

    private long print(Method m, Class<?>[] paramTypes, Object[] params) throws Exception
    {
        boolean haveParam = !(paramTypes == null && params == null);
        Object result;

        long s = System.currentTimeMillis();
        if(haveParam)
        {
            result = m.invoke(target, params);
        }
        else
        {
            result = m.invoke(target);
        }
        long e = System.currentTimeMillis();

        long time = e - s;

        System.out.println();
        System.out.println(" ------------------------");
        System.out.println("| Method : " + m.getName());
        System.out.println("|");

        if(haveParam)
        {
            String str = "| Parameter\n|";
            for(int i = 0; i < params.length; i++)
            {
                str += "\n| Type : " + paramTypes[i].getSimpleName();
                str += "\n| Value : " + params[i];
                str += "\n|";
            }
            System.out.println(str);
        }

        if(result != null)
        {
            System.out.println("| Return : " + result);
        } else {
            System.out.println("| Return : void");
        }
        System.out.println("| ExecuteTime : " + time);
        System.out.println(" ------------------------");
        return time;
    }

}
