import java.util.Scanner;

public class Christmas_Party_10708 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] target = new int[M];
        int[] score = new int[N];
        int check;

        for (int i = 0; i < M; i++) {
            target[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                check = sc.nextInt();
                if (check == target[i]) {
                    score[j]++;
                } else {
                    score[target[i]-1]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(score[i]);
        }
    }
}
