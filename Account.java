import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
    private String accountNumber;
    private int balance;

    private List<TransactionLog> transactions = new ArrayList<>();

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
            transactions.add(new TransactionLog(LocalDate.now(), amount, balance, TransactionLog.TxType.DEPOSIT));
        } 
        else {
            throw new RuntimeException("Negative money for real?!");
        }
    }

    @Override
    public void withdraw(int amount) {
        if(amount <= balance) {
            this.setBalance(balance - amount);
            transactions.add(new TransactionLog(LocalDate.now(), -amount, balance, TransactionLog.TxType.WITHDRAWAL));
        } 
        else {
            throw new RuntimeException("Not enough funds!\nTransaction declined!");
        }
    }

    @Override
    public void printStatement() {
        if(!transactions.isEmpty()) {
            System.out.printf("%-12s || %-10s || %-10s || %-10s\n", "Date", "Amount", "Balance", "Tx Type");
            for (TransactionLog tx : transactions) {
                System.out.printf("%-12s || %-10d || %-10d || %-10s\n", tx.getTxDate(), tx.getTxAmount(), tx.getNewBalance(), tx.getType());
            }
        }

        else {
            System.out.println("This account doesn't have any transaction yet! Deposit some money gee!");
        }
    }

}
