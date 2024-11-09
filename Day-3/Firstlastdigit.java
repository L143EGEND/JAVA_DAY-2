// Write a JAVAprogram to find first and last digit of a number.

import java.util.Scanner;

class Firstlastdigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int Lastdigit = number % 10;

        int Firstdigit = number;
        while (Firstdigit >= 10) {
            Firstdigit = Firstdigit / 10;  
        }
        System.out.println("The first digit is: " + Firstdigit);
        System.out.println("The last digit is: " + Lastdigit);
    }
}
