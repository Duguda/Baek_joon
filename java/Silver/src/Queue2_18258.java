import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;

public class Queue2_18258 {
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        OutputStream outputStream = System.out;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);
        Queue queue = new Queue();

        int N = Integer.parseInt(br.readLine());
        String order;
        for(int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            order = temp[0];
            switch (order)
            {
                case "push":
                    queue.push(Integer.parseInt(temp[1]));
                    break;
                case "pop":
                    bw.write(queue.pop()+"\n");
                    break;
                case "size":
                    bw.write(queue.getSize()+"\n");
                    break;
                case "empty":
                    if(queue.isEmpty())
                        bw.write(1+"\n");
                    else
                        bw.write(0+"\n");
                    break;
                case "front":
                    bw.write(queue.front()+"\n");
                    break;
                case "back":
                    bw.write(queue.back()+"\n");
                    break;
            }
        }
        bw.flush();
    }
}
class Queue
{
    private int[] array = new int[5];
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    public void push(int value) {
        if (size >= array.length)
        {
            resize(array);
        }
        array[rear] = value;
        rear = (rear + 1) % array.length;
        size++;
    }
    public int pop()
    {
        if (size == 0)
            return -1;
        int temp = array[front];
        array[front] = 0;
        front = (front + 1) % array.length;
        size--;
        return temp;
    }
    public int getSize()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public int front()
    {
        if (isEmpty())
            return -1;
        return array[front];
    }
    public int back()
    {
        if (isEmpty())
            return -1;
        return array[(array.length+rear-1) % array.length];
    }
    public void resize(int[] array)
    {
        this.array = new int[array.length*2];
        for (int i = 0; i < size; i++)
        {
            this.array[i] = array[(front+i)%array.length];
        }
        front = 0;
        rear = size;
    }
}