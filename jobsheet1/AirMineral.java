public class AirMineral { // Class untuk objek air mineral botol
    private String merk; // Atribut untuk merk air
    private int volume; // Atribut untuk volume (ml)

    public void setMerk(String newValue) { // Method setter merk
        merk = newValue;
    }

    public void setVolume(int newValue) { // Method setter volume
        volume = newValue;
    }

    public void cetakInfo() { // Method untuk mencetak info air
        System.out.println("Merk Air    : " + merk);
        System.out.println("Volume (ml) : " + volume);
    }
}