package isp.lab5.exercise1;

public class ChangePin extends Transaction {
    public String oldPin;
    public String newPin;

    public ChangePin(String oldPin, String newPin, Account account) {
        super(account);
        this.oldPin = oldPin;
        this.newPin = newPin;
    }

    public String getNewPin() {
        return newPin;
    }

    public void setNewPin(String newPin) {
        this.newPin = newPin;
    }

    public String getOldPin() {
        return oldPin;
    }

    public void setOldPin(String oldPin) {
        this.oldPin = oldPin;
    }

    @Override
    public String execute() {
        if (getAccount().getCard().getPin().equals(oldPin)) {
            getAccount().getCard().setPin(newPin);
            return "Pin changed successfully";
        } else {
            return "Pin wasn't changed";
        }
    }
}
