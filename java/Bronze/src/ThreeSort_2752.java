import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ThreeSort_2752 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        Arrays.sort(array);
        System.out.print(array[0]+" "+array[1]+" "+array[2]);
    }
}
