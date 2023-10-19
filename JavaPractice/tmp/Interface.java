interface IUser {
    int x = 10;
    void meth1();
    default void meth2() {
        System.out.println("Hello" );
    }
}

abstract class AbsUser implements IUser {}

interface My {
   abstract public void display();
}

class User implements IUser {
    interface MyX {
        abstract public void display();
    }
    
    int x = 11;   
    class Inner {    
        public interface MyX {
            abstract public void display();
        }
        public void innerDisplay() {
            System.out.println("From inner display");
        }
    }
    public void meth1() {   
        My my = new My() {
            public void display() {
                System.out.println("Hello");
            }
        };   
        my.display();
        
        My my1 = new My() {
            public void display() {
                System.out.println("Hello");
            }
        };
        my1.display();
        
        class $InnerLocal {
            public void innerDisplay() {
                System.out.println("From inner display");
            }
        }
        $InnerLocal i = new $InnerLocal();
        i.innerDisplay();        
        System.out.println("Hello from meth1");
        meth1(10);
    }

    private int meth1(int x) {
        class $InnerLocal {
            public void innerDisplay() {
                System.out.println("From inner display");
            }
        }
        $InnerLocal i = new $InnerLocal();
        i.innerDisplay();        
        System.out.println("Hello from meth1");
        return 1;
    }
}

class X {
    public abstract class IX {
        abstract public void display();
    }
    interface IUU {
        void abc();
    }

    class  UU implements IUU {
        void abc() {

        }
    }
    public int x = 10;
}

public class Interface {
    public static void main(String args[]) {

        // User u = new User();
        // User.Inner i =  u.new Inner();
        // User.MyX = new User().new MyX() {
        //     void display() {
        //         System.out.println("From ");
        //     }
        // }; 

        X xx = new X();
        X.IX m = new X().new IX() {
            public void display() {

            }
        };
        // u.meth1();
    }
}