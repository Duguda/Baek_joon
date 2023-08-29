import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Verification_2475 {
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);

        int[] digits = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        sum += (int) Math.pow(digits[0],2);
        sum += (int) Math.pow(digits[1],2);
        sum += (int) Math.pow(digits[2],2);
        sum += (int) Math.pow(digits[3],2);
        sum += (int) Math.pow(digits[4],2);

        System.out.print(sum%10);
    }

}
