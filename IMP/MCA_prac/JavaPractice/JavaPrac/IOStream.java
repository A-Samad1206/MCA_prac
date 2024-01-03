// Class A: Represents a simple class with a static variable
class A {
    static int staticVariableA = 10;

    static {
        System.out.println("Class A is initialized!");
    }
}

// Class B: Represents another class with an instance variable
class B {
    int instanceVariableB;

    B(int value) {
        instanceVariableB = value;
    }

    void printValue() {
        System.out.println("Instance Variable B: " + instanceVariableB);
    }
}

// Main class that demonstrates the runtime data areas
public class IOStream {
    public static void main(String[] args) {
        // Method Area: Loading Class A
        System.out.println("Loading Class A");
        System.out.println("Static Variable A: " + A.staticVariableA);

        // Heap: Creating an object of Class B
        B objB = new B(42);

        // Stack: Calling a method on the object
        System.out.println("\nCalling Method on Object of Class B");
        objB.printValue();

        // PC Registers: Simple loop
        System.out.println("\nExecuting a Loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Native Method Stack: Using a native method
        System.out.println("\nCalling a Native Method");
        callNativeMethod();
    }

    // Native Method: Simulating a native method
    private static native void callNativeMethod();

    // Static Block: Executed during the initialization of the main class
    static {
        System.out.println("Static Block in Main Class is executed!");
    }
}

class Example {
    // Static variable
    public static int staticVar;

    // Constant
    public static final String CONSTANT_STRING = "Hello, World!";

    static {
        System.out.println("Static block: " + staticVar);
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
