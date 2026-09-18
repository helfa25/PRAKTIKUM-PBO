package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Uji Kelas Customer & Account ===");
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        Account acc1 = new Account("A001", customer1, 500000);
        acc1.withdraw(150000);
        acc1.printInfo();

        System.out.println("\n=== Uji Kelas Bank ===");
        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        Account acc2 = new Account("A002", customer2, 200000);

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.printAllAccounts();

        System.out.println("\nHasil Pencarian A002:");
        Account found = bank.findAccount("A002");
        if (found != null) {
            found.printInfo();
        }

        System.out.println("\n=== Uji Tugas Mandiri (Pencarian Nama) ===");
        Account acc3 = new Account("A003", customer1, 1500000);
        bank.addAccount(acc3);

        System.out.println("Mencari rekening atas nama 'Nadia':");
        Account[] nadiasAccounts = bank.findAccountsByOwnerName("Nadia");
        for (Account acc : nadiasAccounts) {
            acc.printInfo();
        }
    }
}