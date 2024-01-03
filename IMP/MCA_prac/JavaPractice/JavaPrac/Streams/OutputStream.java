import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class OutputStream {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("./File.txt")) {

            fos.write('A'); // 65 equivaent in UNICODE is A, as UNICODE is backward compatible with ASCII.
            fos.write('Z'); // 65 equivaent in UNICODE is A, as UNICODE is backward compatible with ASCII.
            // fos.write(65 + 32); // 97 ==> 'a'
            String str = "ABCDEF";

            fos.write(str.getBytes());

            byte[] data = "0123456789".getBytes();
            fos.write(data); // [6, 8) means [6,7]
            // Offset means intial 6 or from 0 to 5 index.

            fos.flush();
        } catch (FileNotFoundException err) {

            System.out.println(err);

        } catch (IOException err) {

            System.out.println(err);

        }

    }
}