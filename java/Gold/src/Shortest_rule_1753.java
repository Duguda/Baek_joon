import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Shortest_rule_1753 {
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);

        OutputStream outputStream = System.out;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);

        String str = br.readLine();
        int[] digits = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        int V,E;
        V = digits[0]; E = digits[1];

        List<DestCost>[] table = new ArrayList[V+1];
        for (int i = 0; i < V+1; i++)
        {
            table[i] = new ArrayList<DestCost>();
        }
        int max = 300000;
        int start = Integer.parseInt(String.valueOf(br.readLine()));

        for (int i = 0; i < E; i++)
        {
            str = br.readLine();
            digits = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            DestCost temp = new DestCost();
            temp.dest = digits[1]; temp.cost = digits[2];
            table[digits[0]].add(temp);

        }

        int[] answer = new int[V+1];
        Arrays.fill(answer, max);
        boolean[] visit = new boolean[V+1];
        Arrays.fill(visit, false);

        answer[start] = 0;

        int tried = 0;
        do {
            tried++;

            if (!visit[start]) {
                    for (int j = 0; j < table[start].size(); j++) {
                        if (answer[table[start].get(j).dest] > answer[start] + table[start].get(j).cost) {
                            answer[table[start].get(j).dest] = answer[start] + table[start].get(j).cost;
                        }
                    }
            }
            else {
                continue;
            }
            visit[start] = true;
            int minvalue = 300000;
            for (int j = 0; j < visit.length; j++)
            {
                if (!visit[j] && answer[j] < minvalue)
                {
                    minvalue = answer[j];
                    start = j;
                }
            }

        }
        while(tried<=V);

        for (int i = 1; i < answer.length; i++)
        {
            if (answer[i] == 300000)
                bw.write(String.valueOf("INF") + "\n");
            else
                bw.write(String.valueOf(answer[i]) + "\n");
        }
        bw.flush();
    }
}

class DestCost
{
    public int dest,cost;
}