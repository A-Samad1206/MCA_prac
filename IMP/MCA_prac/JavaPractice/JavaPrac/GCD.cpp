#include<bits/stdc++.h>
using namespace std;

int GCD(int a, int b) {
    if(b == 0) return a;

    return GCD(b, a % b);
}

int main() {
    int i = 0;
    int arr[6] = {1,2,3,4,5,6};
    for(int i = 0; i < 60; i++) {

        cout <<  arr[i % 6];
        if((i % 6) == 5) cout << endl;
    }


    // cout << GCD(4, 13) << endl;
    return 0;
}