package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        // =======================================================================
        // 💡 AREA PENGUJIAN FITUR (TESTING AREA)
        // Di sini kita mengeksekusi objek Account yang dibuat.
        // =======================================================================

        System.out.println("=== Output Langkah 7 ===");
        // Menggunakan konsep Array of Objects untuk membuat banyak objek sekaligus
        Account[] accounts = new Account[3];
        
        accounts[0] = new Account("Nadia", 500000);
        accounts[0].withdraw(150000); // Nadia tarik 150.000
        
        accounts[1] = new Account("Budi", 1000000);
        
        accounts[2] = new Account("Sari", 750000);
        accounts[2].withdraw(250000); // Sari tarik 250.000
        
        // Looping untuk mencetak informasi semua akun di dalam array
        for (Account acc : accounts) {
            acc.printInfo();
        }

        System.out.println("\n=== Output Tugas Mandiri (transferTo) ===");
        // Pembuatan objek untuk simulasi transfer
        Account from = new Account("Nadia", 500000);
        Account to = new Account("Budi", 200000);
        
        // Memanggil method transferTo (Nadia transfer 100.000 ke Budi)
        from.transferTo(to, 100000);
        
        // Cetak saldo akhir mereka
        from.printInfo();
        to.printInfo();
    }
}