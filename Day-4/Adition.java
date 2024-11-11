// addition matrix

import java.util.Scanner;

class Adition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, R, C;

        System.out.print("Enter the number of rows: ");
        R = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        C = sc.nextInt();
        
        int a[][] = new int[R][C];
        int b[][] = new int[R][C];

        System.out.println("Enter elements of 1st Matrix:");
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                a[i][j] = sc.nextInt(); 
             }
        }
        System.out.println("Enter elements of 2nd Matrix:");
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                a[i][j] = sc.nextInt();  
            }
        }

        System.out.println("The Adition Matrix:");
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                System.out.println("Result:"+" "+a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
