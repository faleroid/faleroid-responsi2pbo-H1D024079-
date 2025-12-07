public class PaymentTest {

    public static void main(String[] args) {

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment eWallet = new EWalletPayment("OVO", 150000);
        System.out.println("Saldo awal: " + (int) eWallet.getBalance());

        System.out.println("Memproses pembayaran sebesar 50000...");
        System.out.println();

        eWallet.processPayment(50000);
        System.out.println("Sisa saldo: " + (int) eWallet.getBalance());
        System.out.println("Detail Transaksi: " + eWallet.getPaymentDetails());

    }
}
