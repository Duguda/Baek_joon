import java.util.Scanner;
//NOT SOLVED
public class Frog_Jump_26107 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int k = 0;
        int frog = 1;
        int jump = 0;

        n = sc.nextInt();
        k = sc.nextInt();
        int[][] iA = new int[n][2];
        boolean[] interval = new boolean[n-1];
        int[] space = new int[n-1];

        for(int i = 0; i < n; i++)
        {
            iA[i][0] = sc.nextInt();
            iA[i][1] = sc.nextInt();
        }
        interval[0] = true;
        if(n >= 2)
        {
            for(int i = 0; i < n-1; i++)
            {
                interval[i] = iA[i][1] >= iA[i+1][0];
                if (interval[i] && iA[i][1] >= iA[i+1][1])
                    iA[i+1][1] = iA[i][1];
                if (!interval[i])
                    space[i] = iA[i+1][0] - iA[i][1];
            }
        }
        int frogLotus = 1;
        if (iA[0][0] > frog)
        {
            jump+=iA[0][0]-1;
        }
        for(int i = 0; i < k; i++)
        {
            int target = sc.nextInt();
            if (frogLotus < target)
            {
                for (int j = frogLotus-1; j < target-1; j++)
                {
                    if (!interval[j])
                        jump+=space[j];
                }
            }
            else {
                for (int j = frogLotus-1; j > target-1; j--)
                {
                    if (!interval[j])
                        jump+=space[j];
                }
            }
            frogLotus = target;
        }
        System.out.print(jump);
    }
}
