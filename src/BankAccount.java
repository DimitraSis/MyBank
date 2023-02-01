abstract public class BankAccount {

    double balance;
    Customer owner;

    abstract void setOwner(Customer owner);

    abstract boolean withdraw(double amount);

    int getId() {
        return 0;
    }

    void deposit(double amount) {

    }


    public double getBalance() {
        return balance;
    }

    public Customer getOwner() {
        return owner;
    }
}
