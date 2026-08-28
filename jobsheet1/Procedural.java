public class Procedural { // Mendeklarasikan class bernama Procedural
    public static void main(String[] args) { // Method utama (main) yang akan dieksekusi pertama kali
        String itemName1 = "Coffee"; // Deklarasi variabel string untuk nama barang pertama
        float price1 = 120000.0f; // Deklarasi variabel float untuk harga barang pertama
        int quantity1 = 3; // Deklarasi variabel integer untuk jumlah barang pertama

        String itemName2 = "Sugar"; // Deklarasi variabel string untuk nama barang kedua
        float price2 = 30000.0f; // Deklarasi variabel float untuk harga barang kedua
        int quantity2 = 1; // Deklarasi variabel integer untuk jumlah barang kedua

        System.out.println(itemName1 + ": " + total(price1, quantity1)); // Mencetak nama dan memanggil fungsi total() untuk barang 1
        System.out.println(itemName2 + ": " + total(price2, quantity2)); // Mencetak nama dan memanggil fungsi total() untuk barang 2
    } // Penutup method main

    static float total(float price, int quantity) { // Fungsi prosedural statis untuk menghitung total
        return price * quantity; // Mengembalikan hasil perkalian harga dengan kuantitas
    } // Penutup fungsi total
} // Penutup class Procedural