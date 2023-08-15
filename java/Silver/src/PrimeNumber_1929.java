import java.util.Scanner;

public class PrimeNumber_1929 {
    public static boolean[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        make_prime(M);
        for (int i = N; i <= M; i++)
        {
            if(!prime[i])
            {
                System.out.println(i);
            }
        }
    }

    public static void make_prime(int N){
        prime = new boolean[N+1];
        if (N<2)
        {
            return;
        }
        prime[0] = prime[1] = true;
        for (int i = 2; i < Math.sqrt(prime.length); i++)
        {
            if(prime[i])
            {
                continue;
            }
            for (int j = i*i; j < prime.length; j+=i)
            {
                prime[j] = true;
            }
        }
    }
}
