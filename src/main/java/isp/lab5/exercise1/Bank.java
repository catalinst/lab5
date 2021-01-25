package isp.lab5.exercise1;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public String executeTransaction(Transaction t) {
        return t.execute(); // here we use, like what diagram said
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
