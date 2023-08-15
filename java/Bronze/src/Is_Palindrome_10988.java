import java.util.Scanner;

public class Is_Palindrome_10988 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if(isPalindrome(sc.next().toCharArray()))
            System.out.print(1);
        else System.out.print(0);
    }
    public static boolean isPalindrome(char[] cArr)
    {
        for(int idx = 0; idx<cArr.length/2; idx++)
        {
            if(cArr[idx] != cArr[cArr.length-idx-1])
                return false;
        }
        return true;
    }
}
