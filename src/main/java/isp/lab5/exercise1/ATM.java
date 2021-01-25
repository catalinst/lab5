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
            Account currentAccount = bank.getAccountByCardId(card.getCardId());
            Transaction t = new ChangePin(oldPin, newPin, currentAccount); // here we create, like what diagram said
            System.out.println(bank.executeTransaction(t));
        } else {
            System.out.println("Please insert the card");
        }
    }

    public void withdraw(double amount) {
        if (card != null) {
            Account currentAccount = bank.getAccountByCardId(card.getCardId());
            Transaction t = new WithdrawMoney(amount, currentAccount); // here we create, like what diagram said
            System.out.println(bank.executeTransaction(t));
        } else {
            System.out.println("Please insert the card");
        }
    }

    public void checkMoney() {
        if (card != null) {
            Account currentAccount = bank.getAccountByCardId(card.getCardId());
            Transaction t = new CheckMoney(currentAccount); // here we create, like what diagram said
            System.out.println(bank.executeTransaction(t));
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
