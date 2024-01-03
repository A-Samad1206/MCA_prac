class CLS {
    public int x, y;
    CLS(int _x, int _y) {
        x = _x;
        y = _y;
    }    

    public void printValues() {
        System.out.println("X: " + x+ ", Y: " + y);
    }
    public void swap() {
        x = x + y;
        y = x - y;
        x =  x - y;
    }
    
    public void incrementValues(int incr) {
        int a = 10;
        int b = 20;
        String str = "Hello";
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("str: "+str);
        x+=incr;
        y+=incr;
    }
}

class JVM {
    public static int staticVariable = initalise();

    public static int initalise() {
        System.out.println("Initialise static variable");
        return 10;
    }
    
    static {
        System.out.println("Static initialisation block");
    }
    
    public final int final_var = 20;

    public static void main(String[] args) {
        CLS c = new CLS(10, 20);
        c.printValues();
        c.swap();
        c.printValues();
        c.incrementValues(10);
    }
}
