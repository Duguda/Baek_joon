import java.util.Scanner;

public class DifferentialEquation_14730 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c, k;
        int total = 0;

        for (int i = 0; i < n; i++) {
            c = sc.nextInt();
            k = sc.nextInt();

            total += c * k;
        }

        System.out.println(total);
    }
}
