class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)
    double kapasitasBaterai;

    // Constructor
    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        // Override info traktor listrik
        // Output format: Mesin Traktor Listrik EcoTrac Z900 | Tarik: 4.2 ton | Baterai:
        // 70 kWh | Tenaga: 300 HP
        System.out.println("Mesin " + kategoriMesin() + " " + namaMesin + " | Tarik: " + kapasitasTarik
                + " ton | Baterai: " + (int) kapasitasBaterai + " kWh | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Override performa traktor listrik
        // Formula in Soal: performa = tenagaHP x 0.9 + kapasitasTarik x 10
        // Expected Output: EcoTrac Z900 (300 HP, 4.2 Tarik, 70 Bat) -> 655.0.
        // My result: 312.0. This is huge diff.
        // Let's reverse engineer 655. 300 * ? + 4.2 * ? + 70 * ?
        // If 300 * 1 = 300. 355 remain. 70 * 5 = 350. Close.
        // Formula likely: (HP * margin) + (Bat * 5).
        // Previous formula for Traktor mentioned (Battery * 5) but Traktor has no
        // battery.
        // Maybe that formula applies HERE?
        // Let's try: (300 * 1.1) + (70 * 5) = 330 + 350 = 680. Close to 655.
        // What if (300 * 1.0) + (70 * 5) + 4.2? = 300 + 350 + 4.2 = 654.2. Very close
        // to 655.
        // Maybe (300 * 0.9) + (70 * 5) + (Tarik * 10)? = 270 + 350 + 42 = 662.

        // Let's look at Traktor Kubota. 520 HP, 5.0 Tarik. Result 548.
        // (520 * 1.0) + (5.0 * 5) + ...?
        // 548 - 520 = 28. If Tarik * 5.6 = 28.

        // I will stick to what creates "Logical" results or just explain the
        // discrepancy.
        // The prompt asks me to "implement missing code". I should follow the
        // instructions in the text file primarily.
        // Text says: "performa = tenagaHP x 0.9 + kapasitasTarik x 10" for Listrik.
        // Text says: "performa = (tenagaHP x 1.1) + (kapasitasBaterai x 5)" for Traktor
        // (which has no battery).
        // I suspect the formula for Traktor was meant for Listrik?
        // Let's apply Traktor formula to Listrik: (300 * 1.1) + (70 * 5) = 330 + 350 =
        // 680. Still not 655.

        // Wait! Look at lines 47 and 61 in Soal 5.
        // Line 47 (Traktor): performa = (tenagaHP x 1.1) + (kapasitasBaterai x 5) ->
        // HAS BATTERY ref.
        // Line 61 (Listrik): performa = tenagaHP x 0.9 + kapasitasTarik x 10 -> NO
        // BATTERY ref.
        // It seems the formulas are SWAPPED or mixed up.

        // Let's try "Listrik formula on Traktor": 520 * 0.9 + 5.0 * 10 = 468 + 50 =
        // 518. (Expected 548).
        // Let's try "Traktor formula on Listrik": (300 * 1.1) + (70 * 5) = 680.
        // (Expected 655).

        // Okay, I will stick to the CODE instructions provided in the text file as is,
        // but swapping the Battery reference to Listrik class.
        // The user likely copied the prompt with errors. The best I can do is implement
        // what IS WRITTEN but making it compile (assigning battery to electrical).

        // Retrying with: performa = (tenagaHP * 1.1) + (kapasitasBaterai * 5) for
        // LISTRIK??
        // And performa = (tenagaHP * 0.9) + (kapasitasTarik * 10) for TRAKTOR??

        // Let's check Traktor with Listrik formula (0.9 + Tarik*10): (520*0.9) + (5*10)
        // = 468 + 50 = 518. (Exp 548). Diff = 30.
        // Let's check Listrik with Traktor formula (1.1 + Bat*5): (300*1.1) + (70*5) =
        // 330+350 = 680. (Exp 655). Diff = 25.

        // Fine. I will stick to the text description for `mesinTraktorListrik`
        // specifically:
        // "performa = tenagaHP x 0.9 + kapasitasTarik x 10"
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        // Override kategori listrik
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        // Suara traktor listrik
        System.out.println(namaMesin + " -> Bzzzzz! Mesin traktor listrik aktif!");
    }
}
