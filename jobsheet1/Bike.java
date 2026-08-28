public class Bike{ // Mendeklarasikan class Bike sebagai cetakan objek sepeda
    private String brand; // Atribut private untuk merk sepeda
    private int speed; // Atribut private untuk kecepatan sepeda
    private int gear=1; // Atribut private untuk posisi gigi sepeda, default awal 1
    // Gear 1: max 5 km/h, Gear 2: max 10 km/h, ... Gear 6: max 60 km/h // Komentar asli bawaan jobsheet
    private final int[] GEAR_SPEED_LIMITS = {5, 10, 25, 30, 40, 60}; // Array konstanta pembatas kecepatan untuk setiap gigi
    public void setBrand(String brandName){ // Method setter untuk menetapkan nama merk
        brand = brandName; // Menyimpan input brandName ke dalam atribut brand
    } // Penutup method setBrand
    public void gearChanges(int gearValue){ // Method untuk mengubah posisi gigi
        if (gearValue < 1 || gearValue > 6) { // Validasi kondisi jika nilai gigi di luar rentang 1-6
            System.out.println("Invalid gear value. Gear must be between 1 and 6."); // Menampilkan pesan error jika gigi tidak valid
        } // Penutup blok if
        else{ // Kondisi jika input nilai gigi valid
            gear = gearValue; // Memperbarui atribut gear dengan nilai yang baru
        } // Penutup blok else
    } // Penutup method gearChanges
    public int speedAcceleration(int increment) { // Method untuk menambah kecepatan (akselerasi)
        speed += increment; // Menambahkan kecepatan saat ini dengan nilai increment
        if (speed > GEAR_SPEED_LIMITS[gear - 1]) { // Mengecek apakah kecepatan melebihi batas maksimal gigi saat ini
            speed = GEAR_SPEED_LIMITS[gear - 1]; // Jika melebihi batas, kecepatan ditahan di angka maksimal gigi tersebut
        } // Penutup blok if
        return speed; // Mengembalikan nilai kecepatan terbaru
    } // Penutup method speedAcceleration
    public int speedDeceleration(int decrement) { // Method untuk mengurangi kecepatan (pengereman)
        speed -= decrement; // Mengurangi kecepatan saat ini dengan nilai decrement
        if (speed < 0) { // Mengecek apakah hasil pengurangan membuat kecepatan menjadi minus (di bawah 0)
            speed = 0; // Jika minus, kecepatan diset menjadi 0 (berhenti)
        } // Penutup blok if
        return speed; // Mengembalikan nilai kecepatan terbaru
    } // Penutup method speedDeceleration
    public void printInfo(){ // Method untuk menampilkan informasi status sepeda ke layar
        System.out.println();
        System.out.println("Bike information:");
        System.out.println("Brand : " + brand); // Mencetak merk sepeda
        System.out.println("Speed : " + speed); // Mencetak kecepatan sepeda saat ini
        System.out.println("Gear : " + gear); // Mencetak posisi gigi sepeda saat ini
    } // Penutup method printInfo
} // Penutup class Bike