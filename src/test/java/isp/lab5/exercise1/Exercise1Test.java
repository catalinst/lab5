package isp.lab5.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1Test {

    private Card card1 = new Card("card#1", "1234");
    private Card card2 = new Card("card#2", "0000");
    private Card card3 = new Card("card#3", "0011");

    private Account account1 = new Account("Jane", 3000, card1);
    private Account account2 = new Account("Jack", 10000, card2);
    private Account account3 = new Account("Joe", 4000, card3);
    private Account[] accounts = new Account[]{account1, account2, account3};
    private Bank bank = new Bank(accounts);
    private ATM atm = new ATM(bank);

    @Before
    public void testInsertCard() {
        assertTrue("The pin should be correct", atm.insertCard(card2, "0000"));
    }

    @Test
    public void testCheckMoney() {
        atm.checkMoney();
        assertEquals("Jack should have 10000 dollars", 10000, account2.getBalance(), 0);
    }

    @Test
    public void testWithdraw() {
        atm.withdraw(3000);
        assertEquals("Jack should have 7000 dollars", 7000, account2.getBalance(), 0);
    }

    @Test
    public void testChangePin() {
        account2.getCard().setPin("1234");
        assertEquals("Card's new pin should be 1234", "1234", account2.getCard().getPin());
        assertEquals("Card's new pin should be 1234", "1234", card2.getPin());
    }

    @Test
    public void testRemoveCard() {
        atm.removeCard();
        assertNull("Now we should have no card inside atm", atm.getCard());
    }

    @Test
    public void testGetAccountByCardId() {
        assertEquals("The user with this card should be account3", account3, bank.getAccountByCardId("card#3"));
    }
}