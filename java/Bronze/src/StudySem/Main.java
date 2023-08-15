package StudySem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        scratch scr = new scratch();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum : "+scr.sum(a,b));
        System.out.println("Minus : "+scr.min(a,b));
        System.out.println("Time : "+scr.tim(a,b));
        System.out.println("Divide : "+scr.div(a,b));
    }
}

