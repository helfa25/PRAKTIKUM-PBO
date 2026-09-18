package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        // =======================================================================
        // 💡 1. MENGUJI CUSTOMER DAN ACCOUNT (RELASI ASSOCIATION)
        // =======================================================================
        System.out.println("=== Uji Kelas Customer & Account ===");
        
        // Buat objek nasabah dulu
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        
        // Buat akun dan masukkan objek nasabah ke dalam akun (relasi)
        Account acc1 = new Account("A001", customer1, 500000);
        acc1.withdraw(150000); // Tarik saldo untuk pengujian
        acc1.printInfo();

        // =======================================================================
        // 💡 2. MENGUJI KELAS BANK (RELASI AGGREGATION & ARRAY)
        // =======================================================================
        System.out.println("\n=== Uji Kelas Bank ===");
        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        Account acc2 = new Account("A002", customer2, 200000);

        // Buat Bank dengan kapasitas 10 rekening
        Bank bank = new Bank(10);
        
        // Tambahkan akun ke dalam Bank
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.printAllAccounts();

        // Cari rekening berdasarkan nomor rekening (A002)
        System.out.println("\nHasil Pencarian A002:");
        Account found = bank.findAccount("A002");
        if (found != null) {
            found.printInfo();
        }

        // =======================================================================
        // 💡 3. TUGAS MANDIRI (CARI REKENING BERDASARKAN NAMA)
        // =======================================================================
        System.out.println("\n=== Uji Tugas Mandiri (Pencarian Nama) ===");
        
        // Nasabah bernama Nadia membuka rekening kedua
        Account acc3 = new Account("A003", customer1, 1500000);
        bank.addAccount(acc3);

        System.out.println("Mencari rekening atas nama 'Nadia':");
        
        // Mencari semua rekening milik Nadia dan menyimpannya di array baru
        Account[] nadiasAccounts = bank.findAccountsByOwnerName("Nadia");
        for (Account acc : nadiasAccounts) {
            acc.printInfo(); // Cetak hasil pencarian
        }
    }
}