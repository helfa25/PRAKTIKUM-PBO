package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Pengujian SavingsAccount (Overriding & Overloading) ===");
        Customer customer1 = new Customer("Rian", "0812-0000-0003");
        SavingsAccount savings = new SavingsAccount("A003", customer1, 100000, 0.02);
        boolean withdrawSavings = savings.withdraw(70000);
        System.out.println("Withdraw 70000 allowed? " + withdrawSavings);
        savings.deposit(50000, "Initial top-up");
        savings.printInfo();

        System.out.println("\n=== 2. Pengujian CheckingAccount (Overriding Overdraft) ===");
        Customer customer2 = new Customer("Dewi", "0812-0000-0004");
        CheckingAccount checking = new CheckingAccount("A004", customer2, 100000, 200000);
        boolean withdrawChecking = checking.withdraw(250000);
        System.out.println("Withdraw 250000 allowed? " + withdrawChecking);
        checking.printInfo();

        System.out.println("\n=== 3. Pengujian Tugas Mandiri BusinessAccount (Overriding Min. Balance 1jt) ===");
        Customer customer3 = new Customer("Budi", "0812-0000-0005");
        BusinessAccount business = new BusinessAccount("B001", customer3, 2000000, 25000);
        boolean withdrawBusiness = business.withdraw(1500000);
        System.out.println("Withdraw 1500000 allowed? " + withdrawBusiness);
        business.printInfo();

        System.out.println("\n=== 4. Pengujian Polimorfisme pada Bank ===");
        Bank bank = new Bank(10);
        bank.addAccount(savings);
        bank.addAccount(checking);
        bank.addAccount(business);
        bank.printAllAccounts();
    }
}
