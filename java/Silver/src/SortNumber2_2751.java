import java.io.*;
import java.util.Arrays;

public class SortNumber2_2751 {
    public static void main(String args[]) throws IOException
    {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        for (int i = 0; i < N; i++)
        {
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++)
        {
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
