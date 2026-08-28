public class BikeDemo{ // Mendeklarasikan class utama penguji objek sepeda
    public static void main(String[] args){ // Method main, titik awal program berjalan
        Bike mountainBike1 = new Bike(); // Membuat (instansiasi) objek pertama mountainBike1 dari class Bike
        Bike mountainBike2 = new Bike(); // Membuat (instansiasi) objek kedua mountainBike2 dari class Bike
        RoadBike roadBike1 = new RoadBike(); // Membuat (instansiasi) objek roadBike1 dari class RoadBike

        mountainBike1.setBrand("Trek"); // Menyetel merk mountainBike1 menjadi Trek
        mountainBike1.speedAcceleration(10); // Menambah kecepatan mountainBike1 sebanyak 10
        mountainBike1.gearChanges(2); // Mengubah gigi mountainBike1 ke posisi 2
        mountainBike1.printInfo(); // Memanggil fungsi untuk mencetak info mountainBike1

        mountainBike2.setBrand("Giant"); // Menyetel merk mountainBike2 menjadi Giant
        mountainBike2.speedAcceleration(20); // Menambah kecepatan mountainBike2 sebanyak 20
        mountainBike2.gearChanges(3); // Mengubah gigi mountainBike2 ke posisi 3
        mountainBike2.printInfo(); // Memanggil fungsi untuk mencetak info mountainBike2

        roadBike1.setBrand("Specialized"); // Menyetel merk roadBike1 (memakai method turunan dari class Bike)
        roadBike1.setTireWidth(25); // Menyetel lebar ban khusus roadBike1 sebesar 25
        roadBike1.speedAcceleration(15); // Menambah kecepatan roadBike1 sebanyak 15
        roadBike1.gearChanges(4); // Mengubah gigi roadBike1 ke posisi 4
        roadBike1.printInfo(); // Mencetak info roadBike1 (menggunakan printInfo yang sudah di-override)
    } // Penutup method main
} // Penutup class BikeDemo