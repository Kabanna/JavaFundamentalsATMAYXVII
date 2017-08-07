package ua.org.oa.anna_shevelieva.practice_1.Task10;

import java.util.Scanner; 

public class BankLoan {

public static void main(String[] args) {
    // declare variables for main method
    double loanAmount; //double value loan amount 
    double annualInterestRate;//double value interest rate
    int numberOfMonths; //int value for number of months
    double monthlyPayment;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the amount of your loan.");
    loanAmount = keyboard.nextDouble();

    System.out.println("Please enter the annual interest rate as a decimal. Ex. 7.5% = .075");
    annualInterestRate = keyboard.nextDouble();

    System.out.println("Please enter the number of months you have to pay back your loan.");
    numberOfMonths = keyboard.nextInt();

}

public static double calcMonthlyInterestRate(double annualInterestRate){
    double monthlyInterestRate;
        monthlyInterestRate = (annualInterestRate/12);
        return monthlyInterestRate;
}//end method CalcMonthlyInterestRate

    public static double calcMonthlyPayment(double monthlyInterestRate, double loanAmount, int            numberOfMonths     ){
    double monthlyPayment;
    double calcMonthlyPayment;
        calcMonthlyPayment = (monthlyInterestRate*loanAmount)/(1-(1+monthlyInterestRate)-numberOfMonths);
        return monthlyPayment = calcMonthlyPayment;
}//end method CalcMonthlyPayment

public static void loanStatment (double loanAmount, double annualInterestRate, int numberOfMonths,  double monthlyPayment){
 System.out.println("Your loan amount is " +loanAmount);
 System.out.println(annualInterestRate);
 System.out.println(numberOfMonths);
 System.out.println(monthlyPayment);
  }

 }//end main method
