import java.util.Scanner;

class First {
         
    
    public static void main(String arg[]) {
      
        int arr[] = { 1, 7, 9, 3, 2};
        int tmp = 0;
        System.out.print("Before Sorting - ");
        for(int i = 0; i < 5; i++) System.out.print(arr[i] + " ");
        
        for(int i = 0; i < 5 - 1; i++) {                
            for(int j = 0; j < 5 - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }  
            }
        }
        

        System.out.print("\nAfter Sorting - ");
        for(int i = 0; i < 5; i++) System.out.print(arr[i] + " ");
            
        
        Scanner sn = new Scanner(System.in);

        System.out.println("\nEnter the number");

        int item = sn.nextInt();

        boolean isFound = false;
        
        for(int i = 0; i < 5; i++) 
            if(arr[i] == item) isFound = true;

        if(isFound) {
            System.out.println("Yes Exist");
        }
        else {
            System.out.println("Not Exist");
        }
    }
        
}