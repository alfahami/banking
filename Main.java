public class Main {
    public static void main(String[] args) {
        AccountStore accountStore = new AccountStore();

        accountStore.createAccount(new Account("AAA111", 0));
        Account account = accountStore.retrieveAccount("AAA111");

        account.deposit(500);
        account.deposit(2000);
        account.withdraw(300);
        account.printStatement();

    }
    



}
