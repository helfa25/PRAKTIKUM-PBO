public class RoadBike extends Bike { // Mendeklarasikan RoadBike yang mewarisi (extends) semua sifat class Bike
    private int tireWidth; // Atribut tambahan khusus RoadBike untuk lebar ban

    public void setTireWidth(int width) { // Method setter untuk mengatur lebar ban
        tireWidth = width; // Memasukkan nilai width ke atribut tireWidth
    } // Penutup method setTireWidth

    @Override // Menandakan bahwa method printInfo ini menimpa/mengganti method printInfo dari class induk (Bike)
    public void printInfo() { // Method cetak informasi khusus untuk RoadBike
        super.printInfo(); // Memanggil method printInfo() milik class induk (Bike) agar brand, speed, dan gear tercetak
        System.out.println("Tire Width : " + tireWidth + " mm"); // Mencetak informasi tambahan berupa lebar ban
        System.out.println("Bike Type  : Road Bike"); // Mencetak informasi tipe sepeda
    } // Penutup method printInfo
} // Penutup class RoadBike