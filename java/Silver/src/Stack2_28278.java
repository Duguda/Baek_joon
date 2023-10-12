import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;

public class Stack2_28278 {
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        OutputStream outputStream = System.out;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);
        Stack stack = new Stack();

        int N = Integer.parseInt(br.readLine());
        int order;
        for(int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            order = Integer.parseInt(temp[0]);
            switch (order)
            {
                case 1:
                    stack.push(Integer.parseInt(temp[1]));
                    break;
                case 2:
                    bw.write(stack.pop()+"\n");
                    break;
                case 3:
                    bw.write(stack.getSize()+"\n");
                    break;
                case 4:
                    if(stack.isEmpty())
                        bw.write(1+"\n");
                    else
                        bw.write(0+"\n");
                    break;
                case 5:
                    bw.write(stack.print()+"\n");
                    break;
            }
        }
        bw.flush();
    }


}
class Stack
{
    private int[] array = new int[5];
    private int size = 0;
    public void push(int value)
    {
        if (size == array.length)
        {
            int[] temp = array;
            this.array = new int[temp.length*2];
            for (int i = 0; i < temp.length; i++)
            {
                this.array[i] = temp[i];
            }
        }
        array[size++] = value;
    }
    public int pop()
    {
        if(size == 0)
        {
            return -1;
        }
        int temp = array[--size];
        array[size] = 0;
        return temp;
    }
    public int print()
    {
        if(size == 0)
        {
            return -1;
        }
        return array[size-1];
    }
    public int getSize()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
}
