package isp.lab5.exercise1;

public class WithdrawMoney extends Transaction {
    public double amount;

    public WithdrawMoney(double amount) {
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
        return "Withdraw " + amount;
    }
}
