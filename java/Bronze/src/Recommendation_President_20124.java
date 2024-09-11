import java.util.Scanner;

public class Recommendation_President_20124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int maxScore = 0;
        String maxName = "";
        String str; String[] strings;

        for (int i = 0; i < N; i++) {
            str = sc.nextLine();
            strings = str.split(" ");
            if (maxScore < Integer.parseInt(strings[1])) {
                maxScore = Integer.parseInt(strings[1]);
                maxName = strings[0];
            } else if (maxScore == Integer.parseInt(strings[1])) {
                if (strings[0].compareTo(maxName) <= 0) {
                    maxName = strings[0];
                }
            }
        }

        System.out.println(maxName);
    }
}
