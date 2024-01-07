#include<bits/stdc++.h>
using namespace std;

class Node {
    public:
    int data;
    Node * next;
    Node(int _data = 0, Node * _next = NULL) {
        data = _data;
        next = _next;
    }
};

class LL {
    public:
    Node * root;
    LL(Node * _r = NULL) {
        root = _r;
    }
    
    void display();

    void insert(int data);
    void insertBefore(int data, int pos);
    void insertAfter(int data, int pos);
    void insertInSort(int data);

    void deleteNode(int pos);
    
    bool isSorted();
    void removeDups();

    void reverse();

    void reverseRec(Node * prev, Node *curr);

    Node * merge(Node * first, Node *second);

    static LL * createList(int size, int start, int incr);

    bool isLoop();
    Node * last();
    Node * nodeAt(int pos);

    void removeLoop();
};
void LL::insert(int data) {
    if(!root) {
        root = new Node(data);
        return;
    }
    Node * tmp = root;
    while(tmp -> next) tmp = tmp -> next;
    tmp -> next = new Node(data);
}
void LL::display() {
    Node * tmp = root;
    while(tmp) {
        cout << tmp -> data << "\t";
        tmp = tmp -> next;
    }
    cout << endl;
}


void LL::insertAfter(int data, int pos) {
    Node * tmp = root;
    for(int i = 0; i < pos - 1 && tmp; i++)
        tmp = tmp -> next;
    if(!tmp) return;
    tmp -> next = new Node(data, tmp -> next);
}


void LL::deleteNode(int pos) {

    if(pos <= 1) {
        Node * c = root;
        root = root -> next;
        delete c;
        return;
    }

    Node * tmp = root;

    for(int i = 0; i < pos - 2 && tmp; i++, tmp = tmp -> next);

    if(!tmp -> next) return;
    Node * c = tmp -> next;
    tmp -> next = tmp -> next -> next;
    
    delete c;
}
 

 

bool LL::isSorted() {
    Node *tmp = root;
    while(tmp && tmp -> next) {
        if(tmp -> data > tmp -> next -> data) return false;
        tmp = tmp -> next;
    }
    return true;
}

void LL::removeDups() {
    Node * curr = root;

    while(curr) {
        Node * next = curr -> next;
        while(next && curr -> data == next -> data) {
            Node * dup = next;
            next = curr -> next = dup -> next;
            delete dup;
        }
        curr = next;
    }
}

void LL::reverse() {
    Node *pre = NULL, *curr, *nxt;
    curr = root;
    nxt = curr -> next;

    while(curr) {
        nxt = curr -> next;
        curr -> next = pre;
        pre = curr;
        curr = nxt;
    }

    root = pre;
}


void LL::reverseRec(Node * prev, Node *curr) {
    if(curr) {
        reverseRec(curr, curr -> next);
        curr -> next = prev;
        return;
    }
    root = prev;
}
Node * LL::merge(Node * first, Node *second) {
    Node * nRoot, *nTail, *f = first, *s = second;
    
    if(f -> data < s -> data){
        nRoot = nTail = f;
        f = f -> next;
    } else {
        nRoot = nTail = s;
        s = s -> next;
    }

    while(f && s) {
        if( f -> data < s -> data ) {
            nTail -> next = f;
            f = f -> next;
        } else {
            nTail -> next = s;
            s = s -> next;
        }
        nTail = nTail -> next;
    }

    for(; f; nTail -> next = f, f = f -> next, nTail = nTail -> next);
    for(; s; nTail -> next = s, s = s -> next, nTail = nTail -> next);

    nTail -> next = NULL;

    return nRoot;
}

LL * LL::createList(int size, int start, int incr = 1) {
    LL * l = new LL();
    int i = 1;
    while(i <= size) l -> insert(i + start), i+=incr;
    return l;
}

bool LL::isLoop() {
    Node * slow, *fast;
    slow = fast = root;

    while(slow && fast && fast -> next){
        slow = slow -> next;
        fast = fast -> next -> next;

        if(slow == fast) return true;
    }

    return false;
}

Node * LL::last() {
        Node * root = this -> root;
        for(;root -> next;root = root -> next);
        return root;
    }
Node * LL::nodeAt(int pos) {
    Node *tmp =root;

    for(int i = 0; i < pos - 1 && tmp; i++, tmp = tmp -> next);

    return tmp;
}

void LL::removeLoop() {
        Node *slow, *fast;
        slow = fast = root;

        while(slow && fast && fast -> next) {
            slow = slow -> next;
            fast = fast -> next -> next;

            if(slow == fast) break;
        }

        if(!slow || !fast) return;

        slow = root;

        while(slow != fast){
            slow = slow -> next;
            fast = fast -> next;
        }

        slow = root;

        while(slow -> next != fast) slow = slow -> next;

        slow -> next = NULL;
    } 


int main() {
    LL *ll = new LL();
    ll -> insert(10);
    ll -> insert(20);
    ll -> insert(30);
    ll -> insert(40);
    
    ll -> display();
    // ll -> insertAfter(222,3);
    ll -> display();
    ll -> deleteNode(5);
    ll -> display();

    return 0;

    // LL * l = LL::createList(8, 1, 1), *l2 = LL::createList(7, 2, 1);
    // l -> display();
    // l -> last() -> next =l -> last();
    // cout << ( l -> isLoop() ? "Yes" : "No") << endl;
    // l -> removeLoop();
    // cout << ( l -> isLoop() ? "Yes" : "No") << endl;
    // l -> display();
    // l2 -> display();
    // LL * l3 = new LL(l->merge(l -> root,l2 -> root));
    // l3 -> display();
    return 0;
}