package common;

public class CarLoan {
    int carLoan = 10000;
    int loanLenth = 3;
    int interestRate = 5;
    int downPayment = 2000;
    public void prerequisites (){
        if (loanLenth<=0 || interestRate <=0){
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment>=carLoan){
            System.out.println("The car can be paid in full.");
        } else{
            int remainingBalance = carLoan-downPayment;
            int months = loanLenth*12;
            int monthlyBalance = remainingBalance/months;
            int interest = (monthlyBalance*interestRate)/100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your monthly payment is " + monthlyPayment + " dollars.");
        }
    }
    public static void main(String[] args) {
        CarLoan calculator = new CarLoan ();
        calculator.prerequisites();
    }
}
