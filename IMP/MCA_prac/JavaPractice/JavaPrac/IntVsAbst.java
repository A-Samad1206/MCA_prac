abstract class User_abs {
    void show() {
        System.out.println("Hello from abstract show");
    }
}

interface IUser {
    void show();
}

class Bank {
    private int amount;
    public int get() {
        return amount;
    }    

    public void set(int amount) {
        this.amount = amount;
    }
}

class IntVsAbst {
    static int x; 
    static int y;
    
    static {
        x = 10;
        y = 20;
    }

    public static void exec(int x, int y) {
        IntVsAbst.x = x;
        IntVsAbst.y = y;
    }

    public static void main(String[] args) {
        // System.out.println("");
        exec(11,22);
        // System.out.println(x + y);

        Bank b = new Bank();

        b.set(1000);

        System.out.println("Amount in bank is: " + b.get());
    }
}