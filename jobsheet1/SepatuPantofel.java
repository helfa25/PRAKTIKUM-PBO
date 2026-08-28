public class SepatuPantofel extends Sepatu {
    // 2 Atribut tambahan khusus sepatu pantofel
    private String bahan;
    private boolean isDisemir;

    // 3 Method
    public void setBahan(String newValue) {
        bahan = newValue;
    }

    public void semirSepatu() {
        isDisemir = true;
    }

    public void cetakInfo() {
        super.cetakInfo(); // Memanggil cetakInfo() dari class induk
        System.out.println("Bahan Sepatu  : " + bahan);
        System.out.println("Sudah Disemir : " + isDisemir);
    }
}

