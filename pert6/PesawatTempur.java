public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    // private int jumlahRudal
    private int jumlahRudal;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    // - namaKendaraan
    // - kapasitasPenumpang
    // - jumlahRudal
    // Panggil super(...) untuk parent.
    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 20 → tampilkan "Energi terlalu rendah! Mesin tidak dapat
    // diaktifkan."
    // Jika cukup → tampilkan "Mesin pesawat tempur diaktifkan."
    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    // @Override jelajah(int jarak)
    // Konsumsi energi: 3% per 1 km.
    // Jika energi tidak cukup → tampilkan pesan gagal.
    // Jika cukup → kurangi energi dan tampilkan:
    // "Pesawat tempur menjelajah sejauh [jarak] km."
    @Override
    public void jelajah(int jarak) {
        int kebutuhanEnergi = jarak * 3;
        if (getLevelEnergi() >= kebutuhanEnergi) {
            setLevelEnergi(getLevelEnergi() - kebutuhanEnergi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Gagal menjelajah! Energi tidak mencukupi.");
        }
    }

    // @Override isiEnergi(int jumlah)
    // Tambah energi sampai max 100%.
    // Tampilkan pesan peningkatan energi.
    @Override
    public void isiEnergi(int jumlah) {
        int energiBaru = getLevelEnergi() + jumlah;
        if (energiBaru > 100) {
            energiBaru = 100;
        }
        setLevelEnergi(energiBaru);
        System.out.println("Energi meningkat! Level sekarang: " + getLevelEnergi() + "%");
    }

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void tembakRudal(int jumlah)
    // - Jika jumlahRudal cukup → kurangi dan tampilkan:
    // "Menembakkan [jumlah] rudal!"
    // - Jika tidak cukup → tampilkan pesan gagal.
    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal menembak! Sisa rudal hanya " + jumlahRudal);
        }
    }
}
