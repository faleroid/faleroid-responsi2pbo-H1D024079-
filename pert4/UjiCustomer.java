public class UjiCustomer {
    public static void main(String[] args) {
        // TODO: Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // TODO: Buat object Customer
        Customer c = new Customer("Budi Santoso", "CST-001", 500000);

        // TODO: Tampilkan info untuk Customer biasa
        System.out.println("Status: Customer Biasa");
        c.tampilkanInfo();

        System.out.println(); // Spasi

        // TODO: Buat object Member
        Member m = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // TODO: Tampilkan info untuk pelanggan Member
        System.out.println("Status: Member");
        m.tampilkanInfo();
    }
}
