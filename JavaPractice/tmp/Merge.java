import java.util.Scanner;

public class Merge {
    public static void getFromKeyboard() {
        
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Array Size - ");
        
        int size = sn.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
           System.out.printf("Enter %dth Elem - ",i);
           arr[i] = sn.nextInt();
        }

        System.out.print("You entered :- ");
        for(int i = 0 ; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();

    }

    public static void reverse() {
        
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Array Size - ");
        
        int size = sn.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
           System.out.printf("Enter %dth Elem - ",i);
           arr[i] = sn.nextInt();
        }

        System.out.print("You entered :- ");
        for(int i = 0 ; i < arr.length; i++) System.out.print(arr[i] + " ");
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            arr[i] = arr[i] + arr[n-i];
            arr[n-1] = arr[i] - arr[n-i];
            arr[i] = arr[i] - arr[n-i];
        }
        for(int i = 0 ; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();

    }

    public static void main(String args[]) {
        // getFromKeyboard();
        reverse();
        int arr1[] = {1,2,3,4,5},arr2[] = {3,5,3,6,5};

        int arr[] = new int[arr1.length + arr2.length];
        int k = 0;
        for(int i = 0; i < arr1.length; i++) arr[k++] = arr1[i];
       
        for(int i = 0; i < arr2.length; i++) arr[k++] = arr2[i];
        
        // for(int i = 0 ; i < arr.length; i++) System.out.print(arr[i] + " ");
        // System.out.println();
    }
}