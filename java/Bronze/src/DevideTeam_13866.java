import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class DevideTeam_13866 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        Arrays.sort(array);
        int team1 = array[3]+array[0];
        int team2 = array[2]+array[1];
        if (team2 > team1)
            System.out.print(team2-team1);
        else
            System.out.print(team1-team2);
    }
}
