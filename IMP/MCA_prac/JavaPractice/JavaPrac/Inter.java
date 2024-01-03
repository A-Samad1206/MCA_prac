
/**
 * I_XYZ
 */

 interface I_XYZ {
    void meth();
    private static void meth2() {
        System.out.println("Meth 2");
    }
    
}

class XYZ implements I_XYZ {
    public void meth() {
        
        System.out.println("From meth");
    }
}

class Inter {
    public static void main(String[] args) {
        XYZ x = new XYZ();

        x.meth();
        I_XYZ.meth2();
    }
}