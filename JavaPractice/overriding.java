class A {};

class B extends A {}

abstract class X{};

class Y extends X{}

abstract class Xyz {
    int x =10;
    Xyz() {
        System.out.println("From abstrct xyz"+x);
    }
    public void meth1() {
        System.out.println("From abstrct meth1"+x);
    }
    abstract public void meth2();   
}

class Xx extends Xyz {
    int x = 11;
    public void meth2() {
        System.out.println("From class meth2 meth2 => " +super.x + " this "+this.x) ;
    } 
}

interface Ix {
    void meth1();
    // private int x = 10;
    int meth2();
}

class Ic implements Ix {
    public void meth1() {
        
    }
    public int meth2() {
        return 1;
    }
}

class Super {
    public int x = 11;
    public void display() {
    System.out.println("Super");
    }
    public A display(int x) {
    System.out.println("Super");
        return new A();
    }

    public X no() {
        return new Y();
    }
};

class Sub extends Super {
    public int x = 10;
    public B display(int x) {
        System.out.println("Sub");
        return new B();
    }
    public Y no() {
        return new Y();
    }
}

class Overriding {
    public static void main(String args[]) {
        Xyz s = new Xx();
        Ic i = new Ic();
        System.out.println("i.x = "+i.x);
    
        s.meth1();
        s.meth2();
        System.out.println(s.x);
    }
};