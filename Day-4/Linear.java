// in linear search 

import java.util.Scanner;

class Linear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, ser = 70;  
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();

        int a[] = new int[n];  

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();  
        }

        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            if (a[i] == ser) {
                System.out.println(ser + " is found at position " + (i + 1));
                found = true;
                break;  
            }
        }

        if (!found) {
            System.out.println(ser + " is not found");
        }
        
        sc.close();  
    }
}
