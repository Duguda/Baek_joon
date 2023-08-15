#include <iostream>
#include <stdio.h>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    vector<int> v;
    int num;
    int i = 1;
    int j = 1;
    cin >> num;
    while (true){
        v.push_back(num%10);
        num /= 10;
        if(num==0)
            break;
    }
    sort(v.begin(),v.end());
    for (int i = 0; i<v.size(); i++){
        cout << v[(v.size() - 1 - i)];
    }
}