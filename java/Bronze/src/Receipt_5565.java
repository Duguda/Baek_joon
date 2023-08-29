import java.util.Scanner;

public class Receipt_5565 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        for (int i = 0; i < 9; i++)
        {
            amount -= sc.nextInt();
        }
        System.out.print(amount);
    }
}
