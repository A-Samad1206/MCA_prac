import java.io.FileInputStream;

public class Index {
    public static void meth3() {
    int a = 5, b = 0;
            int z = a / b;
            System.out.println("Result is - " + z);
        
        
    }

    public static void meth2() {
        meth3();
    }
    public static void meth1() {
        meth2();
    }
    public static void main(String[] args) {
        // FileInputStream f = new FileInputStream("myText.txt");
        try {
            meth1();
        } catch(Exception e) {
            e.printStackTrace();}
        finally {
            System.out.println("Program terminated");
        }
        // System.out.println(10/0);
    }   
}