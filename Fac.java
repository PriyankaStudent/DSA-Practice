import java.math.BigInteger;

public class Fac {
    static BigInteger fac(int n)
    {   if(n==0||n==1)
            return BigInteger.ONE;
        else
            return BigInteger.valueOf(n).multiply(fac(n-1));
    }
    public static void main(String ar[])
    {
        int n=300;
        System.out.println(fac(n));
    }
}
