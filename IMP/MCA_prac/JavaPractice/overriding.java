class A {};

class B extends A {}

abstract class X{};

class Y extends X{}

class Super {
    public int x = 11;
    public void display() {
    System.out.println("Super");
    }
    public A display(int x) {
    System.out.println("Super");
        return new A();
    }
    public X no() {
        return new Y();
    }
};

class Sub extends Super {
    public int x = 10;
    public B display(int x) {
        System.out.println("Sub");
        return new B();
    }
    public Y no() {
        return new Y();
    }
}

class Overriding {
    public static void main(String args[]) {
        Xyz s = new Xx(); 
    
        s.meth1();
        s.meth2();
        System.out.println(s.x);
    }
};