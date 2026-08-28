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

        System.out.println("\n=== OBJEK ALAT MASAK (PARENT) ===");
        AlatMasak alat = new AlatMasak();
        alat.setMerk("Philips");
        alat.setWarna("Putih");
        alat.cetakInfo();

        System.out.println("\n=== OBJEK KOMPOR (CHILD 1) ===");
        Kompor kompor = new Kompor();
        kompor.setMerk("Rinnai"); // method dari induk
        kompor.setWarna("Hitam"); // method dari induk
        kompor.setJumlahTungku(2); // method sendiri
        kompor.cetakInfo();
        kompor.nyalakanApi(); 

        System.out.println("\n=== OBJEK MEJIKOM (CHILD 2) ===");
        Mejikom mejikom = new Mejikom();
        mejikom.setMerk("Miyako"); // method dari induk
        mejikom.setWarna("Silver"); // method dari induk
        mejikom.setKapasitas(1.8f); // method sendiri
        mejikom.cetakInfo();
        mejikom.panaskanNasi();
    }
}