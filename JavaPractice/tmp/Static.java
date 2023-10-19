import java.util.Date;

class Test {   
    {
        System.out.println("From test class non static block");
    }
    static {
        System.out.println("From first Test static block");
    }
    static {
        System.out.println("From second Test static block");
    }
}



interface Tmp {
    int X = 10;
}

class SingleTon {
    private SingleTon() {
        System.out.println("Hello");
    }
    static private SingleTon ref = null;
    public static SingleTon getInstancSingleTon() {
        if(ref == null) ref = new SingleTon();
        return ref;
    }
}

class TMP {
    
    public static final int X;

    static {
        X = 10;
    }

    public static final int ST;
    static{
        ST = 111;
    }
}

public class Static implements Tmp {
    // public static int X;
    final int Y;
    {
        // X = 11;
        Y = 1111;
    }

    {

    }
    
    static {
        System.out.println("Hello " + X);
    }

    public static void main(String args[]) {
        Date d = new Date();
        System.out.println(d.getDate() + " - " + d.getMonth() + " - " + (d.getYear() + 1900));
        // SingleTon sn = SingleTon.getInstancSingleTon();

        // Test t = new Test();
        System.out.println("From main method");
    }
}