#include <iostream>
#include <queue>

using namespace std;

#define MAX 1001
int N,M,V;
int map[MAX][MAX];
bool check[MAX];
queue<int> q;

void reset() 
{
    for (int i = 1; i <= N; i++)
    {
        check[i] = 0;
    }
}

void dfs(int v)
{
    check[v] = true;
    cout << v << " ";

    for (int i = 1; i <= N; ++i)
    {
        if (map[v][i] == 1 && check[i] == 0)
        dfs(i);
    }
}

void bfs(int v)
{
    q.push(v);
    check[v] = true;
    cout << v << " ";

    while (!q.empty())
    {
        v = q.front();
        q.pop();

        for (int w = 1; w<= N; w++)
        {
            if (map[v][w] == 1 && check[w] == 0)
            {
            q.push(w);
            check[w] = true;
            cout << w << " ";
            }
        }
    }
}

int main()
{
    cin >> N >> M >> V;

    for (int i = 0; i < M; ++i)
    {
        int a, b;
        cin >> a >> b;

        map[a][b] = 1;
        map[b][a] = 1;
    }

    reset();
    dfs(V);

    cout << endl;

    reset();
    bfs(V);

    return 0;
}