import java.io.*;

public class Olympic_8979 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);

        String[] strings = br.readLine().split(" ");
        int N = Integer.parseInt(strings[0]);
        int K = Integer.parseInt(strings[1]);
        int[] ranks = new int[N];
        int[] golds = new int[N];
        int[] silvers = new int[N];
        int[] coppers = new int[N];

        for (int i = 0; i < ranks.length; i++)
            ranks[i] = 1;
        for (int i = 0; i < N; i++) {
            strings = br.readLine().split(" ");
            golds[Integer.parseInt(strings[0])-1] = Integer.parseInt(strings[1]);
            silvers[Integer.parseInt(strings[0])-1] = Integer.parseInt(strings[2]);
            coppers[Integer.parseInt(strings[0])-1] = Integer.parseInt(strings[3]);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (golds[i] < golds[j]) {
                    ranks[i]++;
                } else if (golds[i] == golds[j]) {
                    if (silvers[i] < silvers[j]) {
                        ranks[i]++;
                    } else if (silvers[i] == silvers[j]) {
                        if (coppers[i] < coppers[j]) {
                            ranks[i]++;
                        }
                    }
                }
            }
        }

        System.out.println(ranks[K-1]);
    }
}