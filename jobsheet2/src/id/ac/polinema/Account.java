package id.ac.polinema;

public class Account {
    // =======================================================================
    // 💡 BAGIAN 1: ATRIBUT (STATE)
    // Pada Jobsheet 2 ini atribut masih diset 'public' (belum di-enkapsulasi).
    // Jika ingin menambah atribut dasar, tambahkan di sini.
    // =======================================================================
    public String ownerName;
    public double balance;

    // =======================================================================
    // 💡 BAGIAN 2: KONSTRUKTOR (CONSTRUCTOR)
    // Dijalankan pertama kali saat membuat objek.
    // =======================================================================
    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // =======================================================================
    // 💡 BAGIAN 3: METHOD LOGIKA (BEHAVIOR)
    // =======================================================================
    
    // Method untuk menambah saldo (deposit)
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Method untuk menarik saldo (withdraw)
    public void withdraw(double amount) {
        balance = balance - amount; // Kurangi dulu
        if (isOverdrawn()) {        // Cek apakah jadi minus
            balance = balance + amount; // Jika minus, batalkan (kembalikan seperti semula)
            System.out.println("Withdrawal rejected: insufficient balance.");
        }
    }

    // Method untuk menampilkan informasi ke terminal
    public void printInfo() {
        System.out.println(ownerName + " - balance: " + balance);
    }

    // Method untuk menampilkan saldo dengan format pemisah ribuan
    public String formatBalance() {
        return String.format("%,.2f", balance);
    }

    // Method untuk mengecek apakah saldo negatif
    public boolean isOverdrawn() {
        return balance < 0;
    }

    // =======================================================================
    // 💡 BAGIAN 4: TUGAS MANDIRI (FITUR TRANSFER)
    // Perbaikan: Diubah agar lebih patuh pada instruksi PDF yaitu menggunakan 
    // method withdraw() dan deposit() yang sudah ada.
    // =======================================================================
    public void transferTo(Account target, double amount) {
        // Cek dulu apakah saldo cukup sebelum mencoba menarik
        if (this.balance >= amount) {
            this.withdraw(amount);   // Tarik dari akun asal (diri sendiri)
            target.deposit(amount);  // Setor ke akun tujuan (target)
        } else {
            System.out.println("Transfer rejected: insufficient balance.");
        }
    }
}