public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi
    private String namaPenyedia;
    private double saldo;
    private double nominalTransaksi;

    // TODO: Buat constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaPenyedia, double saldo) {
        this.namaPenyedia = namaPenyedia;
        this.saldo = saldo;
    }

    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod
    @Override
    public void processPayment(double amount) {
        this.nominalTransaksi = amount;
        double totalCost = amount + getTransactionFee(); // Biaya transaksi diperhitungkan

        // Catatan:
        // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
        // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
        // - Jika saldo tidak cukup, tampilkan pesan gagal
        if (saldo >= totalCost) {
            saldo -= totalCost;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak mencukupi.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaPenyedia;
    }

    @Override
    public double getTransactionFee() {
        return 2000; // Sesuai perhitungan output: 150000 - 50000 - 98000 = 2000
    }

    @Override
    public double getBalance() {
        return saldo;
    }

}
