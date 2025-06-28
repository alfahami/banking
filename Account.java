public class Account implements AccountService {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        if(amount >= 0) {
            this.setBalance(this.balance + amount);
        } 
        else {
            System.out.println("Negative money! You aight!?");
        }
    }

    @Override
    public void withdraw(int amount) {
        if(amount <= balance) {
            this.setBalance(balance - amount);
        } 
        else {
            System.out.println("Not enough funds!");
        }
    }

    @Override
    public void printStatement() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printStatement'");
    }

}
