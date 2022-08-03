#include <iostream>

using namespace std;

int main()
{
    int N,M;
    cin >> N >> M;
    int strong_B = 0;
    int strong_W = 0;
    char current;
    char cur;
    int count = 0;
    for (int i = 0; i < N; ++i)
    {
        for (int j = 0; j < M; ++j)
        {
            cin >> current;
            if (current == 'W' && count == 0)
            {
                cur = current;
                count++;
                
            }
            if (current == 'W' && count != 0){
                if (cur == current)
                {
                count++;
                }
                else 
                {
                strong_W += count * count;
                count = 0;
                }
                }
            else 
            {
                if(count == 0){
                cur = current;
                count++;
                }
            if (count != 0){
                if (cur == current)
                {
                count++;
                }
                else 
                {
                strong_B += count * count;
                count = 0;
                }
            }
            }
        }
    }

    cout << strong_B << " " << strong_W;
}