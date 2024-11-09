// Write a JAVAprogram to count total number of notes in given amount.

import java.util.Scanner;

class Amountc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount:");
        int amount = sc.nextInt();

        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        int[] noteCount = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCount[i] = amount / notes[i];  
                amount = amount % notes[i]; 
            }
        }
        System.out.println("Total number of notes:");
        for (int i = 0; i < notes.length; i++) {
            if (noteCount[i] != 0) {
                System.out.println("RS."+notes[i] + " : " + noteCount[i] + " notes");
            }
        }
    }
}
