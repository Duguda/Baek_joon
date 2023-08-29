import java.util.Scanner;

public class OvenTimer_2525 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Current_Hour = sc.nextInt(), Current_Minute = sc.nextInt();
        int Need_Minute = sc.nextInt();
        Current_Minute += Need_Minute;
        Current_Hour += Current_Minute/60;
        Current_Minute %= 60;
        Current_Hour %= 24;
        System.out.print(Current_Hour + " " + Current_Minute);
    }
}
