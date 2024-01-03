class MyData {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {
        while(flag != true)
            try{wait();} catch(Exception err){}
        

        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = value;
        while(flag != false)
            try{wait();} catch(Exception err){}
        x = value;
        flag = true;
        notify();
                    
        return x;
    }
}

class Producer extends Thread {
    MyData md;
    Producer(MyData _md) {
        md = _md;
    }
    public void run() {
        int cnt = 0;
        while(true){
            md.set(cnt);
            System.out.println("  Prod: "+cnt++); 
        }
    }
}

class Consumer extends Thread {
    MyData md;
    Consumer(MyData _md) {
        md = _md;
    }
    public void run() {
        while(true)    
            System.out.println("  Cons: "+md.get()); 
    }
}

class IPC {
    public static void main(String[] args) {
        MyData md = new MyData();

        Producer pd = new Producer(md);
        Consumer cn = new Consumer(md);
        pd.start();
        cn.start();
    }
}