import java.util.Scanner;

public class Birds_1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), value = 0, num = 1;

        while (N > 0) {
            if (N < num)
                    num = 1;
            N -= num++;

            ++value;
        }

        System.out.println(value);
    }
}
