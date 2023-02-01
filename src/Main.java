public class Main {
    public static void main(String[] args) {


        Customer cst = new Customer("Dimitra", Status.ADULT);


        BankAccount a = new BankAccount() {

            @Override
            void setOwner(Customer owner) {

            }

            @Override
            boolean withdraw(double amount) {
                return false;
            }


        };
        cst.addAccount(a);

    }
}