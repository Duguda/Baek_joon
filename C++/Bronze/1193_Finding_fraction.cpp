#include <iostream>
using namespace std;

int main()
{
    int a =1;
    int b = 1;
    int c = 1;
    int i;
    cin >> i;
    for (int j = 1; j<i; j++){
        if(c!=1){
            if(b==1){
                c--;
                a++;
            }
            else{
            b--;
            a++;
            }
        }
        else{
            if(a==1){
                c++;
                b++;
            }
            else{
            a--;
            b++;
            }
        }
    }
    cout << a << "/" << b;
    return 0;
}