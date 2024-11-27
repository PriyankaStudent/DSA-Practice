abstract class A {
    abstract int add(int a, int b);
}
class B extends A
{
    int add(int a,int b)
    {
        System.out.println(a+b);
        return (a+b);
    }
    public static void main(String pr[])
    {
        B ab = new B();
        int c=ab.add(4,5);
        System.out.print(c);
    }
}