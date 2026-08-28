public class JamTangan {
    // 2 Atribut
    private String merk;
    private boolean isMenyala;

    // 3 Method
    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void nyalakan() {
        isMenyala = true;
    }

    public void cetakInfo() {
        System.out.println("Merk Jam Tangan : " + merk);
        System.out.println("Status Menyala  : " + isMenyala);
    }
}

