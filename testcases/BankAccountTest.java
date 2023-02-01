import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void setOwner() {
    }

    @Test
    void withdraw() {
        BankAccount ba = new SalaryAccount (new Customer("Signe",Status.ADULT),10000);
        ba.withdraw(100);
        double b = ba.getBalance();
        assertEquals(-100,b);
    }

    @Test
    void getId() {
    }

    @Test
    void deposit() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void getOwner() {
    }
}