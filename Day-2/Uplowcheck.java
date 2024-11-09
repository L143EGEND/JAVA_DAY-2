// Write a JAVAprogram to check whether a character is uppercase or lowercase  alphabet.

import java.util.Scanner;

class Uplowcheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase alphabet.");
        }

        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase alphabet.");
        }
        
        else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
