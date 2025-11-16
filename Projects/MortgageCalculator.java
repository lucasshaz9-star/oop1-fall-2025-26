package Projects;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double salary=0;
    int creditScore=0;
    boolean criminalRecord=false;
    double principalLoan=0;

    
    while(true){
    System.out.print("Enter your monthly salary (BDT): ");
    if(sc.hasNextDouble()){
        salary=sc.nextDouble();
        if(salary>0) break;
        else System.out.println("Invalid! salary must be >0");
    }else{
        System.out.println("Invalid input!! enter numbers only");
        sc.next();
    }
    }

   
    while(true){
        System.out.print("Enter your credit score (0-500): ");
        if(sc.hasNextInt()){
            creditScore=sc.nextInt();
            if(creditScore>=0 && creditScore<=500) break;
            else System.out.println("Credit score should be between 0 to 500!");
        }else{
            System.out.println("Invalid input! enter a number pls");
            sc.next();
        }
    }

    
    while(true){
        System.out.print("Do you have any criminal record? (true/false): ");
        if(sc.hasNextBoolean()){
            criminalRecord=sc.nextBoolean();
            break;
        }else{
            System.out.println("Invalid! Type true or false only");
            sc.next();
        }
    }

    
    while(true){
        System.out.print("Enter loan amount you wish to take (BDT): ");
        if(sc.hasNextDouble()){
            principalLoan=sc.nextDouble();
            if(principalLoan>0) break;
            else System.out.println("Loan must be greater than zero!");
        }else{
            System.out.println("Invalid amount! numbers only");
            sc.next();
        }
    }

    boolean goodCredit=creditScore>=300;
    boolean loanLimitOk=principalLoan<=2*salary;
    boolean eligible=goodCredit && !criminalRecord && loanLimitOk;

    if(!eligible){

     System.out.println("\nYou are NOT eligible for a mortgage!");
     if(!goodCredit) System.out.println("- Credit score below 300");
    if(criminalRecord) System.out.println("- You have criminal record");
    if(!loanLimitOk) System.out.println("- Loan > 2x salary");
      System.out.println("Try again later!");
     return;
    }

    System.out.println("\nCongrats! You are eligible.");

    double annualRate=0;
    while(true){
        System.out.print("Enter annual interest rate (%): ");
        if(sc.hasNextDouble()){
            annualRate=sc.nextDouble();
            if(annualRate>0) break;
            else System.out.println("Rate must be >0");
        }else{
            System.out.println("Invalid input!");
            sc.next();
        }
    }

    int years=0;
    while(true){
        System.out.print("Enter loan period (years): ");
        if(sc.hasNextInt()){
            years=sc.nextInt();
            if(years>0) break;
            else System.out.println("Years must be positive!");
        }else{
            System.out.println("Invalid input! enter integer");
            sc.next();
        }
    }

    double r=annualRate/100/12;
    int n=years*12;
    double M=principalLoan*(r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1);
    double totalPayment=M*n;
    double totalInterest=totalPayment-principalLoan;

    System.out.println("\n========= Mortgage Summary =========");
    System.out.println("Salary: BDT "+salary);
    System.out.println("Loan Amount: BDT "+principalLoan);
    System.out.println("Interest Rate: "+annualRate+"%");
    System.out.println("Loan Term: "+years+" years");
        System.out.println("Monthly Payment: BDT" + M);
    System.out.println("Total Payment: BDT " +totalPayment);
    System.out.println("Total Interest: BDT " +totalInterest);

    }
}


    
