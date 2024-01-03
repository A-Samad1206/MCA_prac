import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {

            int num = sn.nextInt();

            // int to long - This type widening in implicit
            long factorial = 1;

            for (int i = num; i > 0; i--)
                factorial *= i;

            System.out.println("Factorial: " + factorial);
            System.out.println("Factorial: " + factorialRecursive(num));
        }
    }

    static long factorialRecursive(int n) {
        if (n > 1)
            return n * factorialRecursive(n - 1);

        return 1;
    }
}
