import java.util.Scanner;

public class AlphabetCount_10808 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] ans = new int[26];
        for (int i = 0; i < S.length(); i++)
        {
            switch (S.charAt(i))
            {
                case 'a':
                    ans[0]++;
                    break;
                case 'b':
                    ans[1]++;
                    break;
                case 'c':
                    ans[2]++;
                    break;
                case 'd':
                    ans[3]++;
                    break;
                case 'e':
                    ans[4]++;
                    break;
                case 'f':
                    ans[5]++;
                    break;
                case 'g':
                    ans[6]++;
                    break;
                case 'h':
                    ans[7]++;
                    break;
                case 'i':
                    ans[8]++;
                    break;
                case 'j':
                    ans[9]++;
                    break;
                case 'k':
                    ans[10]++;
                    break;
                case 'l':
                    ans[11]++;
                    break;
                case 'm':
                    ans[12]++;
                    break;
                case 'n':
                    ans[13]++;
                    break;
                case 'o':
                    ans[14]++;
                    break;
                case 'p':
                    ans[15]++;
                    break;
                case 'q':
                    ans[16]++;
                    break;
                case 'r':
                    ans[17]++;
                    break;
                case 's':
                    ans[18]++;
                    break;
                case 't':
                    ans[19]++;
                    break;
                case 'u':
                    ans[20]++;
                    break;
                case 'v':
                    ans[21]++;
                    break;
                case 'w':
                    ans[22]++;
                    break;
                case 'x':
                    ans[23]++;
                    break;
                case 'y':
                    ans[24]++;
                    break;
                case 'z':
                    ans[25]++;
                    break;
            }
        }
        for (int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
