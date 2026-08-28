public class Kompor extends AlatMasak { // Class Anak 1
    private int jumlahTungku;

    public void setJumlahTungku(int newValue) {
        jumlahTungku = newValue;
    }

    public void nyalakanApi() {
        System.out.println("Status     : Api kompor menyala!");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo(); // Panggil info dasar dari induk
        System.out.println("Jml Tungku : " + jumlahTungku);
    }
}