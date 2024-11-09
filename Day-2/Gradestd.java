/*  Write a JAVAprogram to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

    Percentage >= 90% : Grade A

    Percentage >= 80% : Grade B

    Percentage >= 70% : Grade C

    Percentage >= 60% : Grade D

    Percentage >= 40% : Grade E

    Percentage < 40% : Grade F
*/

import java.util.Scanner;

class Gradestd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks for Physics:");
        int physics = sc.nextInt();
        System.out.println("Enter the marks for Chemistry:");
        int chemistry = sc.nextInt();
        System.out.println("Enter the marks for Biology:");
        int biology = sc.nextInt();
        System.out.println("Enter the marks for Mathematics:");
        int mathematics = sc.nextInt();
        System.out.println("Enter the marks for Computer:");
        int computer = sc.nextInt();

        int totalMarks = physics + chemistry + biology + mathematics + computer;
        float percentage = (float) totalMarks / 5;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}

