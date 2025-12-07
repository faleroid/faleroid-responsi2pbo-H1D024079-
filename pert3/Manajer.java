// Gunakan keyword untuk mewarisi class Karyawan
public class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    double tunjangan;

    // Constructor
    Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Method Override tampilInfo
    @Override
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok + " | Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp " + (gajiPokok + tunjangan));
    }
}