import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Pizza_17946 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        int k;

        for (int i = 1; i <= n; i++) {
            k = sc.nextInt();
            bw.write(1);
        }

        bw.flush();
    }
}
