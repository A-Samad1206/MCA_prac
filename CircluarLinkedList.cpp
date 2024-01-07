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
    void displayRec(Node *);
    void insert(int data);
    void insertBefore(int data, int pos);
    void insertAfter(int data, int pos);
    void insertInSort(int data);

    void deleteNode(int pos);
    
    bool isSorted();
    void removeDups();

    void reverse();
    void reverseRec(Node * prev, Node *curr);
    void reverseRec1(Node * prev, Node *curr);
    Node * merge(Node * first, Node *second);
    static LL * createList(int size, int start, int incr);

    bool isLoop();
    Node * last();
    Node * nodeAt(int pos);
    void removeLoop();
};
void LL::displayRec(Node * p) {
    static int flag = 0;

    if(flag == 0 || p != root) {
        flag = 1;
        cout << p -> data << "\t";
        displayRec(p -> next);
        // cout << p -> data << "\t";
    }

    flag = 0;

}
void LL::display() {
    if(!root) return;
    Node * tmp = root;
    
    do {
        cout << tmp -> data << "\t";
        tmp = tmp -> next;
    } while(tmp != root);

    // while(tmp ->next != root){
    //     cout << tmp -> data << "\t";
    //     tmp = tmp -> next;
    // } 
    cout << endl;
}

void LL::insert(int data) {
    if(!root) {
        root = new Node(data);
        root -> next = root;
        return;
    }

    Node * tmp = root;
    
    while(tmp -> next != root)
        tmp = tmp -> next;
    
    tmp -> next = new Node(data, root);
}

void LL::insertAfter(int data, int pos) {
    Node * tmp = root;
    int i = 0;

    for(i = 0; i < pos - 1 && tmp -> next != root; i++)
        tmp = tmp -> next;

    if(pos != i + 1) return;

    tmp -> next = new Node(data, tmp -> next);
}

void LL::deleteNode(int pos) {
    if(pos <= 1) {
        // If only single node
        if(root -> next == root) {
            delete root;
            root = NULL;
            return;
        }

        Node *tmp = root, *curr = root -> next;
        while(curr -> next != root) curr = curr -> next;
        curr -> next = root -> next;
        root = root -> next;
        delete tmp;
        return;
    }

    Node * tmp = root;

    for(int i = 0; i < pos - 2 && tmp -> next != root; i++, tmp = tmp -> next);
    
    if(tmp -> next == root) return;

    Node * c = tmp -> next;
    tmp -> next = tmp -> next -> next;
    
    delete c;
}

bool LL::isSorted() {
    Node *tmp = root;

    while(tmp && tmp -> next != root) {
        if(tmp -> data > tmp -> next -> data)
            return false;
        tmp = tmp -> next;
    }
    
    return true;
}

void LL::removeDups() {
    Node * curr = root;

    while(curr -> next != root) {
        Node * next = curr -> next;

        while(next != root && curr -> data == next -> data) {
            Node * dup = next;
            next = curr -> next = dup -> next;
            delete dup;
        }

        curr = next;
    }
}

void LL::reverse() {
    Node *pre, *nxt, *curr = root;
    nxt = pre = NULL;

    do {
        nxt = curr -> next;
        curr -> next = pre;
        pre = curr;
        curr = nxt;
    } while(nxt != root);

    root = root -> next = pre;
}

void LL::reverseRec(Node * prev, Node *curr) {
    if(prev && curr == root){
        root = prev;
        curr -> next = prev;
        return;    
    }
    reverseRec(curr, curr -> next);
    if(prev) curr -> next = prev;
}

void LL::reverseRec1(Node * prev, Node *curr) {
    if(curr -> next != root){
        reverseRec(curr, curr -> next);
        curr -> next = prev;
        return;    
    }

    root = root -> next = curr;
}

Node * LL::merge(Node * first, Node *second) {
    Node * nRoot, *nTail, *f = first, *s = second;
    
    while(f -> next != first) f = f -> next;
    f -> next = NULL;
    f = first;

    while(s -> next != first) s = s -> next;
    s -> next = NULL;
    s = second;

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

    nTail -> next = nRoot;

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
    // LL * l = LL::createList(8, 1, 1), *l2 = LL::createList(7, 2, 1);

    LL *l = new LL();
    l -> insert(1);
    // l -> insert(2);
    l -> insert(3);
    // l -> insert(4);
    // l -> insert(5);
    // l -> display();
    l -> displayRec(l -> root);
    cout << endl;
    l -> reverse();
    l -> displayRec(l -> root);
    // l -> removeDups();
    // l -> display();
    // l -> reverseRec(NULL, l -> root);
    // l -> display();
    // l -> reverseRec1(l -> root, l -> root -> next);
    // l -> display();
    // l -> reverseRec(NULL, l -> root);
    // l -> display();
    // cout << (l -> isSorted() ? "Yes" : "No") << endl;
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