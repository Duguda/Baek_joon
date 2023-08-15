import java.util.Scanner;

public class Counting_Word_1152 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[] strArray = sc.nextLine().toCharArray();
        System.out.print(count(strArray));
    }
    public static int count(char[] Array)
    {
        boolean isWordstart = false;
        int count = 0;
        for(char arrayChar : Array)
        {
            if (!isWordstart && Character.isLetter(arrayChar))
            {
                count++;
                isWordstart = true;
            } else if (isWordstart && !Character.isLetter(arrayChar))
                isWordstart = false;
        }
        return count;
    }
}
