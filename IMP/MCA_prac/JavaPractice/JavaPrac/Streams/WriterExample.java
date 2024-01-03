import java.io.FileReader;
import java.io.IOException;

class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int character;

            // Reading characters from the file
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
