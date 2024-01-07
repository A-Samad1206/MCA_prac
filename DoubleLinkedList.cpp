#include<bits/stdc++.h>
using namespace std;

class Node {
    public:
    int data;
    Node *prev, *next;
    Node(int _data = -1, Node *_prev = NULL, Node *_next = NULL) {
        prev = _prev;
        next = _next;
        data = _data;
    }
};  

class DLL {
    public:
    Node * root;
    DLL(Node * _root = NULL) {
        root = _root;
    }

    void display();
    void insert(int data);
    void insertAfter(int data,int pos);
    void deleteNode(int pos);
    void reverse();
    bool isLoop();

    void removeLoop();

    Node* merge(Node*, Node*);
    Node* middle();

    Node* intersection(Node*, Node*);
};

int main() {
    DLL * dll = new DLL();

    dll -> insert(8);
    dll -> insert(6);
    dll -> insert(3);
    dll -> insert(9);
    dll -> insert(10);
    dll -> insert(4)    ;
    dll -> insert(2);
    dll -> insert(12);
    dll -> display();

    DLL * dll1 = new DLL();

    dll1 -> insert(20);
    dll1 -> insert(30);
    dll1 -> insert(40);
    // dll1 -> root -> next -> next -> next =  dll -> root;

    dll1 -> display();
    Node * interset = dll -> intersection(dll -> root, dll1 -> root) ;
    cout <<  (interset  ? interset -> data : 0)<< endl; 
    return 0;
}

Node* DLL::intersection(Node *first, Node *second) {

    int x =0, y = 0;
    Node * p = first ,  *q = second;

    while(p || q) {
        if(p) x++, p = p -> next;
        if(q) y++, q = q -> next;
    }
    
    int  i =  x > y ? x - y : y - x;
    p = x > y ? first : second;
    q = x > y ? second : first;

    while(i > 0) p = p -> next, i--;
    while(p != q) {
        p = p -> next;
        q = q -> next;
    }

    return p;
}


Node* DLL::middle() {
    Node *slow, *fast;
    slow = fast = root;

    while(slow && fast && fast -> next && fast -> next -> next) {
        slow = slow -> next;
        // if(!fast -> next -> next) return slow;
        fast = fast -> next -> next;
    }

    return slow;
}

Node* DLL::merge(Node *first, Node *second) {
    Node * f = first, *s = second, *newRoot, *newTail;

    if(f -> data < s -> data) {
        newTail = newRoot = f;
        f = f -> next;
    }
    else {
        newTail = newRoot = s;
        s = s -> next;
    }

    while(f && s) {
        if(f -> data < s -> data){
            newTail -> next = f;
            f = f -> next;
        } else {
            newTail -> next = s;
            s = s -> next;
        }

        newTail -> next -> prev = newTail;
        newTail = newTail -> next;
    }

    while(f) {
        newTail -> next = f;
        f = f -> next;
        newTail -> next -> prev = newTail;
        newTail = newTail -> next;
    }
    while(s) {
        newTail -> next = s;
        s = s -> next;
        newTail -> next -> prev = newTail;
        newTail = newTail -> next;
    }
    newTail -> next = NULL;
    return newRoot;
}

void DLL::removeLoop() {
    Node * slow = root, *fast = root;

    while(slow && fast && fast -> next) {
        slow = slow -> next;
        fast = fast -> next -> next;
        if(fast == slow) break;
    }
    if(!slow || !fast || slow != fast) return;

    slow = root;

    while(slow != fast) {
        slow = slow -> next;
        fast = fast -> next;
    }

    while(slow -> next != fast) slow = slow -> next;
    slow -> next = NULL;
}

bool DLL::isLoop() {
    Node * slow = root, *fast = root -> next;

    while(slow && fast && fast -> next) {
        slow = slow -> next;
        fast = fast -> next -> next;
        if(fast == slow) return true;
    }
    return false;
}

void DLL::reverse() {
    Node * prev = root, *next = root -> next;

    while(next) {
        prev -> next = prev -> prev;
        prev -> prev = next;
        prev = next;
        next = next -> next;        
    } 

    root = prev;
    prev -> next = prev -> prev;
    prev -> prev = NULL;
}

void DLL::deleteNode(int pos) {
    if(!root) return;

    if(pos <= 1) {
        Node *x = root;

        root = root -> next;
        if(root) root -> prev = NULL;
        return;
    }

    int i = 0; 
    Node * tmp = root;

    while(i < pos - 2 && tmp) tmp = tmp -> next, i++;

    if(!tmp -> next) return;

    Node * x = tmp -> next;
    tmp -> next = tmp -> next -> next;
    if(tmp -> next) tmp -> next -> prev = tmp;
    delete x;
}

void DLL::insertAfter(int data, int pos) {
    if(pos <= 0) {
        root -> prev = new Node(data, NULL, root);
        root = root -> prev;
        return;
    }

    Node * tmp = root;

    int i = 0; 

    for(; i < pos - 1 && tmp; tmp = tmp -> next, i++);
    
    if(!tmp) return;

    tmp -> next = new Node(data, tmp, tmp -> next);
}

void DLL::insert(int data) {
    if(!root) {
        root = new Node(data);
        return;
    }

    Node * tmp = root;

    while(tmp -> next) tmp = tmp -> next;

    tmp -> next = new Node(data,tmp);
}

void DLL::display() {
    Node * tmp = root;
    while(tmp) {
        cout << tmp -> data << "\t";
        tmp = tmp -> next;
    }

    cout << endl;
}