import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class GCMAndLCM_2609 {
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        OutputStream outputStream = System.out;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);

        String[] temp = br.readLine().split(" ");
        int n1 = Integer.parseInt(temp[0]);
        int n2 = Integer.parseInt(temp[1]);

        bw.write( getGCM(n1,n2) + "\n" );
        bw.write( getLCM(n1,n2) + "\n" );
        bw.flush();
    }

    public static int getGCM(int a, int b)
    {
        int t;
        int max, min;
        if (a>b)
        {
            max = a; min = b;
        }
        else
        {
            max = b; min = a;
        }
        while (min != 0)
        {
            t = max % min;
            max = min;
            min = t;
        }
        return max;
    }

    public static int getLCM(int a, int b)
    {
        return (a*b)/getGCM(a,b);
    }
}
