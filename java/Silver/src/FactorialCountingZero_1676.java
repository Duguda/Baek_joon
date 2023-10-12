import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCountingZero_1676 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger big = factorial(N);
        String str = big.toString();
        int count = 0;
        for (int idx = str.length()-1; idx > 0; idx--,count ++)
        {
            if (str.charAt(idx) != '0') break;
        }
        System.out.print(count);
    }

    public static BigInteger factorial(int i)
    {
        BigInteger fac = BigInteger.ONE;
        for ( int j = 1; j <= i; j++)
        {
            fac = fac.multiply(BigInteger.valueOf(j));
        }
        return fac;
    }

}
