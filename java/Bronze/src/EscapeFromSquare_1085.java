import java.util.Scanner;
import java.util.stream.Stream;

public class EscapeFromSquare_1085 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] digit = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = digit[0], y = digit[1], w = digit[2], h = digit[3];
        int min = 1000;
        if (min > x) min = x;
        if (min > y) min = y;
        if (min > w-x) min = w-x;
        if (min > h-y) min = h-y;
        System.out.print(min);
    }
}
