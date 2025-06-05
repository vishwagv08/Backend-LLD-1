package org.example.L1_IntroToOOP;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
//        This will not work because attributes are private
//        bankAccount.name = "vishwa";
//        bankAccount.balance = 1000;

        bankAccount.setName("vishwa");
        bankAccount.setBalance(1000);

        bankAccount.deposit(50000);
        bankAccount.deposit(-10);

        bankAccount.withdraw(10000);
        bankAccount.withdraw(-20);
        bankAccount.withdraw(100000000);
        bankAccount.showTransaction();
    }
}
