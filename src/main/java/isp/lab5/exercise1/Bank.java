package isp.lab5.exercise1;

public class Bank {
    private Account[] accounts;

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public String executeTransaction(Transaction t) {
        return "I'm not having a clue what this should do";
    }

    public Account getAccountByCardId(String cardId) {
        for (Account account : accounts) {
            if (account.getCard().getCardId().equals(cardId)) {
                return account;
            }
        }
        return null;
    }
}
