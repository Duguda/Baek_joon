import java.util.Scanner;

public class Repeat_String_2675 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int repeat = 0; repeat < t; repeat++)
        {
            int r = sc.nextInt();
            char[] s = sc.next().toCharArray();
            Repeat_String(r,s);
            System.out.println();
        }
    }
    public static void Repeat_String(int r, char[] s)
    {
        for (int remain = 0; remain < s.length; remain++)
        {
            for (int repeat = 0; repeat < r; repeat++)
            {
                System.out.print(s[remain]);
            }
        }
    }
}
