import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class InputStream {
    public static void main(String[] args) {
        try {

            // in single go
            try (FileInputStream fis = new FileInputStream("./File.txt")) {
                System.out.println("In single shot");
                byte b[] = new byte[fis.available()];
                fis.read(b); // Read from input stream upto b.length bytes.
                System.out.println(new String(b));
            }

            // with while loop
            try (FileInputStream fis = new FileInputStream("./File.txt")) {
                System.out.println("Using while loop");
                for (int x = fis.read(); x != -1; x = fis.read())
                    System.out.print((char) x);
            }

            // Using offset
            try (FileInputStream fis = new FileInputStream("./File.txt")) {
                System.out.println("\nUsing offset");
                byte b[] = new byte[fis.available()];
                fis.read(b, 1, fis.available() - 1); // offset work from read-end.
                System.out.println(new String(b));
            }

            // Using skip
            try (FileInputStream fis = new FileInputStream("./File.txt")) {
                System.out.println("Using skip");
                byte b[] = new byte[fis.available()];
                fis.skip(2);
                fis.read(b);
                System.out.println(new String(b));
            }

            // Using mark, reset and markSupported
            try (FileInputStream fis = new FileInputStream("./File.txt")) {
                System.out.println("Using mark, reset and markSupported");

                if (fis.markSupported())
                    fis.mark(4);

                // If supported put a mark on index 0, up to 4

                System.out.println((char) fis.read());
                System.out.println((char) fis.read());
                System.out.println((char) fis.read());

                // if yes, then on next read, we would be get byte from index 0.
                if (fis.markSupported())
                    fis.reset();
            }

        } catch (FileNotFoundException err) {
            System.out.println(err);
        } catch (IOException err) {
            System.out.println(err);
        }
    }
}
