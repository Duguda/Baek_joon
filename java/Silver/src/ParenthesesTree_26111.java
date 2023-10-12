import java.util.Scanner;

public class ParenthesesTree_26111 {
    public static void main(String[] args)
    {
        String str = "";
        Scanner sc = new Scanner(System.in);

        long countLeft = 0;
        long sum = 0;
        long countRight = 0;

        char[] cA = sc.nextLine().toCharArray();

        for(int i = 0; i < cA.length; i++)
        {
            if (cA[i] == '(') {
                if (cA[i+1] == ')')
                    sum+=countLeft - countRight;
                countLeft++;
            }
            if (cA[i] == ')')
                countRight++;
        }

        System.out.print(sum);
    }
}
