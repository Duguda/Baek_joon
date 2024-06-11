import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;

public class SortAge_10814 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);

        int n = Integer.parseInt(br.readLine());
        String[][] str = new String[n][2];

        String[] first = br.readLine().split(" ");
        str[0][0] = first[0];
        str[0][1] = first[1];
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            if (Integer.parseInt(str[i][0]) < Integer.parseInt(temp[0])) {

            }

        }


        for (int i = 0; i < n; i++) {
            bw.write(str[i][0] + " " + str[i][1] + "\n");
        }
        bw.flush();

    }

}