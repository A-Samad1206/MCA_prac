
interface IDisplay {
    void display();
}

class ConsumeLambda {
    void callLambda(IDisplay m) {
        m.display();
    }
}

class Lambda {
    int value = 10;

    public static void main(String[] args) {
        ConsumeLambda c = new ConsumeLambda();
        c.callLambda(() -> System.out.println("Helo"));
    }
}