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

 
 

class TMP {
    
    public static final int X;

    static {
        System.out.println("From TMP");
        X = 10;
    }

    public static final int ST;
    static {
        ST = 111;
    }
     {
        System.out.println("From flower");    
    }
    
    final int Y;
    { 
        Y = 1111;
    }
}

public class Static extends TMP {
    Static() {
        System.out.println("From Sattci constj");
    } 
   
    
    public static void main(String args[]) {

    }
}