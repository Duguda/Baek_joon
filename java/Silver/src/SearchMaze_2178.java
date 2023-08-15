import java.util.Scanner;

public class SearchMaze_2178 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        sc.nextLine();

        int[][] field = new int[N][M];

        for (int i = 0; i < N; i++)
        {
            String split = sc.nextLine();
            for (int j = 0; j < M; j++)
                field[i][j] = split.charAt(j) - '0'; //parseInt를 사용하는것이 더 좋을 수 있다.
        }
        System.out.print(Search(field,N,M));
    }

    public static int Search(int[][] field, int target_x, int target_y)
    {
        int count = 1;
        boolean isCrossLine = false;

        int x = 0, y = 0;

        field[x][y] = 2;
        while(!(x == target_x) && !(y == target_y)) {
            if (!isCrossLine) {
                if (!isMaxX(x + 1, field) && !isMaxY(y + 1, field) && field[x + 1][y] == 1 && field[x][y + 1] == 1) {
                    field[x][y] = 3;
                }
                if (!isMaxX(x + 1, field) && field[x + 1][y] == 1) {
                    field[x++][y] = 2;
                    count++;
                } else if (!isMaxY(y + 1, field) && field[x][y + 1] == 1) {
                    field[x][y++] = 2;
                    count++;
                } else if (isMaxX(x + 1, field) || isMaxY(y + 1, field)) {
                    isCrossLine = true;
                }
            }
            else {
                if (field[x-1][y] == 2 && isCrossLine)
                {
                    if(field[x-1][y] == 3)
                        isCrossLine = false;
                    field[x--][y] = 0;
                    count--;
                }
                else if (field[x][y-1] == 2 && isCrossLine)
                {
                    if(field[x][y-1] == 3)
                        isCrossLine = false;
                    field[x][y--] = 0;
                    count--;
                }
            }
        }
        return count;
    }

    public static boolean isMaxX(int x, int field[][])
    {
        return x==field.length;
    }
    public static boolean isMaxY(int y, int field[][])
    {
        return y == field[0].length;
    }
}
