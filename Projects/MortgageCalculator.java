package Projects;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter loan amount : ");
    double P = Sc.nextDouble();

     System.out.print("Enter annual interest rate: ");
        double annualRate = Sc.nextDouble();

    System.out.print("Enter loan period (in years): ");
     int years = Sc.nextInt();

        double r = annualRate / 100 / 12;  
     int n = years * 12;                 

 double M = P * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1); 
double totalPayment = M * n;
 double totalInterest = totalPayment - P;

  System.out.println();
  System.out.println(" Mortgage Summary ");
     System.out.println("Loan Amount: BDT" + P);
    System.out.println("Monthly Payment: BDT" + M);
    System.out.println("Total Payment: BDT" + totalPayment);
     System.out.println("Total Interest: BDT" + totalInterest);

        
    }
}



 


        


    

