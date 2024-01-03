
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

class StringPrac {
        public static void isEqual(String A) {
            A = "111";
        }
        
    public static void main(String[] args) {
        A a = new B();
        a.X(10);
        // Scanner sn = new Scanner(System.in);
        // String str = sn.nextLine();

        // System.out.println(str);
        // char x = 0x03c8;
        // for(int  i = 0; i < Character.MAX_VALUE; i++)  
        //     System.out.println((char)i); 
        String A = new String("Hello World");
            A = "111";

        // StringPrac.isEqual(A);
        // System.out.println(A);
    }
}