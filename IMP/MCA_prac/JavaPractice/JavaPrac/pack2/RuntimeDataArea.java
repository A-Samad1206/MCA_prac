// This class represents a simple class with a static variable
class A {
    static int staticVariableA = 10;

    static {
        System.out.println("Class A is initialized!");
    }
}

// This class represents another class with an instance variable
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
public class RuntimeDataArea {
    public static void main(String[] args) {
        // Method Area: Loading Class A
        System.out.println("Loading Class A");
        System.out.println("Static Variable A: " + A.staticVariableA);

        // Heap: Creating an object of Class B
        System.out.println("\nCreating Object of Class B");
        B objB = new B(42);

        // Stack: Calling a method on the object
        System.out.println("\nCalling Method on Object of Class B");
        objB.printValue();

        // PC Registers: Simple loop
        System.out.println("\nExecuting a Loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

    }

}
