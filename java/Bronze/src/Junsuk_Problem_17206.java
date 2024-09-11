import java.util.Scanner;

public class Junsuk_Problem_17206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String[] numStrings = sc.nextLine().split(" ");
        int[] nums = new int[N];
        int[] memo = new int[80001];
        int[] memo3 = new int[26667];
        int[] memo7 = new int[11429];
        int[] memo21 = new int[38101];
        for (int i = 0; i < N; i++)
            nums[i] = Integer.parseInt(numStrings[i]);
        int sum;

        for (int i = 0; i < N; i++) {
            if (memo[nums[i]] == 0) {
                sum = 0;
                for (int count = 1; ; count++) {
                    if (21 * count <= nums[i])
                        sum -= 21 * count;
                    if (7 * count <= nums[i])
                        sum += 7 * count;
                    if (3 * count <= nums[i])
                        sum += 3 * count;
                    else {
                        break;
                    }
                }

                memo[nums[i]] = sum;
                System.out.println(sum);
            } else {
                System.out.println(memo[nums[i]]);
            }
        }
    }
}
