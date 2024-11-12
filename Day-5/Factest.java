// Factorial number by using user defined method(no return value,with argument value)

class Factorial {


    void mul(int n) {
        int f1 = 1;
        for (int i = 1; i <= n; i++) {
            f1 =f1*i;
        }
        System.out.println("The factorial of " + n + " is: " + f1);
    }
}

public class Factest {
    public static void main(String args[]) {
        int n=7;
        Factorial f1 = new Factorial();
        f1.mul(n);  
    }
}
