public class SepatuOlahraga extends Sepatu {
    // 2 Atribut tambahan khusus sepatu olahraga
    private String jenisOlahraga;
    private boolean isTaliIkat;

    // 3 Method 
    public void setJenisOlahraga(String newValue) {
        jenisOlahraga = newValue;
    }

    public void ikatTali() {
        isTaliIkat = true;
    }

    public void cetakInfo() {
        super.cetakInfo(); // Memanggil cetakInfo() dari class induk
        System.out.println("Utk Olahraga  : " + jenisOlahraga);
        System.out.println("Tali Diikat   : " + isTaliIkat);
    }
}

