public class InitializationExample {
    public static int x = initializeX();

    static {
        System.out.println("Static Initialization Block 1");
    }

    static {
        System.out.println("Static Initialization Block 2");
    }

    static {
        init();
    }

    static {
        System.out.println("Static Initialization Block 3");
    }

    public static void init() {
        System.out.println("Initializing...");
    }

    public static int initializeX() {
        System.out.println("Initializing x via static method");
        return 10;
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
