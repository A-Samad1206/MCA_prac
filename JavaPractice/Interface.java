interface IUser {
    int x = 10;
    public abstract void meth1();
    // public abstract int meth1(int);
    public static void meth2() {
        System.out.println("Hello");
    }
}

class User implements IUser {
    int x = 11;
    public void meth1() {
        System.out.println("Hello from meth1");
        meth1(10);
    }
    private int meth1(int x) {
        System.out.println("Hello from meth1 int");
        return 1;
    }   
}

public class Interface {
    public static void main(String args[]) {
        User u = new User();
        u.meth1();
    }
}
