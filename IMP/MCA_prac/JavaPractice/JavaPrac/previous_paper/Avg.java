import java.util.Scanner;

class Avg {
    public static void main(String[] args) {

        try (Scanner sn = new Scanner(System.in)) {
            int avg = 0;

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter " + (i + 1) + " elem");
                avg += sn.nextInt();
            }

            avg = avg / 3;

            System.out.println("Avg: " + avg);

        }
    }
}