// Write a JAVAprogram to count number of digits in a number.

import java.util.Scanner;

class Digitcount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();
        
        int i = 0;
        int num = number; 

        while (num != 0) {
            num = num / 10;  
            i++;         
        }
        System.out.println("The number of digits in " + number + " is: " + i);
    }
}
