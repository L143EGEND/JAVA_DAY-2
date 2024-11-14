// Method to calculate factorial with return value and argument

class FactorialCalculator {
    int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Factori {
    public static void main(String args[]) {
        int number = 5; 
        FactorialCalculator fc = new FactorialCalculator();
        
       
        int fact = fc.factorial(number);
        
        System.out.println("The factorial of " + number + " is: " + fact);
    }
}
