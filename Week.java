import java.util.Scanner;

class Week {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a Number:");
        a=sc.nextInt();
        if (a==1) {
            System.out.println("SUNDAY");
        }
        else if (a==2) {
            System.out.println("MONDAY");
        }
        else if (a==3) {
            System.out.println("TUESDAY");
        }
        else if (a==4) {
            System.out.println("WEDNESDAY");
        }
        else if (a==5) {
            System.out.println("THURSDAY");
        }
        else if (a==6) {
            System.out.println("FRIDAY");
        }
        else if (a==7) {
            System.out.println("SATURDAY");
        } 
        else {
            System.out.println("Given Number is Invalid");
        }

    }
}
