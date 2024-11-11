// 2-D arry

import java.util.Scanner;
    class Multi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, R, C;

        System.out.print("Enter the number of Rows: ");
        R = sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        C = sc.nextInt();
        int a[][] = new int[R][C];

        System.out.println("Enter elements of the array:");
        for (i = 0; i < R; i++) {
        for (j = 0; j < C; j++) { 
        a[i][j] = sc.nextInt();
        }
        }
        System.out.println("The Elements in array:");
        for (i = 0; i < R; i++) {
        for (j = 0; j < C; j++) {
            System.out.println(a[i][j]);
        }
         System.out.println();  
    }
}
}
