public class Demo { // Class Utama
    public static void main(String[] args) {
        System.out.println("=== OBJEK TAS ===");
        Tas tas = new Tas();
        tas.setMerk("Eiger"); 
        tas.setWarna("Hitam"); 
        tas.cetakInfo(); 

        System.out.println("\n=== OBJEK AIR MINERAL ===");
        AirMineral air = new AirMineral();
        air.setMerk("Aqua");
        air.setVolume(600);
        air.cetakInfo();

        System.out.println("\n=== OBJEK BUKU (PARENT) ===");
        Buku buku = new Buku();
        buku.setJudul("Buku Umum");
        buku.setJumlahHalaman(100);
        buku.cetakInfo();

        System.out.println("\n=== OBJEK BUKU TULIS (CHILD 1) ===");
        BukuTulis bukuT = new BukuTulis();
        bukuT.setJudul("Catatan PBO"); // method dari induk
        bukuT.setJumlahHalaman(50); // method dari induk
        bukuT.setMerk("Sinar Dunia"); // method sendiri
        bukuT.tulisCatatan(); 
        bukuT.cetakInfo();

        System.out.println("\n=== OBJEK BUKU CETAK (CHILD 2) ===");
        BukuCetak bukuC = new BukuCetak();
        bukuC.setJudul("Pemrograman Java"); // method dari induk
        bukuC.setJumlahHalaman(300); // method dari induk
        bukuC.setMataPelajaran("PBO"); // method sendiri
        bukuC.bacaBuku();
        bukuC.cetakInfo();
    }
}