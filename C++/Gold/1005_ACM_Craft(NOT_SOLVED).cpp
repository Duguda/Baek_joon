#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int T = 0;
    cin >> T;

    for (int i = 0; i < T; ++i)
    {
        cout << solution();
    }
}

int solution()
{
    int ans = 0;
    int n , k;
    cin >> n >> k;
    int temp1, temp2;
    vector<int> Temp1;
    vector<int> Temp2;
    vector<int> Time;
    vector<int> Need;
    
    for (int i = 0; i < n; ++i)
    {
        int v;
        cin >> v;
        Time.push_back(v);
    }
    for (int i = 0; i < k; ++i)
    {
        cin >> temp1 >> temp2;
        Temp1.push_back(temp1);
        Temp2.push_back(temp2);
    }   

    int win;
    cin >> win;

    int i = 0;
    while (i != win)
    {
        
    }

    return ans;
}