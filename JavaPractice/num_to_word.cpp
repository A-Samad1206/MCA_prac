#include<bits/stdc++.h>
using namespace std;

int lakh = 100000, thoudands = 1000,hunndered = 100;
string evaluate(int num) {
    if(num >= lakh) return "lakhs";
    if(num >= thoudands) return "thousands";
    if(num >= hunndered) return "hundereds";
    return "dummy";
}

unordered_map<int, string> word = {
    {1,"one"},
    {2,"two"},
    {3,"three"},
    {4,"four"},
    {5,"five"},
    {6,"six"},
    {7,"seven"},
    {8,"eight"},
    {9,"nine"},
    {10,"ten"}
};

unordered_map<int, string> word_2 = {
    {11,"eleven"},
    {12,"twelve"},
    {13,"thirteen"},
    {14,"fourteen"},
    {15,"fifteen"},
    {16,"sixtenn"},
    {17,"seventenn"},
    {18,"eighteen"},
    {19,"nineteen"},
    {20,"twenty"},
    {30,"thirty"},
    {40,"fourty"},
    {50,"fifty"},
    {60,"sixty"},
    {70,"seventy"},
    {80,"eighty"},
    {90,"ninety"},
};

int main() {
    int x = 408576;
    for(int i = x; i;) {
        int len = log10(i);
        int digit = i / pow(10, len);
        cout << word[digit] << " " << evaluate(i) << " ";
        
        i = i % (int)pow(10, len);
    }
    // cout << len << endl;
    return 0;
}