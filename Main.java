public class Main {
    public static void main(String[] args) {
        AccountStore accountStore = new AccountStore();

        accountStore.createAccount(new Account("AAA111", 0));
        Account account = accountStore.retrieveAccount("AAA111");

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        account.printStatement();

        accountStore.createAccount(new Account("AAA222", 0));

        account.withdraw(958000); // Trying to withdraw an exceeding amount
        
        account.deposit(-1000); // Trying to deposit a negative amount
    }
    



}
