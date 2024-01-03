public class NativeMethodExample {

    // Native method declaration
    private native void callNativeMethod();

    // Static block to load the native library
    static {
        System.loadLibrary("NativeLibrary");
    }

    // Java method calling the native method
    public void performOperation() {
        System.out.println("Java method: Performing operation before native call");
        callNativeMethod();
        System.out.println("Java method: Performing operation after native call");
    }

    // Main method to demonstrate the example
    public static void main(String[] args) {
        NativeMethodExample example = new NativeMethodExample();
        example.performOperation();
    }
}