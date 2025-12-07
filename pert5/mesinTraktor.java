public class mesinTraktor extends defaultMesin {
    // Variabel khusus mesin traktor (kapasitasTarik)
    double kapasitasTarik;

    // Constructor
    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        // Override info mesin traktor
        System.out.println("Mesin " + kategoriMesin() + " " + namaMesin + " | Tarik: " + kapasitasTarik
                + " ton | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Override performa traktor
        return (tenagaHP * 1.1) + (kapasitasTarik * 5);
    }

    @Override
    String kategoriMesin() {
        // Override kategori traktor
        return "Mesin Traktor";
    }

    void suaraMesin() {
        // Suara traktor
        System.out.println(namaMesin + " -> GGGRRRR! Hidup mesinnn!");
    }
}
