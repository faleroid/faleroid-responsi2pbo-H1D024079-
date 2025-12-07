public class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor (tipeMotor)
    String tipeMotor;

    // Constructor
    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    @Override
    void tampilInfo() {
        // Override info mesin motor
        System.out.println("Mesin " + kategoriMesin() + " " + namaMesin + " | Tipe: " + tipeMotor + " | Tenaga: "
                + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Override performa mesin motor
        return tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        // Override kategori
        return "Mesin Motor";
    }

    void suaraMesin() {
        // Suara mesin motor
        System.out.println(namaMesin + " -> Brummm! Mesin motor menyala!");
    }
}
