package etc;

public class JavaIsPassByValue
{
    // 20.03.10 hamin
    public static void main(String[] args)
    {
        T a = new T("something1");

        System.out.println("Main : " + a);
        newObjectAssign(a); // 새로운 객체 할당
        System.out.println("Main : " + a);
        // newObjectAssign에서 a 에 다른 객체를 할당해 줬지만 a는 변하지 않았다

        System.out.println();

        System.out.println(a.getStr());
        changeField(a); // a의 필드를 변경
        System.out.println(a.getStr());
        // 필드는 변경이 된다

        /* 객체의 상태(필드)는 바꿀수 있지만 객체 자체를 바꿀수는 없다 왜 이렇게 작동할까?
         * 파라미터로 참조변수를 넘겨줄때 레퍼런스 자체를 넘겨주는게 아니라
         * 그 값을 복사해서 넘겨주기 때문 (pass by value)
         * 그래서 객체의 상태는 참조를 쫒아가서 변경이 되지만
         * 참조변수에 다른 객체를 할당해주는건 안된다. 참조변수를 복사해서 메서드로컬로만 쓰이니까
         * 객체 자체를 바꿔줄려면 이중포인터를 써야 하는데 자바에서 그런게 될리가???
         * */
    }

    static void newObjectAssign(T a)
    {
        System.out.println();
        System.out.println("NewObjectAssign : " + a);
        a = new T("something2");
        System.out.println("NewObjectAssign : " + a);
        System.out.println();
    }

    static void changeField(T a)
    {
        a.setStr("changed");
    }

    static class T
    {
        private String str;

        public T(String str)
        {
            this.str = str;
        }

        public String getStr()
        {
            return str;
        }

        public void setStr(String str)
        {
            this.str = str;
        }

    }
}
