public class SalaryAccount extends BankAccount{

    double creditLimit;

    @Override
    void setOwner(Customer owner) {

    }

    @Override
    boolean withdraw(double amount) {
        return false;
    }
}
