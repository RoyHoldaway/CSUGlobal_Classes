public class testAccount {
    public static void main(String[] args) {
        bankAccount bankAccount1 = new bankAccount();
        bankAccount1.setFirstName("Daberious");
        bankAccount1.setLastName("Jones");
        bankAccount1.setAccountID(90802989);
        bankAccount1.deposit(1000);
        bankAccount1.withdrawal(900);
        bankAccount1.accountSummary();

        checkingAccount checkingAccount1 = new checkingAccount();
        checkingAccount1.setFirstName("Daberious");
        checkingAccount1.setLastName("Michael");
        checkingAccount1.setAccountID(90802990);
        checkingAccount1.setInterestRate(0.45);
        checkingAccount1.deposit(1000);
        checkingAccount1.processWithdrawal(1500);
        checkingAccount1.displayAccount();
    }
}