package Lab4;

public class BankAccountMain {
    void main() {
        BankAccount account = new BankAccount("Manayzna", "137688686876", 50000);

        account.deposit(1000);
        System.out.println("Deposited " + "R1000 " + "Avail Amount is: " + account.getBalance());

        account.deposit(0);
        System.out.println("Avail Amount: " + account.getBalance());

        account.withdraw(40000);
        System.out.println("Avail Amount: " + account.getBalance());
        account.withdraw(80000);
        System.out.println("Avail Amount: " + account.getBalance());

    }
}
