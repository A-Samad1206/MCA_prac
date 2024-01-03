/**
 * InnerInterface
 */

  interface InnerInterface {
    public final static  int x = 10;
    final public static int y = 10; 
    void meth1();
    private void pvt_meth() {
        System.out.println("From InnerInterface");
    }



    default void pvt_static_meth1() {
        
    }
}

//   interface InnerInterface2 implements InnerInterface {
//     int x = 1111;

//     void meth1();
//     void meth2();
// }

class Imp_I implements InnerInterface {
    // x = 1111;
    public void meth1() {
        System.out.println("Helo");
    }
    public void meth2() {
        System.out.println("Helo");
    }
    public void pvt_meth() {
        System.out.println("From Tmp_I");
    } 
    public void pvt_static_meth1() {
       System.err.println("csdj");
    }
}

class Interface {
    public static void main(String[] args) {
        InnerInterface i = new Imp_I();
        i.meth1();
        // Imp_I.pvt_meth();
        // i.pvt_meth();
        // Imp_I
    // System.out.println(Imp_I.x);
        // i.meth2();
    }
}