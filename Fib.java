public class Fib {
    public int fac(int n)
    {
        if(n==0)
            return 1;
        return n*fac(n-1);
    }
    public static void main(String ar[])
    {
        int n=10;
        Fib f=new Fib();
        System.out.println(f.fac(n));
    }
}
