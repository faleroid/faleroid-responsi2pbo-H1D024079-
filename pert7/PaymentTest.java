public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        //
        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transaksi

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment eWallet = new EWalletPayment("OVO", 150000);
        System.out.println("Saldo awal: " + (int) eWallet.getBalance());

        System.out.println("Memproses pembayaran sebesar 50000...");
        System.out.println(); // Space to match screenshot if needed, or just let it be. Screenshot separates
                              // processing and result? Top block vs bottom block. No, it's sequential.
        // Wait, screenshot has a break line (graphical).

        eWallet.processPayment(50000);
        System.out.println("Sisa saldo: " + (int) eWallet.getBalance());
        System.out.println("Detail Transaksi: " + eWallet.getPaymentDetails());

    }
}
