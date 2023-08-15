import java.util.Scanner;

public class Read_Length_10798 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[] arr1 = sc.nextLine().toCharArray();
        char[] arr2 = sc.nextLine().toCharArray();
        char[] arr3 = sc.nextLine().toCharArray();
        char[] arr4 = sc.nextLine().toCharArray();
        char[] arr5 = sc.nextLine().toCharArray();

        String total_arr = new String(arr1) + new String(arr2) + new String(arr3) + new String(arr4) + new String(arr5);

        char[] c_arr = total_arr.toCharArray();

        int idx = 0;
        for(int repeat = 0; repeat < 15; repeat++)
        {
            if (repeat < arr1.length)
                System.out.print(arr1[repeat]);
            if (repeat < arr2.length)
                System.out.print(arr2[repeat]);
            if (repeat < arr3.length)
                System.out.print(arr3[repeat]);
            if (repeat < arr4.length)
                System.out.print(arr4[repeat]);
            if (repeat < arr5.length)
                System.out.print(arr5[repeat]);
        }
    }
}
