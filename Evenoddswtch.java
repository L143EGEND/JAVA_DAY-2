import java.util.Scanner;

class Evenoddswtch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 2; 
        System.out.println("Enter a number:");
        n = sc.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println("The given number is Even: ");
                break;
            case 1:
                System.out.println("The given number is Odd: ");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
