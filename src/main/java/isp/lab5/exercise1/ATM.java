package isp.lab5.exercise1;

public class ATM {
    private Bank bank;
    private Card card;

    public ATM (Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void changePin(String oldPin, String newPin) {
        if (card != null) {
            Transaction t = new ChangePin(oldPin, newPin);
            System.out.println(t.execute());
            bank.getAccountByCardId(card.getCardId()).getCard().setPin(newPin);
        } else {
            System.out.println("Please insert the card");
        }
    }

    public void withdraw(double amount) {
        if (card != null) {
            Transaction t = new WithdrawMoney(amount);
            System.out.println(t.execute());
            bank.getAccountByCardId(card.getCardId()).setBalance(bank.getAccountByCardId(card.getCardId()).getBalance() - amount);
        } else {
            System.out.println("Please insert the card");
        }
    }

    public void checkMoney() {
        if (card != null) {
            Transaction t = new CheckMoney();
            System.out.println(t.execute());
            double money = bank.getAccountByCardId(card.getCardId()).getBalance();
            System.out.println(money);
        } else {
            System.out.println("Please insert the card");
        }
    }

    public boolean insertCard(Card card, String pin) {
        if (card.getPin().equals(pin)) {
            this.card = card;
            return true;
        }
        return false;
    }

    public void removeCard() {
        this.card = null;
    }
}
