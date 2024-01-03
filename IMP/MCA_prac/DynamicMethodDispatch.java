
class A {
    public void X() {
        System.out.println("From A");
    }
}
class B extends A {
    public void X() {
        System.out.println("From B");
    }
    public void X(int x) {
        System.out.println("From B int");
    }
}
 

class DynamicMethodDispatch {
    public static void main(String[] args) {
    A a = new B();
    // a.X(10);
    }
} 