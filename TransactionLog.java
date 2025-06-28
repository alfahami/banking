import java.time.LocalDate;

public class TransactionLog {
    private LocalDate txDate;
    private int txAmount;
    private int newBalance;

    public static enum TxType { DEPOSIT, WITHDRAWAL };
    private TxType type;


    public TransactionLog(LocalDate txDate, int txAmount, int newBalance, TxType type) {
        this.txDate = txDate;
        this.txAmount = txAmount;
        this.newBalance = newBalance;
        this.type = type;
    }

    public LocalDate getTxDate() {
        return this.txDate;
    }

    public void setTxDate(LocalDate txDate) {
        this.txDate = txDate;
    }

    public int getTxAmount() {
        return this.txAmount;
    }

    public void setTxAmount(int txAmount) {
        this.txAmount = txAmount;
    }

    public int getNewBalance() {
        return this.newBalance;
    }

    public void setNewBalance(int newBalance) {
        this.newBalance = newBalance;
    }


    public TxType getType() {
        return this.type;
    }

    public void setType(TxType type) {
        this.type = type;
    }

}
