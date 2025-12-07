public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    // private int modulScan // kemampuan scan planet (level 1–5)
    private int modulScan;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    // - namaKendaraan
    // - kapasitasPenumpang
    // - modulScan
    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 15 → "Energi tidak mencukupi untuk memulai ekspedisi!"
    // Jika cukup → "Kapal eksplorasi siap berangkat!"
    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    // @Override jelajah(int jarak)
    // Konsumsi energi: 2% per 1 km (lebih efisien).
    // Jika cukup → kurangi energi & tampilkan jarak perjalanan.
    @Override
    public void jelajah(int jarak) {
        int kebutuhanEnergi = jarak * 2;
        if (getLevelEnergi() >= kebutuhanEnergi) {
            setLevelEnergi(getLevelEnergi() - kebutuhanEnergi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak cukup untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    // @Override isiEnergi(int jumlah)
    // Tambah energi secara bertahap sampai 100%.
    // Tampilkan pesan pengisian.
    @Override
    public void isiEnergi(int jumlah) {
        int energiBaru = getLevelEnergi() + jumlah;
        if (energiBaru > 100) {
            energiBaru = 100;
        }
        setLevelEnergi(energiBaru);
        System.out.println("Mengisi energi kapal... Energi sekarang: " + getLevelEnergi() + "%");
    }

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void scanPlanet(String namaPlanet)
    // Tampilkan:
    // "Melakukan scan pada planet [namaPlanet] dengan modul level [modulScan]."
    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}
