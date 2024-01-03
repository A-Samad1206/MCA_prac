abstract class My{
    abstract void display();
}

interface I_My{
      void display();
}
public class AnonymouseClass {
    public static void main(String args[]) {
        // As new My - means create an object of Abstract class, which is not allowed
        // But we are implementing it by {}
        // So it would become concrete class.
        My m = new My() {
            void display() {
                System.out.println("Hello from anonymous");
            }
        };
        I_My m1 = new I_My() {
            public void display() {
                System.out.println("Hello from anonymous");
            }
        };
        m.display();
        m1.display();       
        System.out.println("From Main Method");
    }
}


