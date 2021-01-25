package isp.lab5.exercise1;

public class WithdrawMoney extends Transaction {
    public double amount;

    public WithdrawMoney(double amount, Account account) {
        super(account);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String execute() {
        if (getAccount().getBalance() > amount) {
            getAccount().setBalance(getAccount().getBalance() - amount);
            return "You withdraw: " + amount + ", your new balance: " + getAccount().getBalance();
        } else {
            return "Not enough founds";
        }
    }
}
