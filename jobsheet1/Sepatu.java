public class Sepatu {
    // 2 Atribut
    private String merk;
    private int ukuran;

    // 3 Method
    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setUkuran(int newValue) {
        ukuran = newValue;
    }

    public void cetakInfo() {
        System.out.println("Merk Sepatu   : " + merk);
        System.out.println("Ukuran Sepatu : " + ukuran);
    }
}

