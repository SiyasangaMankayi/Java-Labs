package Lab4;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

 public BankAccount(String accountHolder, String accountNumber, double balance){
     this.accountHolder = accountHolder;
     this.accountNumber = accountNumber;
     this.balance = balance;

 }
 public void deposit(double amount) {
     if(amount>0) {
         balance = balance + amount;
         System.out.println("Successfully");
     }

else {
         System.out.println("Insufficient");
     }

 }
 public void withdraw(double amount) {
     if(amount > 0 && amount <= balance) {
         balance = balance - amount;
         System.out.println("Successfully");
     }
     else {
         System.out.println("Insufficient Withdrawal");
     }
 }
 public double getBalance() {
return balance;
 }
}
