import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class ToggleCase {
    public static void main(String[] args) {
        try {

            try (FileInputStream fis = new FileInputStream("./File.txt")) {
                try (FileOutputStream fos = new FileOutputStream("./File1.txt")) {
                    System.out.println("Change cases");
                    for (int x = fis.read(); x != -1; x = fis.read())
                        if (x >= 65 && x <= 65 + 25)
                            fos.write(x + 32);
                        else
                            fos.write(x - 32);
                }
            }
        } catch (FileNotFoundException err) {
            System.out.println(err);
        } catch (IOException err) {
            System.out.println(err);
        }
    }
}
