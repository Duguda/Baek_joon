#include <iostream>
using namespace std;

int main()
{
    int v, const_v, var;
    int count = 0;
    int c_1, c_10;
    cin >> v;
    const_v = v;
    c_10 = v/10;
    c_1 = v%10;
    var = c_10 + c_1;
    if(var >= 10){
        var %= 10;
    }
    count++;
    c_10 = c_1;
    c_1 = var;
    while ((c_10*10+c_1) != const_v){
        var = c_10 + c_1;
        if(var >= 10){
            var %= 10;
        }
        c_10 = c_1;
        c_1 = var;
        count++;
    }
    cout << count;
    return 0;
}