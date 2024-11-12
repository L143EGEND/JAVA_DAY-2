import java.util.Scanner;

class Multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, R1, C1, R2, C2;

        System.out.print("Enter the number of rows for the 1st Matrix: ");
        R1 = sc.nextInt();
        System.out.print("Enter the number of columns for the 1st Matrix: ");
        C1 = sc.nextInt();

        System.out.print("Enter the number of rows for the 2nd Matrix: ");
        R2 = sc.nextInt();
        System.out.print("Enter the number of columns for the 2nd Matrix: ");
        C2 = sc.nextInt();

 
        if (C1 != R2) {
            System.out.println("Matrix multiplication is not possible. Columns of 1st matrix must equal rows of 2nd matrix.");
            return;
        }

        int a[][] = new int[R1][C1];
        int b[][] = new int[R2][C2];
        int result[][] = new int[R1][C2];  

        System.out.println("Enter elements of the 1st Matrix:");
        for (i = 0; i < R1; i++) {
            for (j = 0; j < C1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of the 2nd Matrix:");
        for (i = 0; i < R2; i++) {
            for (j = 0; j < C2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < R1; i++) {
            for (j = 0; j < C2; j++) {
                result[i][j] = 0;
                for (k = 0; k < C1; k++) { 
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("The Resultant Matrix after multiplication:");
        for (i = 0; i < R1; i++) {
            for (j = 0; j < C2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
