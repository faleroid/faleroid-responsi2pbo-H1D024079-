import java.util.Arrays;
import java.util.Comparator;

public class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] inventaris = new defaultMesin[5];

        // Isi array dengan objek mesinMotor
        inventaris[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventaris[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);

        // Isi array dengan objek mesinTraktorListrik
        inventaris[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        inventaris[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        inventaris[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for (defaultMesin m : inventaris) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin m : inventaris) {
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin tertinggi = inventaris[0];
        for (defaultMesin m : inventaris) {
            if (m.nilaiPerforma() > tertinggi.nilaiPerforma()) {
                tertinggi = m;
            }
        }
        System.out.println(tertinggi.namaMesin + " -> " + tertinggi.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        Arrays.sort(inventaris, new Comparator<defaultMesin>() {
            @Override
            public int compare(defaultMesin m1, defaultMesin m2) {
                return Double.compare(m2.nilaiPerforma(), m1.nilaiPerforma());
            }
        });

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + inventaris[i].namaMesin + " -> " + inventaris[i].nilaiPerforma());
        }
    }
}
