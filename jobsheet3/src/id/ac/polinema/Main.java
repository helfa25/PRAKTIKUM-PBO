package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Account limited = new Account("A005", "Fajar", 1000000, 200000);
        System.out.println("Withdraw 300000 allowed? " + limited.withdraw(300000));
        limited.withdraw(150000);
        limited.printInfo();
    }
}