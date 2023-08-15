import java.util.Scanner;

public class Array_Sum_2738 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] f_array = new int[N][M];

        for (int idx_1 = 0; idx_1 < N; idx_1++)
            for (int idx_2 = 0; idx_2 < M; idx_2++)
                f_array[idx_1][idx_2] = sc.nextInt();
        for (int idx_1 = 0; idx_1 < N; idx_1++)
            for (int idx_2 = 0; idx_2 < M; idx_2++)
                f_array[idx_1][idx_2] += sc.nextInt();
        for (int idx_1 = 0; idx_1 < N; idx_1++)
        {
            for (int idx_2 = 0; idx_2 < M; idx_2++)
                System.out.print(f_array[idx_1][idx_2]+" ");
            System.out.println();
        }
    }
}
