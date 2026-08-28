public class BukuCetak extends Buku { // Class Anak 2 yang mewarisi class Buku
    private String mataPelajaran; // Atribut khusus buku cetak/pelajaran
    private boolean dibaca; // Atribut penanda apakah sudah dibaca

    public void setMataPelajaran(String newValue) { // Method setter mata pelajaran
        mataPelajaran = newValue;
    }

    public void bacaBuku() { // Method khusus buku cetak
        dibaca = true;
    }

    @Override
    public void cetakInfo() { // Override method dari induk
        super.cetakInfo(); // Panggil info dasar buku
        System.out.println("Mata Pel.   : " + mataPelajaran);
        System.out.println("Sdh Dibaca  : " + dibaca);
    }
}