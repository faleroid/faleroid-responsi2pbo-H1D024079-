public class UjiGalaksi {
    public static void main(String[] args) {

        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // TODO:
        // Buat objek PesawatTempur dengan:
        // nama: "Astra-Fury"
        // kapasitas: 2
        // jumlahRudal: 8
        PesawatTempur pesawat = new PesawatTempur("Astra-Fury", 2, 8);

        // TODO:
        // Buat objek KapalEksplorasi dengan:
        // nama: "Voyager X"
        // kapasitas: 10
        // modulScan: 4
        KapalEksplorasi kapal = new KapalEksplorasi("Voyager X", 10, 4);

        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        // TODO:
        // Aktifkan mesin pesawat
        // Pesawat menjelajah 10 km
        // Pesawat menjelajah 30 km
        // Pesawat menembak 3 rudal
        // Tampilkan status pesawat
        System.out.println("=== UJI PESAWAT TEMPUR ===");
        pesawat.aktifkanMesin();
        pesawat.jelajah(10);
        pesawat.jelajah(30);
        pesawat.tembakRudal(3);
        pesawat.tampilStatus();

        // TODO:
        // Aktifkan mesin kapal eksplorasi
        // Kapal menjelajah 15 km
        // Kapal melakukan scanPlanet("Kepler-442b")
        // Tampilkan status kapal
        System.out.println("\n=== UJI KAPAL EKSPLORASI ===");
        kapal.aktifkanMesin();
        kapal.jelajah(15);
        kapal.scanPlanet("Kepler-442b");
        kapal.tampilStatus();

    }
}
