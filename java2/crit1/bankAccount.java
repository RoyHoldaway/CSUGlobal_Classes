public class bankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public bankAccount() {
        balance = 0.0;
    }

    // - will accept a single value double parameter; the parameter value is added to the existing balance
    public void deposit(double x) {
        balance += x;
    }

    // accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
    public void withdrawal(double x) {
        balance -= x;
    } 
    
    //Setters and getters for firstName, lastName, and accountID
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }


    //getBalance() getter to return the balance
    
    public double getBalance() {
        return balance;
    }
    //accountSummary() - prints all account information
    public void accountSummary() {
        System.out.println("Owners name: " + firstName + " " +lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Current balance: $" + balance);
    }
}