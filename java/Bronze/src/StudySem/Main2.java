package StudySem;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args)
    {
        Test t = new Test(5);
        System.out.println(Arrays.toString(t.getArray()));
        t.setArray(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(t.getArray()));
    }

}
