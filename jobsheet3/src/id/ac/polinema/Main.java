package id.ac.polinema; // Mendefinisikan lokasi package (folder) untuk kelas ini

public class Main { // Main class sebagai titik awal jalannya program
    public static void main(String[] args) {
        // =======================================================================
        // 💡 AREA PENGUJIAN FITUR (TESTING AREA)
        // Di sini adalah tempat mengeksekusi objek. Jika Anda menambah fitur baru
        // di Account.java (misalnya fitur transfer), Anda wajib memanggil dan 
        // mengujinya di bagian bawah ini untuk melihat hasilnya.
        // =======================================================================

        // 1. Membuat objek Account baru bernama 'limited' melalui Konstruktor
        // Format argumen: (nomorRekening, namaPemilik, saldoAwal, limitTarikHarian)
        Account limited = new Account("A005", "Fajar", 1000000, 200000);

        // 2. Menguji penarikan uang MELEBIHI limit (Limit 200.000, ditarik 300.000)
        // Hasil yang diharapkan: false (Ditolak karena melebihi batas penarikan harian)
        System.out.println("Withdraw 300000 allowed? " + limited.withdraw(300000));

        // 3. Menguji penarikan uang DI BAWAH limit (Limit 200.000, ditarik 150.000)
        // Hasil yang diharapkan: true (Diizinkan karena di bawah limit dan saldo juga cukup)
        System.out.println("Withdraw 150000 allowed? " + limited.withdraw(150000));

        // 4. Mencetak informasi terbaru dari akun Fajar
        // Hasil yang diharapkan: Saldo awal 1.000.000 akan berkurang menjadi 850.000
        limited.printInfo();
    }
}