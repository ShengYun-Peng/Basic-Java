package chap10;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() { loanDate = new Date(); }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getMonthlyPayment() {
        return loanAmount * (1 + annualInterestRate / 100.0);
    }

    public double getTotalPayment() {
        return loanAmount * (1 + annualInterestRate / 100.0) * numberOfYears;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }
}
