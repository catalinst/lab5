package isp.lab5.exercise1;

import java.util.Arrays;

public class Exercise1 {
    //intre bank si account avem agregare, referinta va fi in bank
    //intre card si account avem agregare, referinta va fi in account
    //intre bank si atm avem asociere, referinta va fi in atm
    //intre atm si card avem asociere, referinta va fi in atm
    //intre account si transaction avem asociere, referinta va fi in transaction
    //intre atm si transaction avem dependenta, utilizare in atm
    //intre bank si transaction avem dependenta, utilizare in bank
    //transaction e mostenita de changepin,withdraw si checkmoney

    public static void main(String[] args) {
        Card card1 = new Card("card#1", "1234");
        Card card2 = new Card("card#2", "0000");
        Card card3 = new Card("card#3", "0011");

        Account account1 = new Account("Jane", 3000, card1);
        Account account2 = new Account("Jack", 10000, card2);
        Account account3 = new Account("Joe", 4000, card3);
        Account[] accounts = new Account[]{account1, account2, account3};

        Bank bank = new Bank(accounts);
        System.out.println(Arrays.toString(bank.getAccounts()));
        System.out.println(bank.getAccountByCardId("0001")); // no account
        System.out.println(bank.getAccountByCardId("card#1"));

        System.out.println("-----------");
        System.out.println("-----------");


        ATM atm = new ATM(bank);

        if (atm.insertCard(card1, "1234") == true) {
            atm.checkMoney();
            atm.withdraw(300);
            atm.checkMoney();
            atm.changePin("****", "1133");
        } else {
            System.out.println("Password is incorrect");
        }

        atm.removeCard();
        atm.checkMoney();

        System.out.println("---- this should now not work cause we changed the PIN");

        if (atm.insertCard(card1, "1234") == true) {
            atm.checkMoney();
            atm.withdraw(300);
            atm.checkMoney();
            atm.changePin("****", "1133");
        } else {
            System.out.println("Password is incorrect");
        }

    }
}
