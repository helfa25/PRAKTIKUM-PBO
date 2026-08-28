public class Buku { // Class Induk (Parent) untuk segala jenis buku
    private String judul; // Atribut judul buku
    private int jumlahHalaman; // Atribut tebal/jumlah halaman buku

    public void setJudul(String newValue) { // Method setter judul
        judul = newValue;
    }

    public void setJumlahHalaman(int newValue) { // Method setter halaman
        jumlahHalaman = newValue;
    }

    public void cetakInfo() { // Method cetak info buku dasar
        System.out.println("Judul Buku  : " + judul);
        System.out.println("Jml Halaman : " + jumlahHalaman);
    }
}