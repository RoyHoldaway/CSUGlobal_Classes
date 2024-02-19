public class checkingAccount extends bankAccount {
    public checkingAccount() {
        super();
    }
//    Has an interest rate attribute
    private double interestRate;

//    Allows overdraft withdrawals and charges a $30 fee
//    Methods:  
//    processWithdrawal() - will display a negative balance that includes a $30 overdraft fee and denotes that a fee has been accessed

    public void processWithdrawal(double x) {
        if (getBalance() - x < 0) {
            System.out.println("Your account will be charged $30 for an overdraft fee.");
            x = x + 30;
        }
        withdrawal(x);
    }

//    displayAccount() - should display all superclass attributes and provides an additional interest rate
    public void displayAccount() {
        super.accountSummary();
        System.out.println("With an interest rate of " + interestRate);
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

}