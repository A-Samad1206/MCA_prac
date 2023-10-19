#include <bits/stdc++.h>
using namespace std;

int swap(int n) {
    if(n / 10 == 0) return n;
    /*
    1.) Extract last bit by modulus
    2.) Extract first bit
          2.a) Find out length of numbers by log10
          2.b) n * 10^length -> first digit
    3.) Extract number excluding first and last
    4.)  
    */


    // n = 98562

    // log10(98562) = 4
	int digits = (int)log10(n);

    // 98562 / 10^4 = 9
    int firstDigit = (int)(n / pow(10, digits));
    
    int lastDigit = n % 10;
    
    /**
        28 % 10 -> 8
        345 % 100 -> 45
        98562 % 10000 -> 856
    */
    int numExcFirst = n % (int)pow(10, digits);
    int numExcFirstAndLast = numExcFirst / 10;

    // Add extracted last bit as first of new number
    // 10000 * 2 = 2000
    // 2000 + 856 = 2856 
    int newNum = numExcFirstAndLast * 10 + firstDigit;

    newNum = (lastDigit * pow(10, digits)) + newNum;
    
    // newNum = newNum * 10 + firstDigit;

	return newNum;
}   

bool isPerfect(int n) {
    vector<int> flags(n, 0);
    int bit = 0;

    while(n) {
        bit = n % 10;
        flags[bit]++;
        if(flags[bit] > 1) return false;
        n /= 10;
    }

    return true;
}

int appendLastToFirst(int n) {
    int length = (int)log10(n);

    int lastBit = n % 10;

    n = n / 10;
    int newNum = lastBit * pow(10, length) + n;
    return newNum;
}

int eratosthenes(int n) {
    vector<bool> sieve(true, n + 1);

    for(int p = 2; p * p <= n; p++)
        if(sieve[p])
            for(int i = p * p; i<=n ;i+=p) sieve[i] = false;
        
    int count = 0;
    for(int i = 2; i<=n; i++) if(sieve[i]) count++;

    return count;

}

int circularPrime(int n) {
    int length = (int)log10(n);

    while(--length) {
        
    }
}

// Driver program
int main() {
	int n = 12;
    cout << appendLastToFirst(1193) << endl;
    // firstDigit(n);
    // cout << swap(n) << endl;
    // cout << (isPerfect(123) ? "True" : "False") << endl;
        // cout << 592 % 100 << endl;
	// cout << firstDigit(n) ;
	return 0;
}
