import java.util.Scanner;

public class A_Plus_B_Six_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N; String str; String[] strings;
        N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            str = sc.nextLine();

            strings = str.split(",");
            System.out.println(Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]));
        }
    }
}
