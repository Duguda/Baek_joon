#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    char str[1000000];
    int count=1;
    scanf("%[^\n]s",&str);
    for (int i = 0; i<strlen(str); i++){
        if(str[i] == ' ')count++;
    }
    if (str[0] == ' ')count--;
    if (str[strlen(str)-1] == ' ')count--;
    cout << count << endl;
    return 0;
}