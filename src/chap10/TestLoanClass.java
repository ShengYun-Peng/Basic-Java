package chap10;

import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan is created on %s \nThe monthly payment is %.2f \nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());

    }
}
