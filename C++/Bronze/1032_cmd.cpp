#include <iostream>
#include <string>
using namespace std;

int main()
{
    int n;
    cin >> n;
    string str;
    string test;
    cin >> str;
    for (int i = 1; i<n ; i++){
        cin >> test;
        for (int j = 0; j<test.length(); j++){
            if (str[j] != test[j]){
                str[j] = '?';
            }
        }
    }
    cout << str;
    return 0;
}