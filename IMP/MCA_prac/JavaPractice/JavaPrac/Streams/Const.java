class Parent {
    Parent() {
        System.out.println("Hello from parameter less const");
    }

    Parent(int z) {
        System.out.println("Hello from parameter-ised const: " + z);
    }

    void meth1() {
        System.out.println("");
    }
}

class Tmp extends Parent {
    int x, y;

    Tmp(int _x, int _y) {
        super(_x);
        System.out.println("From Constructor");
        x = _x;
        y = _y;
    }

    void display() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

class Const {
    public static void main(String[] args) {
        new Tmp(10, 13);
    }
}