class Product { // Mendeklarasikan class Product sebagai blueprint (cetakan)

    private final String itemName; // Atribut private untuk menyimpan nama produk (tidak bisa diubah setelah di-set)
    private final float price; // Atribut private untuk menyimpan harga produk

    public Product (String itemName, float price) { // Constructor untuk inisialisasi objek Product saat dibuat
        this.itemName = itemName; // Memasukkan nilai parameter itemName ke atribut class
        this.price = price; // Memasukkan nilai parameter price ke atribut class
    } // Penutup constructor

    public float total(int quantity) { // Method untuk menghitung total harga berdasarkan jumlah
        return price * quantity; // Mengembalikan hasil perkalian harga produk dengan jumlah
    } // Penutup method total

    public String getName() { // Method getter untuk mengambil (membaca) nama produk
        return itemName; // Mengembalikan nilai dari atribut itemName
    } // Penutup method getName
} // Penutup class Product

public class OOP { // Mendeklarasikan class utama OOP
    public static void main(String[] args) { // Method utama tempat program mulai berjalan

        Product product1 = new Product("Coffee", 120000.0f); // Membuat objek (instansiasi) product1 dari class Product
        Product product2 = new Product("Sugar", 30000.0f); // Membuat objek (instansiasi) product2 dari class Product

        System.out.println(product1.getName() + ": " + product1.total(3)); // Menampilkan nama dan hasil perhitungan total objek 1
        System.out.println(product2.getName() + ": " + product2.total(1)); // Menampilkan nama dan hasil perhitungan total objek 2
    } // Penutup method main
} // Penutup class OOP