import java.util.ArrayList;

public class Customer {

    private String name;
    private Status status;
    private int id;
    ArrayList<BankAccount> accounts;

    private static int IDcount= 1;

    public Customer(String name, Status status) {
        this.name = name;
        this.status = status;
        this.id = IDcount;
        IDcount++;
    }


    void addAccount(BankAccount account){

        this.accounts.add(account);
    }

   void remove(BankAccount account){

        this.accounts.remove(account);

   }

    public void setName(String name) {

        this.name = name;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {

        return name;
    }

    public Status getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }
}
