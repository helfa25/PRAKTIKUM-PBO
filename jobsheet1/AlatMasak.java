public class AlatMasak { // Class Induk (Parent)
    private String merk;
    private String warna;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void cetakInfo() {
        System.out.println("Merk Alat  : " + merk);
        System.out.println("Warna Alat : " + warna);
    }
}