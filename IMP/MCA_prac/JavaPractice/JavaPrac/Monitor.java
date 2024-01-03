class MyData  {
    void display(String str) {
        synchronized(this) {
            for(int i = 0; i < str.length(); i++)
                System.out.print(str.charAt(i));
         
        }
    }

    synchronized void display1(String str) {
            for(int i = 0; i < str.length(); i++)
                System.out.print(str.charAt(i));
    }
}

class Th1 extends Thread {
    MyData md;
    Th1(MyData d) {
        md = d;
    }

    public void run() {
        md.display("Hello World!");
    }
} 

class Th2 extends Thread {
    MyData md;
    Th2(MyData d) {
        md = d;
    }

    public void run() {
        md.display("XXXXXXXXX");
    }
} 

class Monitor {
    public static void main(String[] args) {
        Th1 t1 = new Th1(new MyData()); Th2 t2 = new Th2(new MyData());
        // MyData md = new MyData();
        // Th1 t1 = new Th1(md); Th2 t2 = new Th2(md);
        
        t1.start();
    t2.start();
    }
}