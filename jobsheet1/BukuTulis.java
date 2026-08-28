public class BukuTulis extends Buku { // Class Anak 1 yang mewarisi class Buku
    private String merk; // Atribut khusus buku tulis
    private boolean sudahDitulis; // Atribut penanda apakah sudah dipakai menulis

    public void setMerk(String newValue) { // Method setter merk
        merk = newValue;
    }

    public void tulisCatatan() { // Method khusus buku tulis
        sudahDitulis = true;
    }

    @Override
    public void cetakInfo() { // Override method dari induk
        super.cetakInfo(); // Panggil info dasar buku
        System.out.println("Merk Buku   : " + merk);
        System.out.println("Sdh Ditulis : " + sudahDitulis);
    }
}