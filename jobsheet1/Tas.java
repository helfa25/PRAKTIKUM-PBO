public class Tas {
    // 2 Atribut
    private String merk;
    private String warna;

    // 3 Method (termasuk cetak info)
    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void cetakInfo() {
        System.out.println("Merk Tas   : " + merk);
        System.out.println("Warna Tas  : " + warna);
    }
}

