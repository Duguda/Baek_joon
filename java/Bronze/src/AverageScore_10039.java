import java.util.Scanner;

public class AverageScore_10039 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int score, total = 0;
        for (int i = 0; i < 5; i++)
        {
            score = sc.nextInt();
            if (score < 40) score = 40;
            total += score;
        }
        System.out.print(total/5);
    }
}
