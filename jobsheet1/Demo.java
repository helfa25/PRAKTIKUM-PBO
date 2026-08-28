public class Demo {
    public static void main(String[] args) {
        
        System.out.println("=== OBJEK TAS ===");
        Tas tas = new Tas();
        tas.setMerk("Eiger"); // method 1
        tas.setWarna("Hitam"); // method 2
        tas.cetakInfo(); // method 3

        System.out.println("\n=== OBJEK JAM TANGAN ===");
        JamTangan jam = new JamTangan();
        jam.setMerk("Casio"); // method 1
        jam.nyalakan(); // method 2
        jam.cetakInfo(); // method 3

        System.out.println("\n=== OBJEK SEPATU (PARENT) ===");
        Sepatu sepatu = new Sepatu();
        sepatu.setMerk("Bata"); // method 1
        sepatu.setUkuran(42); // method 2
        sepatu.cetakInfo(); // method 3

        System.out.println("\n=== OBJEK SEPATU OLAHRAGA (CHILD 1) ===");
        SepatuOlahraga sepatuOr = new SepatuOlahraga();
        sepatuOr.setMerk("Nike"); // method dari parent
        sepatuOr.setUkuran(43); // method dari parent
        sepatuOr.setJenisOlahraga("Basket"); // method 1 (child)
        sepatuOr.ikatTali(); // method 2 (child)
        sepatuOr.cetakInfo(); // method 3 (child)

        System.out.println("\n=== OBJEK SEPATU PANTOFEL (CHILD 2) ===");
        SepatuPantofel sepatuPf = new SepatuPantofel();
        sepatuPf.setMerk("Hush Puppies"); // method dari parent
        sepatuPf.setUkuran(41); // method dari parent
        sepatuPf.setBahan("Kulit Asli"); // method 1 (child)
        sepatuPf.semirSepatu(); // method 2 (child)
        sepatuPf.cetakInfo(); // method 3 (child)
    }
}

