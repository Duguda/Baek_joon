import java.util.Arrays;
import java.util.Scanner;

public class Find_Math_1920 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // 배열 크기 정의
        for (int i = 0; i <n; i++) arr[i] = sc.nextInt(); // 배열 채우기
        Arrays.sort(arr); // 이진탐색을 위해 정렬.
        int m = sc.nextInt();
        int judge = 0;
        for (int i = 0; i < m; i++,judge = 0)
        {
            if(BinarySearch(arr,sc.nextInt())>=0)
            {
                judge = 1;
            }
            System.out.println(judge);
        }


    }
    // 이진탐색을 이용.
    public static int BinarySearch(int[] arr, int key)
    {
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi)
        {
            int mid = (lo+hi)/2;

            if (key < arr[mid])
            {
                hi = mid - 1;
            }
            else if (key > arr[mid])
            {
                lo = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
