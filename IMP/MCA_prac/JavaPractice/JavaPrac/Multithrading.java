
// One way by extending Thread class
class Loop extends Thread {
    public Loop(String name) {
        super(name);
        setPriority(MAX_PRIORITY);
    }
    public Loop() {
    }
    public void run() {
        int i = 0;
        while(true) {
            if(i / 50 == 0 ) {
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException err) {
                    System.out.println(err);
                }
            }
            if(i == 30) interrupt();
            System.out.println("Hello => " + i++) ;
        }
    }
}

class ConsumeThread {
    public void main() {
            Loop l = new Loop("My thread");

            l.start(); // If this is not invoken state would be NEW
            System.out.println("Name: " + l.getName());
            System.out.println("Id: " + l.getId());
            System.out.println("State: "+ l.getState());
            System.out.println("Priority: " + l.getPriority());
            System.out.println("Alive: "+l.isAlive());
            System.out.println("Daemon: "+l.isDaemon());
            
            // System.out.println("Daemon: "+l.isDaemon());
            int i = 0;
            
            // while(true) 
            //     System.out.println("World: " + i++);

    }    
}


// Second way by extending Thread class
class Loop2 extends Thread{
    public void run() {
        int i = 0;
        while (true)
            System.out.println("Hello: " + i++);
    }
    public void main() {
        Loop2 l = new Loop2();

        l.start();
        int i = 0;
        while(true) 
            System.out.println("World: " + i++);
    }
}




// By implementing Runnable
class Loop3 implements Runnable {
    public void run() {
        int i = 0;
        while(true) 
            System.out.println("Hello: " + i++);
    }
}


// By implementing Runnable
class Loop4 implements Runnable {
    public void run() {
        int i = 0;
        while(true) 
            System.out.println("Hello: " + i++);
    }
    public void main() {
        Thread l = new Thread(new Loop4());
        l.start();
    }
}

class Multithrading {
    public static void main(String[] args) {
        ConsumeThread c = new ConsumeThread();
        c.main();

        // Loop2 l = new Loop2();
        // l.main();

        // Thread l = new Thread(new Loop3());
        // l.start();
        try{
        // Loop4 l = new Loop4();
        // l.main();
        double x = Math.sqrt(-1);
        System.out.println(x);  
        }
        catch(NoClassDefFoundError err) {
            System.out.println("Hello from err: " + err.getMessage() );
            System.out.println(err.getLocalizedMessage());
            System.out.println(err.hashCode());
            System.out.println(err.fillInStackTrace());
        }
    }
}

