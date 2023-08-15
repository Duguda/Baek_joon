#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    char a[10000];
    char b[10000];
    int count = 0;
    while (true){
        cin >> a;
        if (a[0] == '0'){
            break;
        }
        for (int i = 0; i < strlen(a); i++){
            b[strlen(a)- 1 - i] = a[i];
        }
        for (int j = 0; j<strlen(a); j++){
            if(a[j] == b[j]){
                count++;
            }
        }
        if (count == strlen(a)){
            cout << "yes" << endl;
            count = 0;
        }
        else {
            cout << "no" << endl;
            count = 0;
        }
    }
    return 0;
}