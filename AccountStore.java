import java.util.ArrayList;

public class AccountStore {
    private ArrayList<Account> datastore = new ArrayList<>();

    public Boolean createAccount(Account account) {
        return this.datastore.add(account);
    }

    public Account retrieveAccount(String accountNumber) {
        return findAcount(accountNumber);
    }

    public Boolean removeAccount(String accountNumber) {
        return datastore.remove(findAcount(accountNumber));
    }

    private Account findAcount(String accountNumber) {
        for (Account account : datastore) {
            if(account.getAccountNumber().equals(accountNumber)) 
            return new Account(account); // use of deep copy to protect  return the exact object stored in our ArrayList
        }
        throw new RuntimeException("Account not found!");
    }
}
