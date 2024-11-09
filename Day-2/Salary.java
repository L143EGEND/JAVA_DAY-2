/*  Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross     salary according to following:

    BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%

    BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%

    BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
*/

import java.util.Scanner;

class Salary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the basic salary of the employee:");
        double basicSalary = sc.nextDouble();

        double HRA = 0, DA = 0, grossSalary = 0;

        if (basicSalary <= 10000) {
            HRA = 0.20 * basicSalary; 
            DA = 0.80 * basicSalary;  
        } else if (basicSalary <= 20000) {
            HRA = 0.25 * basicSalary; 
            DA = 0.90 * basicSalary;  
        } else {
            HRA = 0.30 * basicSalary; 
            DA = 0.95 * basicSalary;  
        }
        grossSalary = basicSalary + HRA + DA;

        System.out.println("Basic Salary: " +"RS."+ basicSalary);
        System.out.println("HRA: " +"RS."+HRA);
        System.out.println("DA: " +"RS."+ DA);
        System.out.println("Gross Salary: " +"RS."+ grossSalary);
    }
}
