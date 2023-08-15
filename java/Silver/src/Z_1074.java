import java.util.Scanner;

public class Z_1074 {
    static int count = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), r = sc.nextInt(), c = sc.nextInt();


        find((int)Math.pow(2,N),r,c);
        System.out.print(count);
    }
    public static void find(int size, int r, int c)
    {
        if (size == 1)
        {
            return;
        }
        else
        {
            if (size/2 > r && size/2 > c)
            {
                find(size/2, r,c);
            }
            else if (size/2 <= c && size/2 > r)
            {
                count += (size*size) / 4;
                find(size/2, r, c - size/2);
            }
            else if (size/2<= r && size/2 > c)
            {
                count += 2*(size*size / 4);
                find(size/2, r - size/2, c);
            }
            else
            {
                count += 3*(size*size / 4);
                find(size/2, r-size/2, c-size/2);
            }
        }

    }
}
