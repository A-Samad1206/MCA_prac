#include<bits/stdc++.h>
using namespace std;
bool isPrime(int number) {
    if (number <= 1) {
        return false;  // 0 and 1 are not prime numbers
    }

    int sqrtNumber = sqrt(number);
    for (int i = 2; i <= sqrtNumber; ++i) {
        if (number % i == 0) {
            return false;  // If number is divisible by any number between 2 and sqrt(number), it's not prime
        }
    }

    return true;  // If no divisors are found, the number is prime
}


int main() {
    int n = 1000;
    bool flags[n]={0};
    for(int i = 0; i < 100; i++) flags[i] = isPrime(i);
    
    for(int i = 0; i < 100; i++) cout<< flags[i] << endl;

    
    return 0;
}