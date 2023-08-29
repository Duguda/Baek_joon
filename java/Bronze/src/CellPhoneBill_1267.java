import java.util.Scanner;

public class CellPhoneBill_1267 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = 0;
        int M = 0;
        int time = 0;
        for (int i = 0; i < N; i++)
        {
            time = sc.nextInt();
            Y += (time/30+1)*10;
            M += (time/60+1)*15;
        }
        if (Y<M) System.out.print("Y " + Y);
        else if (M<Y) System.out.print("M " + M);
        else System.out.print("Y M " + M);

    }
}
