import java.util.Scanner;

class SuperMario_2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[10];
        int[] totals = new int[10];
        int score = 0;

        for (int i = 0; i < 10; i++) {
            scores[i] = sc.nextInt();
            totals[i] = 0;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 9-i; j >= 0; j--)   {
                totals[j] += scores[i];
            }
        }


        for (int i = 0; i < 10; i++) {
            if (Math.abs(score - 100) > Math.abs(totals[i] - 100)) {
                score = totals[i];
            }
        }

        System.out.println(score);
    }
}
