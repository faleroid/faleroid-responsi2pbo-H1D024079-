class mesinTraktor extends defaultMesin {
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
        // Formula asal (ada typo di soal sebut baterai, diganti tarik): (tenagaHP x
        // 1.1) + (kapasitasTarik x 5)
        return (tenagaHP * 1.1) + (kapasitasTarik * 5);
    }

    @Override
    String kategoriMesin() {
        // Override kategori traktor (Note: Soal says "Mesin Traktor Listrik" here in
        // point 3 line 49, but that seems to be a typo for point 4.
        // Based on logic, this should be "Mesin Traktor" and the other "Mesin Traktor
        // Listrik")
        // OUTPUT EXPECTED (Line 129): "Kategori: Mesin Traktor"
        return "Mesin Traktor";
    }

    void suaraMesin() {
        // Suara traktor
        System.out.println(namaMesin + " -> GGGRRRR! Hidup mesinnn!");
    }
}
