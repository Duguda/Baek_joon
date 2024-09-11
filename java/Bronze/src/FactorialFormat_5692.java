import java.util.Scanner;

public class FactorialFormat_5692 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt(), digits, sum, facto;

        while (value > 0) {
            sum = 0;
            digits = 1;
            facto = 1;
            while (value > 0) {
                sum += value % 10 * facto;
                facto *= ++digits;
                value /= 10;
            }

            System.out.println(sum);
            value = sc.nextInt();
        }
    }
}
