package id.ac.polinema;

// =======================================================================
// 💡 KELAS ACCOUNT
// Mewakili data rekening bank. Di Jobsheet 4 ini, terjadi perubahan Relasi.
// =======================================================================
public class Account {
    private String accountNumber; 

    // =======================================================================
    // 💡 RELASI ASSOCIATION
    // Dulu atribut ini bertipe String (hanya teks biasa). Sekarang diubah 
    // menjadi tipe 'Customer'. Artinya, kelas Account punya relasi dengan 
    // kelas Customer (Account "has-a" Customer).
    // =======================================================================
    private Customer owner; 
    
    private double balance;

    // Konstruktor juga ikut diubah agar menerima objek Customer
    public Account(String accountNumber, Customer owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Mengembalikan objek Customer utuh
    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }

    public void printInfo() {
        // Karena 'owner' sekarang objek, kita harus memanggil .getName() 
        // untuk mengambil teks namanya.
        System.out.println(accountNumber + " - " + owner.getName() + " - balance: " + balance);
    }
}