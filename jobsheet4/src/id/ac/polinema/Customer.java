package id.ac.polinema;

// =======================================================================
// 💡 KELAS CUSTOMER
// Kelas ini dibuat untuk merepresentasikan data seorang Nasabah (Customer).
// Jika ingin menambah data nasabah (misal: Alamat, NIK, atau Email),
// tambahkan atribut baru di bawah ini.
// =======================================================================
public class Customer {
    private String name;  // Nama nasabah
    private String phone; // Nomor telepon nasabah

    // Konstruktor: Mewajibkan input nama dan nomor telepon saat objek dibuat
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Getter untuk mengambil nama nasabah (Read-only)
    public String getName() {
        return name;
    }

    // Getter untuk mengambil nomor telepon nasabah (Read-only)
    public String getPhone() {
        return phone;
    }
}