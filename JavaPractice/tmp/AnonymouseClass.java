abstract class My{
    abstract void display();
}


public class AnonymouseClass {
    public static void main(String args[]) {
        My m = new My() {
            void display() {
                System.out.println("Hello from anonymous");
            }
        };
        m.display();       
        System.out.println("From Main Method");
    }
}
