package id.ac.polinema; // Mendefinisikan lokasi package (folder) untuk kelas ini

public class Account {
    // =======================================================================
    // 💡 BAGIAN 1: ATRIBUT (STATE)
    // Di sinilah tempat jika Anda ingin MENAMBAH/MENGURANGI data spesifik akun.
    // Contoh penambahan fitur: private String pin;, private String email;
    // =======================================================================
    private String accountNumber; // Atribut private untuk nomor rekening (enkapsulasi)
    private String ownerName;     // Atribut private untuk nama pemilik rekening
    private double balance;       // Atribut private untuk jumlah saldo
    private double dailyWithdrawalLimit; // Atribut private untuk batas maksimal penarikan harian

    // =======================================================================
    // 💡 BAGIAN 2: KONSTRUKTOR (CONSTRUCTOR)
    // Dijalankan pertama kali saat objek dibuat. Kalau Anda menambah atribut 
    // baru di Bagian 1, Anda wajib menambahkan parameternya di dalam kurung ini.
    // =======================================================================
    public Account(String accountNumber, String ownerName, double balance, double dailyWithdrawalLimit) {
        this.accountNumber = accountNumber; // Mengisi nomor rekening awal
        this.ownerName = ownerName;         // Mengisi nama pemilik awal
        this.balance = balance;             // Mengisi saldo awal
        this.dailyWithdrawalLimit = dailyWithdrawalLimit; // Mengisi limit tarik harian awal
    }

    // =======================================================================
    // 💡 BAGIAN 3: GETTER (READ-ONLY)
    // Kumpulan method untuk MENGAMBIL/MELIHAT nilai atribut private tanpa bisa 
    // mengubahnya secara sembarangan dari luar.
    // =======================================================================
    public String getAccountNumber() {
        return accountNumber; // Mengembalikan (return) nilai nomor rekening
    }

    public String getOwnerName() {
        return ownerName; // Mengembalikan nilai nama pemilik
    }

    public double getBalance() {
        return balance; // Mengembalikan informasi saldo terkini
    }

    // =======================================================================
    // 💡 BAGIAN 4: METHOD LOGIKA (BEHAVIOR)
    // Jika Anda ingin mengubah logika bisnis, atau MENAMBAH FITUR BARU 
    // (misal: fitur transfer, denda bayar, ubah PIN), tambahkan method-nya di bawah ini.
    // =======================================================================

    // Method untuk setor tunai (deposit)
    public boolean deposit(double amount) {
        if (amount <= 0) { // Validasi: tidak boleh setor uang minus atau nol
            return false;  // Tolak transaksi (kembalikan false)
        }
        balance += amount; // Tambahkan nominal uang ke saldo utama
        return true;       // Transaksi sukses (kembalikan true)
    }

    // Method untuk tarik tunai (withdraw)
    public boolean withdraw(double amount) {
        // Validasi ketat: Tolak jika nominal 0, lebih besar dari saldo, atau lebih besar dari limit harian
        if (amount <= 0 || amount > balance || amount > dailyWithdrawalLimit) {
            return false; // Tolak transaksi
        }
        balance -= amount; // Kurangi saldo dengan nominal tarikan
        return true;       // Transaksi sukses
    }

    // Method untuk mencetak informasi detail akun ke layar terminal
    public void printInfo() {
        System.out.println(accountNumber + " - " + ownerName + " - balance: " + balance);
    }
}