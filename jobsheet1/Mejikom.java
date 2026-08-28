public class Mejikom extends AlatMasak { // Class Anak 2
    private float kapasitasLiter;

    public void setKapasitas(float newValue) {
        kapasitasLiter = newValue;
    }

    public void panaskanNasi() {
        System.out.println("Status     : Nasi sedang dihangatkan (Warm)");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo(); // Panggil info dasar dari induk
        System.out.println("Kapasitas  : " + kapasitasLiter + " Liter");
    }
}