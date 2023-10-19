import java.util.Scanner;

class Numericals {
    static public boolean isArmstrong(int n) {
        int tmp = n,sum = 0;

        // It would take log10(n) time.
        int len = (int)Math.log10(n) + 1;
        
        while(tmp > 0) {
            sum+=Math.pow(tmp % 10,len);
            tmp /= 10;
        }
            
        return sum == n;
    }

    static boolean isAutomorphic(int N)
    {
        if(N < 0) N = -N;
        int sq = N * N;
        while (N > 0) {
            if (N % 10 != sq % 10)
                return false;
            N /= 10;
            sq /= 10;
        }
  
        return true;
    }
  
    static boolean isAutomorphicByBi(int N) {
        // Store the square
        if(N < 0) N = -N;
        int sq = N * N;
        int ans = sq | N;
        int ans2 = ans & N;
        // System.out.println(Integer.toBinaryString(N));
        // System.out.println(Integer.toBinaryString(sq));
        // System.out.println(Integer.toBinaryString(ans));
        // System.out.println(Integer.toBinaryString(ans2));
       return ans2 == N;
    }
  
    static void listAutomorphicByBi(int N) {
        for(int i = 1; i <= N; i++) {
            boolean one = isAutomorphic(i), two = isAutomorphicByBi(i);

            if(one ^ two) {
                System.out.println(one + " " + two);
                System.out.println(i);
            }
        }
    }

    static int shiftFirstToLast(int n) {
        int len = (int)Math.log10(n);

        int firstBit = n / (int)Math.pow(10, len);

        int excNum = n % (int)Math.pow(10, len);

        excNum = excNum * 10 + firstBit;
        
        return excNum; 
    }
    
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
 
        // Check if n=2 or n=3
        if (n == 2 || n == 3)
            return true;
 
        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;
 
        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
            System.out.println(n % i);
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }  
        return true;
    }
 
    static boolean circularPrime(int N) {
        int len = (int)Math.log10(N);
        int tmp = N;
        for(int i = 0; i < len; i++) {
            tmp = shiftFirstToLast(tmp);
            System.out.println(tmp);
        }
        return true;
    }

    static public boolean isEmail(String email) {
        return email.startsWith("gmail",email.indexOf('@') + 1);
    }

    static public String removeExtra(String str) {
        return str.replaceAll("[^a-zA-Z0-9]","");
    }
    static public void main(String arg[]) {
        // int arr[] = {1,2,3,4,5};
        // System.out.println(arr);
        // // for(int i = 10,x=0; i < 1000 && x<10; System.out.println(x),i++,x++);
        // System.out.println(isEmail("xyz@gmail.com"));
        // System.out.println(removeExtra("a@b#n$m%"));
        // float x = 13f;
        //         float x1 = 13f;

        // System.out.println(x);
        // Scanner s = new Scanner(System.in);
        // int x = s.nextInt(10);
        // int x;

        // boolean x1 = s.hasNextInt(10);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println();
    }
}

