import java.util.Scanner;

public class AwesomeNumber_17618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = 1, count = 0, total;

        for (int i = 1; i <= n; i++) {
            total = 0;
            target = i;
            while (target >= 10) {
                total += target % 10;
                target /= 10;
            }
            total += target;

            if (i % total == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
