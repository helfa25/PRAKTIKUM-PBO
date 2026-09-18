package id.ac.polinema;

// =======================================================================
// 💡 KELAS BANK
// Kelas ini berfungsi sebagai wadah untuk menampung banyak akun rekening.
// =======================================================================
public class Bank {
    // =======================================================================
    // 💡 RELASI AGGREGATION (Array of Objects)
    // Bank memiliki sekumpulan Account yang disimpan di dalam Array.
    // Jika Bank dihancurkan, objek Account yang ada di dalamnya akan tetap aman.
    // =======================================================================
    private Account[] accounts; 
    private int count; // Menghitung sudah ada berapa akun yang masuk

    // Konstruktor untuk menentukan kapasitas maksimal bank
    public Bank(int capacity) {
        accounts = new Account[capacity];
        count = 0;
    }

    // Method untuk mendaftarkan akun baru ke dalam Bank
    public boolean addAccount(Account account) {
        if (count >= accounts.length) return false; // Tolak jika bank penuh
        accounts[count] = account; // Masukkan akun ke indeks array
        count++; // Tambah jumlah hitungan
        return true;
    }

    // Method pencarian akun berdasarkan Nomor Rekening
    public Account findAccount(String accountNumber) {
        for (int i = 0; i < count; i++) {
            // Cocokkan nomor rekening (menggunakan .equals karena tipe datanya String)
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null; // Jika tidak ketemu
    }

    // =======================================================================
    // 💡 TUGAS MANDIRI: PENCARIAN BERDASARKAN NAMA
    // Method ini akan mencari dan mengembalikan BANYAK akun sekaligus 
    // dalam bentuk array, karena 1 nasabah bisa punya lebih dari 1 rekening.
    // =======================================================================
    public Account[] findAccountsByOwnerName(String name) {
        // 1. Hitung dulu ada berapa rekening yang cocok dengan nama tersebut
        int matchCount = 0;
        for (int i = 0; i < count; i++) {
            if (accounts[i].getOwner().getName().equals(name)) {
                matchCount++;
            }
        }
        
        // 2. Buat array baru khusus untuk menampung hasil yang cocok
        Account[] matches = new Account[matchCount];
        int index = 0;
        
        // 3. Masukkan data-datanya ke dalam array baru tersebut
        for (int i = 0; i < count; i++) {
            if (accounts[i].getOwner().getName().equals(name)) {
                matches[index] = accounts[i];
                index++;
            }
        }
        return matches; // Kembalikan array hasilnya
    }

    // Method untuk mencetak semua akun yang terdaftar
    public void printAllAccounts() {
        for (int i = 0; i < count; i++) {
            accounts[i].printInfo();
        }
    }
}