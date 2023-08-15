import java.util.Scanner;

public class Find_Alphabet_10809 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[] Array = sc.next().toCharArray();

        for (int i = (int)'a'; i <= (int)'z'; i++)
            System.out.print(whereFind(Array,(char)i)+" ");

    }
    public static int whereFind(char[] c_Array, char chara)
    {
        int locate_Alphabet = -1;
        for (int i = 0; i < c_Array.length; i++)
        {
            if(c_Array[i] == chara)
            {
                locate_Alphabet = i;
                break;
            }
        }
        return locate_Alphabet;
    }
}
