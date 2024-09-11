import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.sql.SQLOutput;
import java.util.PriorityQueue;

public class PrintQueue_1966 {
    static class Node implements Comparable<Node> {
        int value;
        int priority;

        public Node(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }

        public int getValue() {
            return value;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(o.getPriority(), this.getPriority());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Node> pQ = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        String[] arr;
        String[] values;

        for (int i = 0; i < N; i++) {
            arr = br.readLine().split(" ");
            values = br.readLine().split(" ");

            for (int j = 0; j < values.length; j++) {
                pQ.offer(new Node(j, Integer.parseInt(values[j])));
            }

            for (int j = 1, target = Integer.parseInt(arr[1]), value; j <= values.length; j++) {
                value = pQ.remove().getValue();

                if (value == target) {
                    System.out.println(j);
                    break;
                }
            }
            pQ.clear();
        }
    }
}
