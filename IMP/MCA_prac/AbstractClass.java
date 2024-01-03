
abstract class Abst_cls {
    int x =10;
    Abst_cls() {
        System.out.println("From abstrct Abst_cls"+x);
    }
    public void meth1() {
        System.out.println("From abstrct meth1"+x);
    }
    abstract public void meth2();   
}

class Xx extends Abst_cls {
    int x = 11;
    Xx() {
        System.out.println("From concrete");
    }
    public void meth1() {
        System.out.println("From concrete meth1"+x);
    }
    public void meth2() {
        System.out.println("From class meth2 meth2 => " +super.x + " this "+this.x) ;
    }
    public void meth3() {
        System.out.println("From class meth2 meth2 => " +super.x + " this "+this.x) ;
    }
}

class AbstractClass {
    public static void main(String[] args) {
        // Abstract is just like other class but can not be instantiated
        Abst_cls s = new Xx();
        s.meth1(); // Can participate in Dynamic Method Dispatch
        
    }
}