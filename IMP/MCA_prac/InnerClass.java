class A {
    class B {
        B() {
            System.out.println("From B");
        }
    }
}
class InnerClass {
    A a = new A();
    A.B b = new A().new B();
    A.B b1 = a.new B();
    // a.B b1 = a.new B(); not allowed

}
