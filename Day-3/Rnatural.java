// Write a JAVAprogram to print all natural numbers in reverse (from n to 1). -     using while loop

import java.util.Scanner;

class Rnatural {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int i = sc.nextInt();

        while (i > 0) {
            System.out.println("The Numbers are:"+i);
            i--;  
        }
    }
}
